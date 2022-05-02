
package com.alkemy.ong.service;


import com.alkemy.ong.dto.MemberCreationDto;
import com.alkemy.ong.dto.response.MemberResponseDto;

public interface MemberService {

    

    MemberResponseDto createMember(MemberCreationDto member);

    }
