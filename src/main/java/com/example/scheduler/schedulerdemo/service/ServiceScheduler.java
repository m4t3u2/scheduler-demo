package com.example.scheduler.schedulerdemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ServiceScheduler {

	private static final Logger log = LoggerFactory.getLogger(ServiceScheduler.class);
	
	@Scheduled(fixedDelay = 10000) // Milissegundos.
	public void executarDelay() {
		log.info("Executou o Scheduled com delay!");
	}

	@Scheduled(cron = "0 0/1 * * * *") // Cron.
	public void executarCron() {
		log.info("Executou o Scheduled com cron!");
	}

}
