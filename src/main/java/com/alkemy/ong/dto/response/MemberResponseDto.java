
package com.alkemy.ong.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public interface MemberResponseDto {

    Long getId();
    String getName();
            
   }
