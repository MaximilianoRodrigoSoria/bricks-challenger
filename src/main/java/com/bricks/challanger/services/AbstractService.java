package com.bricks.challanger.services;


import org.springframework.data.domain.Page;

import java.util.List;

public interface AbstractService<R,ID> {
    List<R> readAll();
    R created(R request);
    R read(ID id);
    R update(R request, ID id);
    void delete(ID id);
}