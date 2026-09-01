package com.tjetc.entity;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProductTest {
    @Test
    void shouldCreateProduct() {
        BigDecimal price = new BigDecimal("5999.00");
        Product product = new Product(1001L,"华为轻薄笔记本",price,100);

        assertEquals(1001L,product.getId());
        assertEquals("华为轻薄笔记本",product.getName());
        assertEquals(price,product.getPrice());
        assertEquals(100,product.getStock());
    }

}
