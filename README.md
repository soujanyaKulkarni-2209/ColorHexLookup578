# Colour Name to Hex Code Lookup Servlet

## 👩‍🎓 Student Details

| Field | Details |
|------|---------|
| Name | Soujanya S. Kulkarni |
| USN | 2BL23CS147 |
| Branch | CSE |
| Semester | VI |
| Subject | Advanced Java Programming |
| Problem No. | 15 |

## 📌 Problem Statement

This project is a Colour Name to Hex Code Lookup application using Java Servlets. It takes a colour name as input from the user. The servlet processes the input, validates the data, and displays the corresponding HEX code with a colour preview box.

## 💻 Technologies Used

- Java Servlet
- HTML
- Apache Tomcat 9
- Eclipse IDE

## 🚀 How to Run

1. Import project into Eclipse
2. Configure Apache Tomcat Server
3. Right click project → Run As → Run on Server
4. Open browser:

```text
http://localhost:8081/ColorHexLookup/
```

If port 8081 does not work, try:

```text
http://localhost:8080/ColorHexLookup/
```

## 📸 Screenshots

### 🔹 Input Form

<img width="1911" height="1057" alt="screenshort3" src="https://github.com/user-attachments/assets/2aba4e6f-bfd0-45d7-89c4-b3583033347e" />



### 🔹 Output Page - Red Colour

<img width="1845" height="962" alt="screenshort4" src="https://github.com/user-attachments/assets/b7833311-22e8-40e9-a35b-2aac25ce0080" />



### 🔹 Input Form with Blue Colour

<img width="1912" height="876" alt="scrrenshort1" src="https://github.com/user-attachments/assets/e4423201-747e-4a91-8a9b-0beec6a01f5b" />


### 🔹 Output Page - Blue Colour

<img width="1902" height="966" alt="scrrenshort2" src="https://github.com/user-attachments/assets/b114233a-8a91-4f76-9557-8855fb3974a3" />


## ⚙️ Servlet Concepts Used

- doGet() method
- doPost() method
- Request parameters using getParameter()
- HashMap for colour name and HEX code mapping
- Form handling
- Input validation
- Response generation using PrintWriter




## ✅ Output

- User enters a colour name
- Application displays the corresponding HEX code
- Application shows a colour preview box
- Invalid colour names show a friendly error message

## 📌 Example

Input:

```text
blue
```

Output:

```text
Colour Name: blue
Hex Code: #0000FF
```
