package com.kongzhong.mrpc.demo.service;

import com.kongzhong.mrpc.demo.model.Person;
import com.kongzhong.mrpc.utils.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * @author biezhi
 *         2017/4/19
 */
public interface UserService {

    int add(int a, int b);

    String hello(String name);

    Person savePerson(String fullName, Integer age);

    Person save(Person person);

    Long delete(Long id);

    List<String> strList(List<String> strs);

    Map toMap(Map<String, Integer> map);

    void testArray(String[] strs);

    void testBizExp();

    void testNormalExp();

}