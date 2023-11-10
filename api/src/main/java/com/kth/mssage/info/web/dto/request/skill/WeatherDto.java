package com.kth.mssage.info.web.dto.request.skill;

import com.kth.mssage.info.web.dto.request.ParamDto;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class WeatherDto extends ParamDto {

    private final String location;

}
