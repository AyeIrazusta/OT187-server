
package com.alkemy.ong.controller;


import com.alkemy.ong.dto.MemberCreationDto;
import com.alkemy.ong.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/members")
@Api(value = "Miembros controller")
public class MemberController {
 private final MemberService iMemberService;
    private final MessageSource messageSource;

    @Autowired
    public MemberController(MemberService iMemberService, MessageSource messageSource) {
        this.iMemberService = iMemberService;
        this.messageSource = messageSource;
    }


    @PostMapping
    @ApiOperation("Create a member")
    @ApiResponses({
          @ApiResponse(code = 200, message = "Successful Operation"),
          @ApiResponse(code = 404, message = "Bad Request")
        })
    public ResponseEntity<?> createMember(@Valid @ModelAttribute(name = "memberCreationDto") MemberCreationDto memberCreationDto){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(iMemberService.createMember(memberCreationDto));
        }catch (Exception e){
            return  ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }



    

}

