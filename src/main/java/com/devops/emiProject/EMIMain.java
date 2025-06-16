package com.devops.emiProject;

import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class EMIMain {
    static final Logger logger=Logger.getLogger(EMIMain.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        double principal=Double.parseDouble(args[0]);
        logger.info("Principal: "+principal);

        double annualRate=Double.parseDouble(args[1]);
        logger.info("Annual Interest Rate: "+annualRate);

        int tenureYears = Integer.parseInt(args[2]);
        logger.info("Tenure (in years): "+tenureYears);

        double emi = calculateEMI(principal,annualRate,tenureYears);
        logger.info("Calculated EMI: "+emi);
    }

    public static double calculateEMI(double principal,double annualRate,int tenureYears) {
        double monthlyRate = annualRate/(12*100);
        int tenureMonths = tenureYears*12;
        return (principal*monthlyRate*Math.pow(1+monthlyRate,tenureMonths)) /
                (Math.pow(1+monthlyRate,tenureMonths)-1);
    }
}

