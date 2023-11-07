package ru.lysakov.lab2.service;

import org.springframework.stereotype.Service;
import ru.lysakov.lab2.model.Request;
@Service
public interface ModifyRequestService {
    void modify(Request request);
}
