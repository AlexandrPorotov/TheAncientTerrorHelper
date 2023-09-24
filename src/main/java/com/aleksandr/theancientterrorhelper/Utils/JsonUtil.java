package com.aleksandr.theancientterrorhelper.Utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@UtilityClass
public final class JsonUtil {

    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .registerModule(new JavaTimeModule());

    public static HttpMessageConverter<?> getMessageConverter() {
        return new MappingJackson2HttpMessageConverter(OBJECT_MAPPER);
    }

    @SneakyThrows
    public static <T> T readJson(String json, Class<T> clazz) {
        return OBJECT_MAPPER.readValue(json, clazz);
    }

    @SneakyThrows
    public static <T> T readJsonFromFile(String path, Class<T> clazz) {
        return OBJECT_MAPPER.readValue(new File(path), clazz);
    }

    @SneakyThrows
    public static String writeAsString(Object value) {
        return OBJECT_MAPPER.writeValueAsString(value);
    }

    @SneakyThrows
    public static String readRawJsonFromFile(String path) {
        return Files.readString(Path.of(path));
    }
}
