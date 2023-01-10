package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Street extends GraphicalObject {

    public Street(){

    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(44, 44, 42));
        drawTool.drawFilledRectangle(0,500,1200,200);

        for (int i = 0;i <= 1200;i += 200){
            drawTool.setCurrentColor(new Color(255, 255, 255));
            drawTool.drawFilledRectangle(-25 + i,575,100,50);
        }
    }
}
