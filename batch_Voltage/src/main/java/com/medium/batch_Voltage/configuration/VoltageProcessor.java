package com.medium.batch_Voltage.configuration;

import java.math.BigDecimal;

import org.springframework.batch.item.ItemProcessor;

import com.medium.batch_Voltage.dao.entity.Voltage;

public class VoltageProcessor implements ItemProcessor<Voltage, Voltage>{
    @Override
    public Voltage process(final Voltage voltage) {
    	
        final BigDecimal volt = voltage.getVolt();
        final double time = voltage.getTime();
        final Voltage processedVoltage = new Voltage();
        processedVoltage.setVolt(volt);
        processedVoltage.setTime(time);
        
        return processedVoltage;
    }
}