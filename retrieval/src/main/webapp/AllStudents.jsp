<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Students Report</title>

    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Optional: Custom CSS -->
    <style>
        body {
            background-color: #f8f9fa;
        }
        h1 {
            margin-top: 30px;
            color: #343a40;
        }
        .table thead th {
            background-color: #343a40;
            color: white;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1 class="text-center">Students Report</h1>
        <hr>

        <div class="table-responsive">
            <table class="table table-striped table-bordered">
                <thead>
                    <tr>
                        <th>Roll Number</th>
                        <th>Student Name</th>
                        <th>Course Joined</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${stlist}" var="st">
                        <tr>
                            <td>${st.rollno}</td>
                            <td>${st.studnm}</td>
                            <td>${st.course}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <!-- Bootstrap JS (Optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
