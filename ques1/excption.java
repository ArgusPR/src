package ques1;

import java.io.File;
import java.io.FileReader;

class runtime_excpt {

    public void run_error() {
        int arr[] = {10,20,30,40,50};
        System.out.println("array element : "+ arr[5]);
    }

    public void run_excpt() {
        int arr[] = { 10, 20, 30, 40, 50 };
        try {
            System.out.println("array element : "+ arr[5]);
        }
        catch (Exception e) {
            System.out.println("\nException caught");
        }
    }

    /*public void compile_error() {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }*/

    public void compile_excpt() {
        try{
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        }
        catch(Exception e) {
            System.out.println("Compile Time Exception Caught..");
        }
    }


}

public class excption {
    public static void main(String[] args){
        runtime_excpt r = new runtime_excpt();
        //r.run_error();
        //r.run_excpt();
        //r.compile_error();
        r.compile_excpt();
    }
}

