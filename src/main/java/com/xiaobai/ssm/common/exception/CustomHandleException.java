package com.xiaobai.ssm.common.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class CustomHandleException implements HandlerExceptionResolver{
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        // 定义异常信息
        String msg;

        // 判断异常类型
        if (e instanceof MyException) {
            // 如果是自定义异常，读取异常信息
            msg = e.getMessage();
            // TODO 做自行处理
        } else {
            // 如果是运行时异常，则取错误堆栈，从堆栈中获取异常信息
            Writer out = new StringWriter();
            PrintWriter s = new PrintWriter(out);
            e.printStackTrace(s);
            msg = out.toString();

        }

        // 把错误信息发给相关人员,邮件,短信等方式
        // TODO

        // 返回错误页面，给用户友好页面显示错误信息
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", msg);
        modelAndView.setViewName("common/error");

        return modelAndView;

    }
}
