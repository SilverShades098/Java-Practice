package Vehicle;

/**
 *
 * @author Student
 */
interface Vehicle {

     void start();
     void stop();
     void applybreaks();
     void setgear(int gear);
     int getgear();
     void accelerate();
     void rightturn();
     void leftturn();
     double showspeed();
}

class Automobile implements Vehicle{
    double speed=0.0;
    int gear=0;
    @Override
    public void start()
    {
        speed=speed+10;
    }
        @Override

     public void stop()
    {
        speed=speed*0;
    }
         @Override

     public void applybreaks()
    {
        System.out.println("you have applied brakes");
        speed=speed-10;
    }    @Override

     public void setgear(int gear)
    {
        this.gear=gear+1;
    }    @Override

     public int getgear()
    {
        return gear;
    }    @Override

     public void accelerate()
    {
        speed=speed+20;
    }    @Override

     public void rightturn()
    {
        System.out.println("you turned right");
    }    @Override

     public void leftturn()
    {
        System.out.println("you turned left");
    }    @Override

     public double showspeed()
    {
        return speed;
    }
    
}