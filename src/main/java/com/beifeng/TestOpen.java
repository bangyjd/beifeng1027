package com.beifeng;

import com.beifeng.util.HdfsUtil;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestOpen {
    public static void main(String[] args) throws IOException {
        test1();
    }

    static void test1() throws IOException {
        //相当于命令hdfs dfs -cat
        FileSystem fs = HdfsUtil.getFileSystem();
        InputStream is = fs.open(new Path("/beifeng/api/1.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        is.close();
        fs.close();
    }
}
