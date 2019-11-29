package com.beifeng;

import com.beifeng.util.HdfsUtil;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class TestCopy {
    public static void main(String[] args) throws IOException {
        testCopyFromLocal();
        testCopyToLocal();
    }

    static void testCopyFromLocal() throws IOException {
        FileSystem fs = HdfsUtil.getFileSystem();
        fs.copyFromLocalFile(new Path("f:/4.txt"), new Path("/beifeng/api/3.txt"));
        fs.close();
    }

    static void testCopyToLocal() throws IOException {
        FileSystem fs = HdfsUtil.getFileSystem();
        fs.copyToLocalFile(new Path("/beifeng/api/123.txt"),new Path("f:/5.txt"));
        fs.close();
    }
}
