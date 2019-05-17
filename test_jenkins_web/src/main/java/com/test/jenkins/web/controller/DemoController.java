package com.test.jenkins.web.controller;

import com.alipay.api.domain.Product;
import com.github.raoyu001.hello.HelloService;
import com.test.jenkins.biz.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.RouterFunction;

import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.EntityResponse.fromPublisher;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @Resource
    private HelloService helloService;

    @RequestMapping("/1")
    public String demo1() {
        return demoService.demo();
    }

    @RequestMapping("/2")
    public Mono<String> demo2() {
        return Mono.just("reactive programming");
    }

    @RequestMapping("/hello/{name}")
    public Mono<String> hello(@PathVariable String name) {
        return Mono.just(helloService.sayHello(name));
    }

    @RequestMapping("/curTime")
    public HandlerFunction<ServerResponse> curTime() {
        // 返回包含时间字符串的ServerResponse
        return request -> ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(
                Mono.just("Now is " + new SimpleDateFormat("HH:mm:ss").format(new Date())), String.class);
    }

    @RequestMapping("/curDate")
    public HandlerFunction<ServerResponse> curDate() {
        // 返回包含日期字符串的ServerResponse
        /*return request -> ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(
                        Mono.just("Today is " + new SimpleDateFormat("yyyy-MM-dd").format(new Date())), String.class);*/
        return request -> ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(
                Mono.just("Today is " + new SimpleDateFormat("yyyy-MM-dd").format(new Date())), String.class);
    }

    /*@Bean
    fun apiRouter() = router {
        (accept(APPLICATION_JSON) and "/api").nest {
            "/book".nest {
                GET("/", bookHandler::findAll)
                GET("/{id}", bookHandler::findOne)
            }
            "/video".nest {
                GET("/", videoHandler::findAll)
                GET("/{genre}", videoHandler::findByGenre)
            }
        }
    }*/

    public RouterFunction<ServerResponse> rout() {

/*        return nest(
                path("/person"),
                nest(accept(APPLICATION_JSON),
                        route(GET("/{id}"), handler::getPerson)
                                .andRoute(method(HttpMethod.GET), handler::listPeople)
                ).andRoute(POST("/").and(contentType(APPLICATION_JSON)), handler::createPerson)
        ).andNest(
                path("/product"),
                route(path("/"), serverRequest ->
                        ServerResponse.ok().contentType(APPLICATION_JSON)
                                .body(Mono.defer(fromPublisher(Flux.just(demoService.demo()), String.class)))
                )
        );*/

        return null;
    }
}