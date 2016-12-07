package com.subbu.patterns.test;

import com.subbu.patterns.fix.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devsu04 on 07/12/16.
 */
public class ShapeFixTest {

    private Shape shape;
    private GraphicEditor graphicEditor = new GraphicEditor();

    @Test
    public void testCircle(){
        shape = new Circle();
        Assert.assertEquals("drawing a circle...",graphicEditor.drawShape(shape));
    }

    @Test
    public void testSquare(){
        shape = new Square();
        Assert.assertEquals("drawing a square...",graphicEditor.drawShape(shape));
    }

    @Test
    public void testRectangle(){
        shape = new Rectangle();
        Assert.assertEquals("drawing a rectangle...",graphicEditor.drawShape(shape));
    }
}
