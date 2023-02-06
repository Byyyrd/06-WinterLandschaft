package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Lamp extends GraphicalObject {
    double scale;
    SunAndMoon sunAndMoon;
    public Lamp(double x, double y,double scale,SunAndMoon sunAndMoon) {
        this.x = x;
        this.y = y;
        this.scale = scale;
        this.sunAndMoon = sunAndMoon;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledRectangle(x,y-scale*5,scale,scale*5);
        drawTool.drawFilledRectangle(x-scale/4,y,scale*1.5,scale/5);
        if (sunAndMoon.rotation < Math.PI){
            drawTool.setCurrentColor(new Color(255, 216, 0));
            drawTool.drawFilledCircle(x+scale/2,y-scale*4.5,scale);
        }else {
            drawTool.setCurrentColor(new Color(255,255,255));
            drawTool.drawFilledCircle(x+scale/2,y-scale*4.5,scale);
        }


    }

}
