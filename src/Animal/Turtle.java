package Animal;

import Cry.NoCry;
import Fly.NoFly;

public class Turtle extends Animal{

    public Turtle(){			// Turtle 객체 생성자
        cry = new NoCry();	// Animal의 cry 변수에 Cry 인터페이스의 CryNoWay를 연결한다.
        fly = new NoFly();	// Animal의 fly 변수에 Fly 인터페이스의 FlyNoWay를 연결한다.
    }

    public void display(){			 // display 함수 구현
        System.out.println("꼬북!");	// 거북이 출력
    }
}
