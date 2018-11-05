package com.tgram.two.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

/**
 *<p> Description: 自定义切面类 </p>
 *<p> Copyright: Copyright(c) 2018/11/5 </p>
 *<p> Company: 7qb </p>
 *
 *@author JinJiacheng
 *@Version 1.0 2018/11/5 21:34
 *
 * 注意：
 *  1.自定义切面类需要添加@Configuration注解，否则无效
 *  2.使用@Aspect注解来指定类为切面类
 */
@Configuration
@Aspect
public class StudentAop {

    /**
     * 方法环绕通知：
     *  execution(返回值 包名.类名.方法名(参数))
     * @param proceedingJoinPoint 切点参数
     * @return 执行目标方法的返回值
     */
    @Around("execution(* com.tgram.two.service.*.*(..))")
    public Object lgo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("进入切面...");
        System.out.println("执行方法前...");

        // 通过ProceedingJoinPoint#proceed()执行目标方法，并获取目标方法的返回值
        Object proceed = proceedingJoinPoint.proceed();

        System.out.println("执行方法后...");

        return proceed;
    }

}
