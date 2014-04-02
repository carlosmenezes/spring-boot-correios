package com.fireball.springbootcorreios.external

import com.fireball.springbootcorreios.external.resources.PostalServiceHistory

import feign.RequestLine;

/**
 * Created by carlos on 27/03/14.
 */
public interface PostalServiceApi {

	@RequestLine("POST /sroii_xml.eventos")
	PostalServiceHistory getHistory(PostalServiceRequest request)

}