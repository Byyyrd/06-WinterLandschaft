package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Moon extends GraphicalObject {
    public Moon(){

    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(255, 228, 69));
        drawTool.drawFilledCircle(50,50,75);
    }
}
