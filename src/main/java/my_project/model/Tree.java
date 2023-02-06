package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {
    private double scale;

    public Tree(double x, double y, double scale) {
        this.x = x;
        this.y = y;
        this.scale = scale;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(49, 17, 2));
        drawTool.drawFilledRectangle(x, y - scale * 5, scale, scale * 5);
        drawTool.setCurrentColor(new Color(39, 93, 5));
        drawTool.drawFilledCircle(x + scale / 2, y - scale * 4.5, scale);
    }

    

}
