package hw2_task2;

public class Divide extends Operator{
    public void execute(int anothervalue){
        if(anothervalue == 0){
            System.out.println("can't divide by zero");
        }
        else{
            initialValue/=anothervalue;
        }
    }
}
