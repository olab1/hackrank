package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
//haha it is me
public class Test {

    private static Random rnd;


    static {
        rnd = new Random();
    }

    //dadada
    static List<String> testArrayList;
    static List<String> testLinkedList;
    public static final int COUNT_OBJ = 2000000;

    public static void main(String[] args) {
         Double a = 310.9-82.41;
         System.out.println(a);

    }


    public static void insertSomeDummyData(List<String> list) {
        for (int i = COUNT_OBJ; i-- > 0; ) {
            list.add(new String("" + i));
        }
    }

    public static void checkInsertionPerformance(List<String> list) {

        long startTime, finishedTime;
        startTime = System.currentTimeMillis();
        int rndIndex;
        for (int i = 200; i-- > 0; ) {
            rndIndex = rnd.nextInt(100000);
            list.add(rndIndex, "test");
        }
        finishedTime = System.currentTimeMillis();
        System.out.println(String.format("%s time passed at insertion:%d", list.getClass().getSimpleName(), (finishedTime - startTime)));
    }

    public static void checkPerformanceForFinding(List<String> list) {

        long startTime, finishedTime;
        startTime = System.currentTimeMillis();
        int rndIndex;
        for (int i = 200; i-- > 0; ) {
            rndIndex = rnd.nextInt(100000);
            list.get(rndIndex);
        }
        finishedTime = System.currentTimeMillis();
        System.out.println(String.format("%s time passed at searching:%d", list.getClass().getSimpleName(), (finishedTime - startTime)));

    }
 }