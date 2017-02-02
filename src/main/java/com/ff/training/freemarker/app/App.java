package com.ff.training.freemarker.app;

import com.ff.training.freemarker.core.Model;
import com.ff.training.freemarker.core.Service;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class App {

    private Service service = new Service();

    public void execute() {
        populateModel();
    }

    private void populateModel() {
        Configuration configuration = prepareConfiguration();
        // Where do we load the templates from:
        configuration.setClassForTemplateLoading(App.class, "/templates");

        try {
            Template template = configuration.getTemplate("commonTemplate.ftl");

            // Console output
          //  Writer out = new OutputStreamWriter(System.out);
           // template.process(prepareData(), out);
           // out.flush();

            Writer out = new StringWriter();
            template.process(prepareData(), out);
            //out.flush();
            System.out.println(out.toString());

        } catch (IOException | TemplateException e) {
            throw new RuntimeException(e);
        }
    }

    private Configuration prepareConfiguration() {
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        configuration.setLogTemplateExceptions(false);
        return configuration;
    }

    private Map<String, Object> prepareData() {
        Model model = service.getModel();
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("model", model);
        return data;
    }
}
