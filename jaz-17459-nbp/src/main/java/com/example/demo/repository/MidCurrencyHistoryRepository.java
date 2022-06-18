package com.example.demo.repository;

import com.example.demo.entity.MidCurrencyHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MidCurrencyHistoryRepository extends JpaRepository<MidCurrencyHistory, Long> {
}
