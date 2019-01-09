<!doctype html>
<html lang="en">
<head>
    <title>Home Page of Rest Api</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div>
    <div style="padding-top: 30px" class="panel-body">
        <div class="form-horizontal">
            <div style="margin-bottom: 25px" class="input-group">
                <a href="${pageContext.request.contextPath}/basic-rest-api/hello" class="btn btn-primary"
                   role="button"
                   aria-pressed="true">Hello</a>
            </div>
            <div style="margin-bottom: 25px" class="input-group">
                <a href="${pageContext.request.contextPath}/rest-api/students" class="btn btn-primary" role="button"
                   aria-pressed="true">Students List</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
