package Animal;

import Cry.*;
import Fly.*;

public abstract class Animal {

    protected Fly fly;				// Fly 인터페이스 선언
    protected Cry cry;				// Cry 인터페이스 선언

    public Animal(){}               // Animal 생성자

    public void performFly(){		// Fly 인터페이스에 연결된 객체의 fly() 함수 실행
        fly.fly();
    }

    public void performCry(){		// Cry 인터페이스에 연결된 객체의 Cry() 함수 실행
        cry.cry();
    }

    public void move(){				// move() 함수 구현
        System.out.println("moving");	// 움직인다 출력
    }

    public abstract void display();		// display() 함수 추상

    public Fly getFly() { return fly; }
    public void setFly(Fly fly) { this.fly = fly; }

    public Cry getCry() { return cry; }
    public void setCry(Cry cry) { this.cry = cry; }

}
