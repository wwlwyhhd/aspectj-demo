package byh.ryd.wwl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transactionproxyfailed")
// TODO: 2022/6/18 打开注解会,用log记录日志就会报错的
//@Slf4j
public class TransactionProxyFailedController {
    private static final Logger log = LoggerFactory.getLogger(TransactionProxyFailedController.class);

    @Autowired
    private UserService userService;

    @GetMapping("privateRollback")
    public int privateRollback(@RequestParam("name") String name) {
//        log.info("报错")
        return userService.createUserWrong1(name);
    }



}
