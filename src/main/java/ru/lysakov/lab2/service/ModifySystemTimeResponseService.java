package ru.lysakov.lab2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import ru.lysakov.lab2.model.Response;
import ru.lysakov.lab2.util.DateTimeUtil;

import java.util.Date;


public class ModifySystemTimeResponseService
        implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat()
                .format(new Date()));

        return response;
    }
}
