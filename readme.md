Run with maven using:

    mvn clean spring-boot:run

Fetching access_token and refresh_token
---------------------------------------
    http://localhost:9191/api/oauth/token?username=admin&password=admin&grant_type=password                                                         
    Also set Authorization to "Basic client_id:client_password

Access secure resource sucessfully
----------------------------------
    http://localhost:9191/api/secure
    With Authorization: "Bearer <access_token>"

If you need a new access token:

Refresh your token by submitting refresh_token
----------------------------------------------
    http://localhost:9191/api/oauth/token?grant_type=refresh_token&refresh_token=<refresh_token>