package example;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import example.models.ExampleModelBase;
import example.models.ExampleModelVersion1;
import example.models.ExampleModelVersion2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY);

        Arrays.asList("model1.json", "model2.json").forEach(fileName -> {
            try {
                ExampleModelBase base = mapper.readValue(readJson(fileName), ExampleModelBase.class);
                if ( base instanceof ExampleModelVersion1 ) {
                    handleVersion1(fileName, (ExampleModelVersion1)base);
                } else if ( base instanceof ExampleModelVersion2 ) {
                    handleVersion2(fileName, (ExampleModelVersion2)base);
                } else {
                    throw new RuntimeException("Unknown model: "+ base);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void handleVersion1(String fileName, ExampleModelVersion1 version1) {
        System.out.println(fileName + " is version 1");
        System.out.println(version1);
        System.out.println();
    }

    private static void handleVersion2(String fileName, ExampleModelVersion2 version2) {
        System.out.println(fileName + " is version 2");
        System.out.println(version2);
        System.out.println();
    }

    private static String readJson(String name) {
        try {
            return Resources.toString(Resources.getResource(name), Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
