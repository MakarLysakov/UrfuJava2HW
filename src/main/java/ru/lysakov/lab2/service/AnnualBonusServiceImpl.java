package ru.lysakov.lab2.service;

import org.springframework.stereotype.Service;
import ru.lysakov.lab2.model.Positions;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService{
    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays){
        return salary * bonus * 365 * positions.getPositionCoefficient() / workDays;
    }
}
