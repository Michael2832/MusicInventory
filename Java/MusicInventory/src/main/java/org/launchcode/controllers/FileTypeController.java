package org.launchcode.controllers;

import org.launchcode.models.FileType;
import org.launchcode.models.data.FileTypeDao ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
@RequestMapping("filetype")
public class FileTypeController {

    @Autowired
    private FileTypeDao fileTypeDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("fileType", fileTypeDao.findAll());
        model.addAttribute("title", "FileType");

        return "filetype/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddFileTypeForm(Model model) {
        model.addAttribute("title", "Add FileType");
        model.addAttribute(new FileType());
        return "filetype/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddFileTypeForm(Model model, @ModelAttribute @Valid FileType fileType, Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add FileType");
            return "filetype/add";
        }

        fileTypeDao.save(fileType);
        return "redirect:";
    }
}