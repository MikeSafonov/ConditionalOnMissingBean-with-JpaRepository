package com.example.demo.two;

import com.example.demo.BaseRepository;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

/**
 * @author Mike Safonov
 */
@ConditionalOnMissingBean(value = BaseRepository.class, ignored = TwoBaseRepository.class)
public interface TwoBaseRepository extends BaseRepository {

}
