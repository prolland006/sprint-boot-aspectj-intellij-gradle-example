package com.testswing;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MetierProfiler {

    @Pointcut("execution(* *(..))")
    public void fonctionMetier() {}

    @Around("fonctionMetier()")
    public Object profile(ProceedingJoinPoint joinPoint) throws Throwable {
        long debut = System.currentTimeMillis();

        System.out.println("Appelle de la fonction ...");
        Object sortie = joinPoint.proceed();

        System.out.println("Fonction executee avec succes ...");
        long tempsPasse = System.currentTimeMillis() - debut;

        System.out.println("Temps d'exécution de la fonction: "
                + tempsPasse + " milliseconds.");

        return sortie;
    }

}