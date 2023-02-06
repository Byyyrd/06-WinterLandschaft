package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sky extends GraphicalObject {
    SunAndMoon sunAndMoon;
    public Sky() {
    }

    @Override
    public void draw(DrawTool drawTool) {
        //Himmel
        drawTool.setCurrentColor(new Color(0, 3, (int) (sunAndMoon.getRotation()*40.5)));
        drawTool.drawFilledRectangle(0,0,1200,400);
    }

    public void setMoon(SunAndMoon sunAndMoon) {
        this.sunAndMoon = sunAndMoon;
    }
}
