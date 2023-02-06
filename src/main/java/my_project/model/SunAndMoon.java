package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class SunAndMoon extends GraphicalObject {
    double rotation;
    public SunAndMoon(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.getGraphics2D().rotate(rotation,x,y);
        drawTool.setCurrentColor(new Color(255, 231, 113));
        drawTool.drawFilledCircle(x - 500,y,75);
        drawTool.setCurrentColor(new Color(255, 216, 0));
        drawTool.drawFilledCircle(x + 500,y,75);
        drawTool.getGraphics2D().rotate(-rotation,x,y);
    }

    @Override
    public void update(double dt) {
        rotation+= dt;
        if (rotation > 2*Math.PI){
            rotation = 0;
        }
    }

    public double getRotation() {
        return rotation;
    }
}
