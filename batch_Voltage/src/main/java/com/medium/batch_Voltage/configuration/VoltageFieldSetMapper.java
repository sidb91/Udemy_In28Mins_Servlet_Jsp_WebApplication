package com.medium.batch_Voltage.configuration;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;

import com.medium.batch_Voltage.dao.entity.Voltage;

@Component
public class VoltageFieldSetMapper implements FieldSetMapper<Voltage> {
    @Override
    public Voltage mapFieldSet(FieldSet fieldSet) {
        final Voltage voltage = new Voltage();
        voltage.setVolt(fieldSet.readBigDecimal("volt"));
        voltage.setTime(fieldSet.readDouble("time"));
        return voltage;
    }
}
