package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ColorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type as HTML
        response.setContentType("text/html");

        // Create PrintWriter object to send output to browser
        PrintWriter out = response.getWriter();

        // Read colour name entered by user
        String colorName = request.getParameter("colorName");

        // Create HashMap to store colour names and hex codes
        HashMap<String, String> colors = new HashMap<String, String>();

        // Add at least 10 colour mappings
        colors.put("red", "#FF0000");
        colors.put("blue", "#0000FF");
        colors.put("green", "#008000");
        colors.put("yellow", "#FFFF00");
        colors.put("black", "#000000");
        colors.put("white", "#FFFFFF");
        colors.put("orange", "#FFA500");
        colors.put("pink", "#FFC0CB");
        colors.put("purple", "#800080");
        colors.put("brown", "#A52A2A");

        out.println("<html>");
        out.println("<head><title>Colour Result</title></head>");
        out.println("<body>");
        out.println("<h1>Colour Name to Hex Code Lookup</h1>");

        // Check whether input is empty
        if (colorName == null || colorName.trim().isEmpty()) {
            out.println("<h3>Please enter a colour name.</h3>");
        } else {
            // Convert input to lowercase and remove spaces
            String key = colorName.toLowerCase().trim();

            // Check whether colour exists
            if (colors.containsKey(key)) {
                String hex = colors.get(key);

                out.println("<h3>Colour Name: " + key + "</h3>");
                out.println("<h3>Hex Code: " + hex + "</h3>");

                // Display colour box
                out.println("<div style='background:" + hex + "; width:150px; height:80px; border:1px solid black;'></div>");
            } else {
                out.println("<h3>Colour not found.</h3>");
                out.println("<p>Try red, blue, green, yellow, black, white, orange, pink, purple, or brown.</p>");
            }
        }

        out.println("<br><a href='index.html'>Go Back</a>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}