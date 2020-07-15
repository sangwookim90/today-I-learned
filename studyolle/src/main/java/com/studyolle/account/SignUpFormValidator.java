package com.studyolle.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor //private final에 대한 생성자를 만들어 줌
public class SignUpFormValidator implements Validator {

    private final AccountRepository accountRepository;

//    public SignUpFormValidator(AccountRepository accountRepository){
//        this.accountRepository = accountRepository;
//    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.isAssignableFrom(SignUpForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        SignUpForm signUpForm = (SignUpForm)errors;
        if(accountRepository.existsByEmail(signUpForm.getEmail())) {
            errors.rejectValue("email","invalid.email", new Object[]{signUpForm.getEmail()},"이미 사용중인 email주소 입니다.");
        }

        if(accountRepository.existsByNickname(signUpForm.getNickname())) {
            errors.rejectValue("nickname","invalid.nickname", new Object[]{signUpForm.getNickname()}, "이미 사용중인 닉네임 입니다.");
        }
    }
}
