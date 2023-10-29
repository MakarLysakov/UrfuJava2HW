package ru.lysakov.lab2.service;

import org.springframework.stereotype.Service;
import ru.lysakov.lab2.model.Response;

@Service
public interface ModifyResponseService {
    Response modify (Response response);
}
