package com.thecodealchemist.jpawithhibernate.dao;

import com.thecodealchemist.jpawithhibernate.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<Audit, Long> {
}
