public class CarsAssemble {

    public double productionRatePerHour(int speed) {
    double successRate = 0;
        if(speed >= 1 && speed <= 4) 
            successRate = 100/100.0;
        if(speed >= 5 && speed <= 8)
            successRate = 90/100.0;
        if(speed == 9) 
            successRate = 80/100.0;
        if(speed == 10) 
            successRate = 77/100.0;
        return speed * successRate * 221;
    }
    public int workingItemsPerMinute(int speed){
        return (int) (productionRatePerHour(speed) / 60);
    }
}
