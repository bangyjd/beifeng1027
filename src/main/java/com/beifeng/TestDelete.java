package com.beifeng;

import com.beifeng.util.HdfsUtil;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class TestDelete {
    public static void main(String[] args) throws IOException {
        //testDelete();
        testDeleteOnExit();
    }

    static void testDelete() throws IOException {
        FileSystem fs = HdfsUtil.getFileSystem();
        boolean deleted = fs.delete(new Path("/beifeng/api/123.txt"), true);
        System.out.println(deleted);
        deleted = fs.delete(new Path("/beifeng/hdfs/"), false);
        System.out.println(deleted);
        deleted = fs.delete(new Path("/beifeng/api"), false);
        System.out.println(deleted);
        fs.close();
    }

    static void testDeleteOnExit()throws IOException{
        FileSystem fs = HdfsUtil.getFileSystem();
        boolean deleted = fs.delete(new Path("/beifeng/api/1.txt"), true);
        System.out.println("Delete删除"+deleted);
        deleted = fs.deleteOnExit(new Path("/beifeng/api/2.txt"));
        System.out.println("DeleteOnExit删除"+deleted);
        System.in.read();
        fs.close();
    }
}
