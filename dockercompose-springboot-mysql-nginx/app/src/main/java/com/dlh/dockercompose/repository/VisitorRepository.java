package com.dlh.dockercompose.repository;

import com.dlh.dockercompose.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wutao
 * @email wutao56789@gmail.com
 * @date 2019/1/19 17:17
 */
public interface VisitorRepository extends JpaRepository<Visitor,Long> {

    Visitor findByIp(String ip);
}
