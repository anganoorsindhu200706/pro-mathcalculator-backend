package com.promathcalculator.backend.controller;

import com.promathcalculator.backend.model.History;
import com.promathcalculator.backend.repository.HistoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@CrossOrigin(origins = "http://localhost:5173")
public class HistoryController {

    private final HistoryRepository repository;

    public HistoryController(HistoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<History> getHistory() {
        return repository.findAll();
    }

    @PostMapping
    public History saveHistory(@RequestBody History history) {
        return repository.save(history);
    }

    @DeleteMapping
    public void clearHistory() {
        repository.deleteAll();
    }
}