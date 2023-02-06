package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Grass extends GraphicalObject {
    public Grass(){
    }
    public void draw(DrawTool drawTool){
        //Grass
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledRectangle(0,400,1200,400);

    }
}
