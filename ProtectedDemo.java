import java.io.*;
import java.util.*;
 class Sample{
    protected String job;
    }
public class ProtectedDemo{

    public static void main(String args[]){
        Sample s=new Sample();
        s.job="manager";
        System.out.println(" job is "+s.job);
    }
}
