package com.example.user_management.utils

import java.util.regex.Matcher
import java.util.regex.Pattern

class Email{
    fun emailValidation(email: String?):Boolean{
        val expression="^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$"
        val pattern: Pattern= Pattern.compile(expression,Pattern.CASE_INSENSITIVE)
        val matcher: Matcher=pattern.matcher(email.toString())
        return matcher.matches()
    }
}