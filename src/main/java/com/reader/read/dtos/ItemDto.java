package com.reader.read.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    @JsonIgnore
    private Long id;
    private ConditionDto conditionDto;
    private WeaponTypeDto weaponTypeDto;
    private NamingDto namingDto;
    private Boolean active;
    private Boolean st;
    private Boolean souvenir;
}
