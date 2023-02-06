package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;


import java.awt.*;
import java.util.Timer;


public class Car extends InteractiveGraphicalObject  {
    double speed;
    Color color;
    boolean end;
    double timer;
    Car car2;
    public Car(double x, double y,double speed,Color color){
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.color = color;
        if (color == Color.RED){
            this.speed = -this.speed;
        }
    }

    public void draw(DrawTool drawTool){
        //Reifen
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledCircle(x+50,y+70,30);
        drawTool.setCurrentColor(148,148,148,255);
        drawTool.drawFilledCircle(x+50,y+70,20);

        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawFilledCircle(x+200,y+70,30);
        drawTool.setCurrentColor(148,148,148,255);
        drawTool.drawFilledCircle(x+200,y+70,20);
        //Auto
        drawTool.setCurrentColor(color);
        drawTool.drawFilledRectangle(x,y,250,70);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y,250,70);

        drawTool.setCurrentColor(color);
        drawTool.drawFilledRectangle(x+50,y-50,140,50);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x+50,y-50,140,50);

        drawTool.setCurrentColor(255,215,0,255);
        drawTool.drawFilledRectangle(x+51,y-10,138,20);

        //Fenster
        drawTool.setCurrentColor(64,224,208,255);
        drawTool.drawFilledRectangle(x+120,y-40,60,40);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x+120,y-40,60,40);

        //Lichter
        drawTool.setCurrentColor(238,221,130,255);
        drawTool.drawFilledCircle(x+250,y+20,10);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawCircle(x+250,y+20,10);

        drawTool.setCurrentColor(255,0,0,255);
        drawTool.drawFilledRectangle(x,y+10,30,20);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(x,y+10,30,20);

        if (end){
            drawTool.setCurrentColor(Color.orange);
            drawTool.drawFilledCircle(600,429,500);
        }
    }
    public void update (double dt) {
        if (end){
            timer += dt;
        }
        if (timer > 3){
            System.out.println("'Leben ist Hart' - Maksym Turianskyi");
            System.exit(10000);
        }
        if (color == Color.RED){
            if ( x < car2.x + 200){
                end = true;
            }
        }
        if (ViewController.isKeyDown(65)) {//Left
            x -= speed * dt;
        }
        if (ViewController.isKeyDown(68)) {//Right
            x += speed * dt;

        }
        if (x > 1250) {
            x = -250;
            ProgramController.sceneIndex++;
            ProgramController.updateScene = true;
        }
        if (x < -252) {
            x = 1248;
            ProgramController.sceneIndex--;
            ProgramController.updateScene = true;
        }
    }
    public void setCar2(Car car2){
        this.car2 = car2;
    }
}
