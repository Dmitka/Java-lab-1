/**
 * "Земля и верёвка"
 * Решить с использованием класса Circle следующую задачу:
 * Представим, что земля имеет форму идеального шара. Вокруг поверхности земного шара туго натянута верёвка (между ней и
 * поверхностью нет никакого зазора). Кто-то разрезает верёвку в произвольном месте и добавляет кусок верёвки
 * длиной 1 метр. После вставки между поверхностью земли и верёвкой возникает зазор, вызванный увеличением длины.
 * Найти величину этого зазора. Примем за радиус земли расстояние в 6378.1 км
 * "Бассейн"
 * Решить с помощью класса Circle следующую задачу:
 * Необходимо рассчитать стоимость материалов для бетонной дорожки вокруг круглого бассейна, а также стоимость
 * материалов ограды вокруг бассейна (вместе с дорожкой). Стоимость 1 квадратного метра бетонного покрытия 1000 р.
 * Стоимость 1 погонного метра ограды 2000 р. Радиус бассейна 3 м. Ширина бетонной дорожки вокруг бассейна 1 м.
 */
class Circle {
    private Double Radius;
    private Double Ference;
    private Double Area;
    /*public Circle(Double Radius, Double Ference, Double Area)
    {
        this.Radius=Radius; // this.name ссылка на текущий экземпляр класса
        this.Ference=Ference;
        this.Area=Area;
    }*/
    public Circle(){

    }
    public void setRadius(Double Rad){
        Radius=Rad;
        Ference=2*Math.PI*Radius;
        Area=Math.PI*Math.pow(Radius,2);
    }
    public double getRadius(){
        return Radius;
    }
    public void setFerence(Double Fer){
        Ference=Fer;
        Radius=Ference/2/Math.PI;
        Area=Math.PI*Math.pow(Radius,2);
    }
    public double getFerence() {
        return Ference;
    }
    public void setArea(Double Ar){
        Area=Ar;
        Radius=Math.sqrt(Area/Math.PI);
        Ference=2*Math.PI*Radius;
    }
    public double getArea() {
        return Area;
    }
}

public class Zadacha6_CircleDemo {
    public static void main(String[] args) {
        //double arr=Double.parseDouble(args[0]);
        Circle circle_1=new Circle();
        //begin Земля и верёвка
        double arr=6378100;
        circle_1.setRadius(arr); //передаем/устанавливаем радиус Земли
        circle_1.setFerence(circle_1.getFerence()+1); //передаем/устанавливаем длину окружности Земли +1м
        System.out.println(circle_1.getRadius()-arr); //величина зазора
        //end Земля и верёвка

        //begin Бассейн
        double PriceBet=1000; //Стоимость 1 квадратного метра бетонного покрытия 1000 р.
        double PriceOgr=2000; //Стоимость 1 погонного метра ограды 2000 р.
        double WidTrail=1;  //Ширина бетонной дорожки вокруг бассейна 1 м.
        double RPool=3; //Радиус бассейна 3 м.
        double APool; //Площадь бассейна 3 м.
        circle_1.setRadius(RPool);
        APool=circle_1.getArea();
        circle_1.setRadius(RPool+WidTrail);
        System.out.println((circle_1.getArea()-APool)*PriceBet); //стоимость материалов для бетонной дорожки
        System.out.println(circle_1.getFerence()*PriceOgr); //стоимость материалов ограды вокруг бассейна (вместе с дорожкой)
        //end Бассейн
    }
}
