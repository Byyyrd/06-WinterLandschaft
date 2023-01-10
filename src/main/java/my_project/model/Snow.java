package my_project.model;

import KAGO_framework.control.Drawable;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

import java.util.ArrayList;

public class Snow extends GraphicalObject {
    public static ArrayList allSnow = new ArrayList<Drawable>();
    public Snow(){
        for(int i = 0;i < 1001;i++){
            allSnow.add(new SnowFlake(Math.random()*1201,i* -1,Math.random()*101+100));
        }
    }

    @Override
    public void draw(DrawTool drawTool) {

    }
}
