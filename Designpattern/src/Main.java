

import creational.factorymethed.Factory;
import creational.factorymethed.JavaVideoFactory;
import creational.factorymethed.Video;

import java.io.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Factory factory=new JavaVideoFactory();
        Video video=factory.produce();
        video.play();
    }

}
