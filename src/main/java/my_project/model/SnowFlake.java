package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

import java.awt.*;

public class SnowFlake extends GraphicalObject {
    double speed;

    public SnowFlake(double x,double y,double speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
        ProgramController.Scene.add(this);
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledCircle(x,y,5);
        drawTool.setCurrentColor(new Color(91, 89, 89));
        drawTool.drawCircle(x,y,5);
    }

    @Override
    public void update(double dt) {
        y  += speed * dt;
        if(y > 800){
            y = -1;
        }

    }
}
