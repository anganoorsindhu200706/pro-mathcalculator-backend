package com.promathcalculator.backend.repository;

import com.promathcalculator.backend.model.History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<History, Long> {
}