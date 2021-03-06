package com.kongzhong.demo.http;

import com.kongzhong.mrpc.client.RpcClient;
import com.kongzhong.mrpc.demo.model.Person;
import com.kongzhong.mrpc.demo.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author biezhi
 *         2017/4/19
 */
public class HttpClientApplication {

    public static void main(String[] args) {
        RpcClient rpcClient = new RpcClient();
        rpcClient.setTransport("http");

        UserService userService = rpcClient.getProxyBean(UserService.class);

        int sum = userService.add(10, 20);
        System.out.println("add => " + sum);


        Person person = new Person();
        person.setName("王爵nice");

        Person person1 = userService.savePerson("hihihi", 99);
        System.out.println("save result = " + person1);

        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 22);
        Map<String, Integer> rmap = userService.toMap(map);
        System.out.println("toMap => " + rmap);

        userService.testArray(new String[]{"a", "b", "c"});

        userService.testNormalExp();

        userService.testBizExp();

        rpcClient.stop();
    }
}
