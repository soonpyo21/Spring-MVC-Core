package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";

        System.out.println("name = " + name);
        log.info(" info log=" + name); // 쓸모없는 리소스가 사용된다.

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log ={}", name);
        log.warn(" warn log ={}", name);
        log.error("error log ={}", name);

        return "ok";

    }
}
