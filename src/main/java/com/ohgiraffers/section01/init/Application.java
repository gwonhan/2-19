package com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {

        /*수업목표. 객체 배열에 대해 이해할 수 있다.*/

        /*필기.
        *  객체배열은 레퍼런스 변수에 대한 배열이다
        *  생성한 인스턴스도 배열을 이용해서 관리하면
        *  동일한 타입의 여러개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다
        *  또한 반환값은(return) 1개의 값만 반환할 수 있기 때문에
        *  동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체 배열을 이용할 수 있다.
        *   */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보루", 380);
        Car car3 = new Car("부가티", 390);
        Car car4 = new Car("롤스로이스", 400);
        Car car5 = new Car("모닝", 470);

        car1.driverMaxSpeed();
        car2.driverMaxSpeed();
        car3.driverMaxSpeed();
        car4.driverMaxSpeed();
        car5.driverMaxSpeed();

        System.out.println("====================================");

        Car[] carArray = new Car[5];

        carArray[0] = new Car("페라리",300);
        carArray[1] = new Car("람보루",380);
        carArray[2] = new Car("부가티",390);
        carArray[3] = new Car("롤스로이스",400);
        carArray[4] = new Car("모닝",470);

        for (int i = 0; i < carArray.length; i++){
            carArray[i].driverMaxSpeed();


        }

        /*필기. 객체 배열도 마찬가지로 할당과 동시에 초기화를 할 수 있다.*/
        Car[] carArray2 = {
                 new Car("페라리",2300)
                ,new Car("람보",100)
                ,new Car("롤스로",300)
                ,new Car("부가티",400)
                ,new Car("맥모닝",500)

        };
//        향상된 for 문도 사용이 가능하다.

        for (Car c : carArray2){
            c.driverMaxSpeed();
        }

    }
}
