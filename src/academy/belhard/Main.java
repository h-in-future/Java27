package academy.belhard;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(1,2,3);
        box1.depth = 12;
        box1.height = 2;
        box1.width = 3;

        int volume1 = box1.width * box1.height * box1.depth;
        System.out.println("Объем коробки №1 = " + volume1);
        int fullsquare1= box1.width*box1.height*2+box1.width*box1.depth*2+box1.height*box1.depth*2;
        System.out.println("Полная площадь коробки №1 = " + fullsquare1);
        Box mybag=new Box(1,71,56);
        mybag.depth=4;
        mybag.width=7;
        mybag.height=6;
        int volume2 = mybag.width * mybag.height * mybag.depth;
        System.out.println("Объем коробки №2 = " + volume2);
        int fullsquare2= mybag.width*mybag.height*2+mybag.width*mybag.depth*2+mybag.height*mybag.depth*2;
        System.out.println("Полная площадь коробки №2 = " + fullsquare2);
        // ... создайте еще 1 объект типа Box,
        // заполните его свойства,
        // расчитайте объем и выведите на консоль
    }
}
