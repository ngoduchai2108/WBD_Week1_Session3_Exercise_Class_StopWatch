package com.code;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = new int[100000];
        for (int i=0; i< 100000;i++){
            arr[i] = (int) Math.floor(Math.random()*100000);
        }
        //Start
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
//        System.out.println(stopWatch.getStartTime());

        //Selection sort
        for(int i = 0; i < arr.length-1;i++){
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length;j++){
                if (arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        //End
        stopWatch.stop();
//        System.out.println(stopWatch.getEndTime());
        System.out.println("Start time: "+ stopWatch.getStartTime());
        System.out.println("Start time: "+ stopWatch.getEndTime());
        System.out.println("Elapse time: "+stopWatch.getElapsedTime());
    }

}
