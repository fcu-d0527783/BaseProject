package com.github.xinhui408;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void getType() throws Exception {

        //Arrange
        Triangle triangle = new Triangle( 5, 10, 5);

        //Act
        String result = triangle.getType();

        //Assert
        Assert.assertEquals("不是三角形", result);
    }

}
