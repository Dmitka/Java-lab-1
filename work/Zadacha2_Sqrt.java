/**
 * Задача 2. Квадратный корень числа
 * Реализовать алгоритм вычисления квадратного корня. Взять за основу пример программы.
 * Изменить пример так, чтобы была возможность регулирования точности расчетов.
 */
class Sqrt
{
    //double delta=0.00000001;
    double delta;
    double arg;

    Sqrt(double arg, double delta) {
        this.arg=arg;
        this.delta=delta;
    }
    double average(double x,double y) {
        return (x+y)/2.0;
    }
    boolean good(double guess,double x) {
        return Math.abs(guess*guess-x)<delta;
    }
    double improve(double guess,double x) {
        return average(guess,x/guess);
    }
    double iter(double guess, double x) {
        if(good(guess,x))
            return guess;
        else
            return iter(improve(guess,x),x);
    }
    public double calc() {
        return iter(1.0,arg);
    }
}

class Zadacha2_Sqrt
{
    public static void main(String[] args)
    {
        //double val=7; //число
        //int delta=4; //знаков после разделителя
        double val=Double.parseDouble(args[0]);
        int delta=Integer.parseInt(args[1]);
        double toch=1/Math.pow(10,delta);
        Sqrt sqrt=new Sqrt(val,toch);
        double result=sqrt.calc();
        System.out.println("Sqrt of "+val+"="+result);
    }
}