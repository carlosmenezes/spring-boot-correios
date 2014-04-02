package com.fireball.springbootcorreios.services

import org.jboss.logging.Slf4jLogger;
import org.springframework.stereotype.Component

import com.fireball.springbootcorreios.external.PostalServiceApi;

import feign.Feign;
import feign.sax.SAXDecoder;

/**
 * Created by carlos on 27/03/14.
 */
@Component
class PostalServiceQueryService {

    def updateStatus(aPackage) {

    }
	
	def postalServiceApi() {
		return Feign.builder()
			.logger(new Slf4jLogger())
//			.decoder(SAXDecoder.builder().)
			.target(PostalServiceApi, "http://websro.correios.com.br/sro_bin")
	}

}
