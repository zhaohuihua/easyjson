package com.jn.easyjson.tests.cases;

import java.util.Date;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.jn.easyjson.core.JSON;
import com.jn.easyjson.core.JSONBuilderProvider;
import com.jn.easyjson.tests.entity.user.Address;
import com.jn.easyjson.tests.entity.user.Gender;
import com.jn.easyjson.tests.entity.user.UserEntity;
import com.jn.easyjson.tests.utils.CompareTools;

/**
 * 基础测试类
 *
 * @author zhaohuihua
 * @version 20200614
 */
@Test
public class EasyJsonBaseTest {
    
    private static JSON json = JSONBuilderProvider.simplest();

    protected UserEntity getUserEntityObject() {
        UserEntity user = new UserEntity();
        user.setId("1001");
        user.setName("Test1");
        user.setGender(Gender.FEMALE);
        user.setPassword("a@b@c");
        user.setWeight(60.5);
        user.setHeight(170);
        user.setBirthday(new Date(1577808000000L));
        user.addAddress(new Address("home", "Nanjing China"));
        user.addAddress(new Address("office", "Beijing China"));
        user.setIntro("This's a test user entity. \"EasyJson\"");
        return user;
    }

    protected String getUserEntityString() {
        return "{\"addresses\":[{\"details\":\"Nanjing China\",\"name\":\"home\"},{\"details\":\"Beijing China\",\"name\":\"office\"}],\"birthday\":1577808000000,\"gender\":\"FEMALE\",\"height\":170,\"id\":\"1001\",\"intro\":\"This's a test user entity. \\\"EasyJson\\\"\",\"name\":\"Test1\",\"password\":\"a@b@c\",\"weight\":60.5}";
    }

    @Test(priority = 10001)
    public void testSerialize10001() {
        UserEntity user = getUserEntityObject();
        String jsonString = json.toJson(user);
        System.out.println(jsonString);
        Assert.assertEquals(jsonString, getUserEntityString());
    }

    @Test(priority = 10002)
    public void testDeserialize10002() {
        String jsonString = getUserEntityString();
        UserEntity actual = json.fromJson(jsonString, UserEntity.class);
        UserEntity expected = getUserEntityObject();
        CompareTools.assertDeepEquals(actual, expected);
    }
}
