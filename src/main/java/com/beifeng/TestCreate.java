package com.beifeng;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestCreate {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
    }

    static void test1() throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://192.168.2.200:9000");
        FileSystem fs = FileSystem.get(conf);
        FSDataOutputStream dos = fs.create(new Path("/beifeng/api/1.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(dos));
        bw.write("北风网视频教学");
        bw.newLine();
        bw.close();
        dos.close();
        fs.close();
    }

    static void test2() throws IOException{
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://192.168.2.200:9000");
        FileSystem fs = FileSystem.get(conf);
        FSDataOutputStream dos = fs.create(new Path("/beifeng/api/1.txt"),(short)1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(dos));
        bw.write("www.beifeng.com");
        bw.close();
        dos.close();
        fs.close();
    }
}
