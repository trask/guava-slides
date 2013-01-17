package com.github.trask.guavaslides.io;

import java.io.File;
import java.io.IOException;

import com.github.trask.guavaslides.Names;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;

public class IOExample {

    public static void main(String[] args) throws IOException {
        String contents = Joiner.on('\n').join(Names.names(5));
        Files.asCharSink(new File("names.txt"), Charsets.UTF_8).write(contents);
        System.out.println(Files.asCharSource(new File("names.txt"), Charsets.UTF_8).read());
    }
}
