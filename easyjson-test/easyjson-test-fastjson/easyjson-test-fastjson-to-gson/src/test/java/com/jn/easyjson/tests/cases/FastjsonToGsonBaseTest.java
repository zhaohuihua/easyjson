package com.jn.easyjson.tests.cases;

import org.testng.annotations.Test;

/**
 * FastjsonToGsonBaseTest基础测试
 *
 * @author zhaohuihua
 * @version 20200614
 */
@Test
public class FastjsonToGsonBaseTest extends EasyJsonBaseTest {

    protected String getUserEntityString() {
        // Gson把'转换成\u0027了
        return "{\"id\":\"1001\",\"name\":\"Test1\",\"gender\":\"FEMALE\",\"password\":\"a@b@c\",\"weight\":60.5,\"height\":170,\"birthday\":1577808000000,\"intro\":\"This\\u0027s a test user entity. \\\"EasyJson\\\"\",\"addresses\":[{\"name\":\"home\",\"details\":\"Nanjing China\"},{\"name\":\"office\",\"details\":\"Beijing China\"}]}";
    }
}
