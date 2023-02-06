package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Snake extends GraphicalObject {

    Image boss;
    public Snake() {
       boss = new ImageIcon("src/main/resources/graphic/R.gif").getImage();
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.getGraphics2D().drawImage(boss,400,100,boss.getWidth(null)*3,boss.getHeight(null)*3,null);
    }
}
