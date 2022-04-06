package com.mark.avsp.router.controllers;

import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

public class BaseController {
        final static String VIEW_NAME = "layouts/app";
        final static String DATA = "data";
        final static String ROUTE = "route";

        <T> ModelAndView getDefaultModelAndView(
                Map<String, Object> model,
                Iterable<T> data,
                String route) {
            model.put(DATA, data);
            return getDefaultModelAndView(model, route);
        }

        ModelAndView getDefaultModelAndView(
                Map<String, Object> model,
                String route) {
            model.put(ROUTE, route);
            return new ModelAndView(VIEW_NAME, model);
        }

    }
