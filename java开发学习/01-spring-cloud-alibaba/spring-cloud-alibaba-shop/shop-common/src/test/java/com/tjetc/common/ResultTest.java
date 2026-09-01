package com.tjetc.common;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ResultTest {
    //“成功结果”的测试
    @Test
    void shouldCreateSuccessResult() {
        Result<String> result = Result.success("保存成功");

        assertEquals(200, result.getCode());
        assertEquals("操作成功", result.getMessage());
        assertEquals("保存成功", result.getData());
    }
    //“失败结果”的测试
    @Test
    void shouldCreateFailureResult() {
        Result<String> result = Result.fail(404,"商品不存在");
        assertEquals(404, result.getCode());
        assertEquals("商品不存在", result.getMessage());
        assertNull(result.getData());
    }

}
