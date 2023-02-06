package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Cloud extends GraphicalObject {

    public Cloud(double x) {
        this.x = x;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.drawFilledCircle(x,50,50);
        drawTool.drawFilledCircle(x + 70,50,50);
        drawTool.drawFilledCircle(x + 140,50,50);
    }

    @Override
    public void update(double dt) {
        x += dt* 200;
        if (x > 1300){
            x = -200;
        }
    }
}
