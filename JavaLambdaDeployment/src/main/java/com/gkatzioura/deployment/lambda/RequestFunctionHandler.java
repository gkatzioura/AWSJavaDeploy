package com.gkatzioura.deployment.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by gkatzioura on 9/10/2016.
 */
public class RequestFunctionHandler implements RequestHandler<Map<String,String>,String> {

    private static final Logger LOGGER = Logger.getLogger(RequestFunctionHandler.class.getName());

    public String handleRequest(Map <String,String> values, Context context) {

        LOGGER.info("Handling request");

        return "You invoked a lambda function";
    }

}
