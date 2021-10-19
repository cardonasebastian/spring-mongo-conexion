package com.example.chnnmongo.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    private LoggingUtils() {};

    public static <T> String getJsonFormat(T object, boolean beatified) {
        String result = null;
        try {
            if (beatified) {
                result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
            } else {
                result = mapper.writeValueAsString(object);
            }
        } catch (JsonProcessingException jpe) {
            log.error(jpe.getMessage(), jpe);
        }
        return result;
    }
}
