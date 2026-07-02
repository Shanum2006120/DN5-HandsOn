package com.cognizant.orm_learn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnFindCountryApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(OrmLearnFindCountryApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(OrmLearnFindCountryApplication.class, args);

        countryService = context.getBean(CountryService.class);

        testFindCountryByCode();
    }

    private static void testFindCountryByCode() {

        LOGGER.info("Start");

        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.info("Country = {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info("End");
    }
}