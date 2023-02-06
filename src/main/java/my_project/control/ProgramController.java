package my_project.control;

import KAGO_framework.control.Drawable;
import KAGO_framework.control.ViewController;
import my_project.model.*;

import java.awt.*;
import java.util.ArrayList;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    public static ArrayList<Drawable> Scene = new ArrayList<>();
    public static ArrayList<Drawable> FirstScreen = new ArrayList<>();
    public static ArrayList<Drawable> SecondScreen = new ArrayList<>();
    public static ArrayList<Drawable> ThirdScreen = new ArrayList<>();
    public static ArrayList<Drawable> ForthScreen = new ArrayList<>();
    int timer;
    public static int sceneIndex ;
    public static boolean updateScene;
    public Car car;
    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        viewController.createScene();
        viewController.createScene();
        viewController.createScene();
        viewController.createScene();
        viewController.createScene();

        Sky sky = new Sky();
        Scene.add(sky);
        SunAndMoon sunAndMoon = new SunAndMoon(600,429);
        Scene.add(sunAndMoon);
        sky.setMoon(sunAndMoon);
        Scene.add(new Grass());
        Scene.add(new Street());
        Scene.add(new Cloud(-200));
        Scene.add(new Cloud(-700));
        Scene.add(new Cloud(-1200));
        car = new Car(100,560,500,new Color(255,215,0,255));
        Scene.add(car);

        Scene.add(new Snow());
        for (int i = 0;i < 10;i++) {
            FirstScreen.add(new Tree(i*120+20, 460, 50));
        }
        for (int i = 0; i < 4 ;i++){
            SecondScreen.add(new Lamp(100 + i * 300,460,50,sunAndMoon));
        }
        ThirdScreen.add(new Snake());
        Car car2 = new Car(800,560,500, Color.RED);
        car2.setCar2(car);
        ForthScreen.add(car2);

        for (Drawable d:Scene) {
            viewController.draw(d);
            viewController.draw(d,1);
            viewController.draw(d,2);
            viewController.draw(d,3);
            viewController.draw(d,4);

        }
        for (Drawable d : FirstScreen) {
            viewController.draw(d,0);
        }
        for (Drawable d : SecondScreen) {
            viewController.draw(d,1);
        }
        for (Drawable d : ThirdScreen) {
            viewController.draw(d,2);
        }
        for (Drawable d : ForthScreen) {
            viewController.draw(d,3);
        }


    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
        if (updateScene) {
            viewController.showScene(sceneIndex);
            updateScene = false;
        }
    }
}
