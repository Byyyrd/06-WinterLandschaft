package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {

    public Background(){

    }
    public void draw(DrawTool drawTool){
        //Himmel
        drawTool.setCurrentColor(new Color(0, 3, 96));
        drawTool.drawFilledRectangle(0,0,1200,400);
        //Grass
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledRectangle(0,400,1200,400);

    }
}
