package com.fireball.springbootcorreios.external

import com.fireball.springbootcorreios.external.resources.PostalServiceHistory

/**
 * Created by carlos on 27/03/14.
 */
public interface PostalServiceApi {

    PostalServiceHistory getHistory(PostalServiceRequest request)

}