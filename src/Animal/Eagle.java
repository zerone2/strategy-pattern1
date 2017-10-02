package Animal;

import Cry.BirdCry;
import Fly.FlyWithWings;

public class Eagle extends Animal{
    public Eagle(){
        cry = new BirdCry();
        fly = new FlyWithWings();
    }

    public void display(){

        System.out.println("독수리");
    }

}

