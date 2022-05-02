
package com.alkemy.ong.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;;


@Data
public class MemberCreationDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank(message = "{member.error.empty.name}")
    private String name;



}

