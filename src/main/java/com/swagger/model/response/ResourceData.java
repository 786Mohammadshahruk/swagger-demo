package com.swagger.model.response;

import lombok.Data;

@Data
public class ResourceData<T> {
    private T data;
}
