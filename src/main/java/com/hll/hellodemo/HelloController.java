package com.hll.hellodemo;

import com.gsafety.gseai.common.core.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangll
 * @date 2020-04-03
 */
@RestController
public class HelloController {

    @GetMapping("/hello/{word}")
    public Result<String> hello(@PathVariable(name = "word") String word) {
        return Result.<String>builder().success(true).msg("ok").data("hello " + word).build();
    }
}
