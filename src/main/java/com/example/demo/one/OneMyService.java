package com.example.demo.one;

import com.example.demo.MyService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Service;

/**
 * @author Mike Safonov
 */
@Service
@ConditionalOnMissingBean(value = MyService.class, ignored = OneMyService.class)
public class OneMyService implements MyService {

    @Override
    public void doSome() {

    }
}
