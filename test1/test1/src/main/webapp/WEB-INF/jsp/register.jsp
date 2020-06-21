<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="login.css"/>
</head>
<body>
    <!--把logo放在左上角-->
    <div id="image1" style="POSITION:absolute;LEFT:0px; VISIBILITY:visible; TOP:0px; HEIGHT:135px; width:12%;">
         <img src="img/logo.png" id="image11" hspace="6" border="0" alt="image1"   />
    </div>
    <div id="ZhuCe">
        <p id="image_logo"><img src="img/头像.png"></p>
        <form>
            <p><label class="label_input">用户名</label><input type="text" id="username" class="text_field"/></p>
            <p><label class="label_input">密码</label><input type="text" id="password" class="text_field"/></p>
            <p><label class="label_input">确认密码</label><input type="text" id="password" class="text_field"/></p>
            <div id="ZhuCe_control">
                <input type="button" id="btn_login" value="注册"/>
            </div>
        </form>
    </div>
</body>
</html>