package com.medium.batch_Voltage.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medium.batch_Voltage.dao.entity.Voltage;

@Repository
public interface IVoltageRepository extends JpaRepository<Voltage, Long> {

}
