package com.beifeng.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;

import java.io.IOException;

public class HdfsUtil {
    public static Configuration getConfiguration(){
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://192.168.2.200:9000");
        return conf;
    }
    public static FileSystem getFileSystem() throws IOException {
        return getFileSystem(getConfiguration());
    }
    public static FileSystem getFileSystem(Configuration conf) throws IOException {
        return FileSystem.get(conf);
    }
}
