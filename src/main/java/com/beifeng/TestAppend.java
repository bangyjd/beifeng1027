package com.beifeng;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class TestAppend {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://192.168.2.200:9000");
        FileSystem fs = FileSystem.get(conf);
        Path path = new Path("/beifeng/api/createNewFile1.txt");
        FSDataOutputStream dos = fs.append(path);
        dos.write("北风网".getBytes());
        dos.close();
        fs.close();
    }
}
