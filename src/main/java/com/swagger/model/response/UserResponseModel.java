package com.swagger.model.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponseModel {
    private MetaData metaData;
    private ResourceData resourceData;
}
