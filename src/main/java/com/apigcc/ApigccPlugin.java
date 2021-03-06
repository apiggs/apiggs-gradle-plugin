package com.apigcc;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import java.util.HashMap;
import java.util.Map;

public class ApigccPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        Map<String, Object> attrs = new HashMap<>();
        attrs.put("name", "apigcc");
        attrs.put("type", ApigccTask.class);
        attrs.put("group", "Documentation");
        project.getTasks().create(attrs);
    }
}
