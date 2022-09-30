public class Vehicle {
    int num;
    int fuel = 100;
    int speed = 0;
    int speedChange;
    int maxPassenger;
    String state;

    public Vehicle() {

    }
    void startOperate(String state) {
        this.state = state;
    }

    void speedChange(int speed) {
        this.speed = speed;
    }
    void changeState() {
        if(fuel > 10) {
            this.state = "운행";
        } else {
            this.state = "차고지행";
        }





    }
}
