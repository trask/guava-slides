package com.github.trask.guavaslides;

import static com.google.common.base.Charsets.UTF_8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

import com.google.common.io.ByteStreams;
import com.google.common.io.CharStreams;
import com.google.common.io.Files;

public class Test {

    public static void main(String[] args) throws IOException {
        File file = null;
        Reader reader = null;

        String text = CharStreams.toString(reader);

        Files.asCharSink(file, UTF_8)
                .writeFrom(reader);

        Writer writer = null;

        CharStreams.asCharSource("some text")
                .copyTo(writer);

        Files.asCharSource(file, UTF_8)
                .copyTo(writer);

        InputStream in = null;
        ByteStreams.copy(in, System.out);
    }
}
