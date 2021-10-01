package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("")

    public String skills() {
        String html = "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>" +
                "</body></html>";
        return html;
    }

    //handle request  /form
    @GetMapping("form")
    public String form() {
        String html = "<html><body>" +
                "<form method='post' action='form'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' name='name' id='name'><br>" +
                "<label for='js-select'>My favorite language:</label><br>" +
                "<select name='first' id='js-select'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select></br>" +
                "<label for='j-select'>My second favorite language:</label><br>" +
                "<select name='second' id='j-select'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select></br>" +
                "<label for='p-select'>Python:</label><br>" +
                "<select name='third' id='p-select'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select></br>" +
                "<input type='submit' value='Submit'/>" +
                "</body></html>";
        return html;
    }

    @PostMapping("form")
    public String displaySkills(@RequestParam String name, @RequestParam String first,
                                @RequestParam String second, @RequestParam String third) {
        String report = "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<ol><li>" + first + "</li>" +
                "<li>" + second + "</li>" +
                "<li>" + third + "</li></ol>" +
                "</body></html>";
        String table= "<table style='border:1px solid black; padding:10px;'"+
                "<thead style='background-color:tomato'"+
                "<tr><th>Name</th><th>1</th><th>2</th><th>3</th></th>"+
                "</thead>"+
                "<tbody>"+
                "<tr><td>"+ name + "</td><td>"+first+ "</td><td>"+second+"</td><td>"+third+"</td></tr>"+
                "</tbody></table>";
        return report;
    }

}
