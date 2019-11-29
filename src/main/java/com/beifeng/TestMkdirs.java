package com.beifeng;

import com.beifeng.util.HdfsUtil;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class TestMkdirs {
    public static void main(String[] args) throws IOException {
        test1();
    }

    static void test1() throws IOException {
        FileSystem fs = HdfsUtil.getFileSystem();
        boolean mkdirsed = fs.mkdirs(new Path("/beifeng/api/mkdirs"));
        System.out.println(mkdirsed);
        fs.close();
    }
}
