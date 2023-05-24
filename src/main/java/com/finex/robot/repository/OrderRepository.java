package com.finex.robot.repository;

import com.finex.robot.entity.OrderDomainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderDomainEntity, Long> {
}
