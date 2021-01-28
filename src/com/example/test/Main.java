package com.example.test;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        long singleBucket = (int) Math.ceil(wallArea / areaPerBucket);
        //        int bucketNeeded = (int) (singleBucket - extraBuckets);
        return (int) (singleBucket - extraBuckets);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int)Math.ceil((width*height)/areaPerBucket);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
//        int bucketNeeded = (int) Math.ceil(area/areaPerBucket);
        return (int) Math.ceil(area/areaPerBucket);
    }

}
