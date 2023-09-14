package com.swagger.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "user Entity")
public class UserDto {
    @ApiModelProperty(value = "test")
    private long id;
    @NotEmpty(message = "address should not be null or Empty")
    @Size(max = 10, min = 4, message = "address size should be min 4 and max 10.")
    private String address;
    @JsonProperty("contact_number")
    private String contactNumber;
}
