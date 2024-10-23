package controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

@RestController
public class SseController {

    @GetMapping(path = "/sse", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public SseEmitter suscribe() {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
        return emitter;
    }
}