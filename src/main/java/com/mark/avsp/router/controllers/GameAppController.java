package com.mark.avsp.router.controllers;

import com.mark.avsp.persistence.models.Unit;
import com.mark.avsp.persistence.repositories.UnitRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class GameAppController extends BaseController{
    private static final String ROUTE = "game_app";

    private final UnitRepo unitRepo;

    public GameAppController(UnitRepo unitRepo) {
        this.unitRepo = unitRepo;
    }

    @GetMapping("/app")
    public ModelAndView about(Map<String, Object> model) {
        Iterable<Unit> units = unitRepo.findAll();
        return getDefaultModelAndView(model, ROUTE, units);
    }
}
