import java.io.*;
import java.util.*;
 class Sample{
    private String activity;
    public String task;
}
public class PrivateDemo{

    public static void main(String args[]){
        Sample s=new Sample();
        s.activity="playing";
        s.task="eating";
        System.out.println(" activity is "+s.activity);//returns error when we try to access private
        System.out.println(" task is "+s.task);
    }
}
