<html>
<head>
    <title>Upload&load book</title>
</head>
<body>
<h2>Choose book to upload</h2>
<form action="load-book" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="Upload">
</form>
<form action="book" method="get">
    <h2>Click download and choose book</h2>
    <input type="submit" value="Download" />
</form>
</body>
</html>
