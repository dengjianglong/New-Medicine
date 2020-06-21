<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>小小中药铺-欢迎了解中药文化</title>
    <style type="text/css">
        body {
            /* 页面顶部 */
            padding-bottom: 60px; 
            margin: 0px;
            background-image: url('${pageContext.request.contextPath}/img/1.jpg');  
            background-repeat:no-repeat;
            background-position:0% 0%;
            background-size:cover;
            background-color:#86afdd;
        }

        .head_photo {
            /* 居中，头像位置 */
            margin: 5px auto;
            /* width: 50px;
            height: 50px; */
            border-radius: 50%;
            overflow: hidden;   
        }

        header {
            padding:2px 4px 3px 4px;
            margin: auto;
            top: 0px;
            position: fixed;
            height: 50px;
            width: 100%;
            background-color: #23d683;
            background-repeat: no-repeat;
        }
        /* 头部 */
        header .up{
            position: absolute;/*top: 0px;*/
            width: auto;
            margin-top: auto;
            width: 100%;
            height: 50px;
            background-color: #34c07f;
            background-repeat: no-repeat;
        }

        /* 头部左边 */
        header .left {
            position: absolute;
            bottom: 0;
            left: 0;
            width: 50px;
            height: 100%;
            border-radius: 50%;
            overflow: hidden; 
            background: url(${pageContext.request.contextPath}/img/2.jpg);
            background-size: 30px 30px;
            background-position: center center;
            background-repeat: no-repeat;
        }

        /* 头部右边 */
        header .right {
            position: absolute;
            bottom: 0;
            right: 0;
            width: 250px;
            height: 100%;
            /* background: url(${pageContext.request.contextPath}/img/2.jpg); */
            background-size: 30px 30px;
            background-position: center center;
            background-repeat: no-repeat;
        }

        /* 头部中间 */
        header .center {
            position: relative;
            width: 20%;
            height: 100%;
            left: 700px;
            color: #203b35;
            text-align: center;
            top: 0px;
            bottom: 5px;
            letter-spacing:5px;
            background-size: 74px 30px;
            background-position: center;
            background-repeat: no-repeat;
        }   

        /* 文字位置大小样式 */
        .center_text{
            font-family:'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
            font: 1em sans-serif;
            font-size: 20px;
            height: 50px;
            width: 80px;
            /* center右边 */
            float: left;
            /* 字高 */
            line-height: 50px;
        }

        /* 图片位置大小 */
        .center_photo{
            /* top: 0px; */
            /* center中间 */
            float: center;
        }
        /* 设置logo属性 */
        header .center .logo{
            height: 30px;
            width: 40px;
            position: relative;
        }

        /* 输入框 */
        input {
            margin-right: 10px;
            margin-top: 15px;
            /* margin-bottom: 2px; */
            width: 200px;
            height: 20px;
            border: 0;
            border-radius: 10px;
            background: #ffffff;
            /*去除系统默认的样式*/
            -webkit-appearance: none;
            outline: #ffffff;
        }

        #btn {
            position: absolute;
            top: 22%;
            left: 150px;
            height: 75px;
            border: 0;
            border-left: 1px solid rgb(23, 32, 43, 0.2);
            background: #1801069d;
            color: #fff;
            cursor: pointer;
}

        .box {
            float: left;
            position: fixed;
            /* left: 0; */
            top: 150px;
            bottom: 300px;
            height: 100%;
            width: 150px;
            margin-left: 0;
            display: block;
            background-color: rgb(51, 170, 97);
            -moz-transition: margin-left 2s;
            transition: margin-left 2s;
        }

        aside ul li {
            /* height: 40px; */
            line-height: 40px;
            border-top: 1px solid rgb(179, 43, 43);
            border-bottom: 1px solid rgb(84, 86, 199);
            list-style-type: none;
            text-align: center;
        }

        aside ul li a {
            width: 100%;
            height: 100%;
            text-decoration-line: none;
            color: #fff;
            display: block;
        }

        section {
            width: 100%;
            height: 100%;
            background: #d4d4d4;
            height: 1000px;
        }

        /* 导航栏的ul */
        .uldao{
           
            top: 80px;
	        width: 100%;
            list-style-type:none;
            padding:40px; 
        }
        li{
            /* 横条 */
            display:inline;
        }

        /* 导航栏的位置 */
        .daohang{
            height: 20px;
            text-align: center;
        }

        /* 导航栏a标签 */
        .adao {
            font-size: x-large;
            outline: none;
            text-decoration: none;
            display: inline-block;
            width: 22%;
            margin-right: 0.625%;
            text-align: center;
            line-height: 0;
            color: black;
            background: rgb(134, 158, 94);
        }

        .bbody{
           margin-top: 100px; 
           margin-left: 150px;
        }

        .bphoto{
            height: 100px;
            width: 100px;
            
        }
        .search-advertise {
        background-size: 28px;
        position: absolute;
        margin-right: 25px;
        margin-top: 15px;
        width: 25px;
        height: 30px;
        z-index: 5;
        background-image: url("${pageContext.request.contextPath}/img/btn_search_bg.png");
        /* background-repeat: no-repeat; */
        }
    </style>
</head>
<body>
    <header id="header">
        <div class="up">
            <div class="right">
                <input id="search" class="" type="text" placeholder="  搜索或输入关键字" />
                <a onclick="getValue()"><span class="search-advertise"></span></a>
            </div>
            <div class="center">
                <div>
                    <div class="center_text">百草屋</div>
                    <div class="center_photo"><img src="${pageContext.request.contextPath}/img/logo.png" height="50px" width="90px"/></div>
                </div>   
            </div>
            <a href="${pageContext.request.contextPath}/login/manager.do"><div class="left"></div></a><div>管理员登录</div>
        </div> 
        <div class="daohang">
            <ul class="uldao">
                <li><a class="adao" href="${pageContext.request.contextPath}/search/zhongyao.do">中药查询</a></li>
                <li><a class="adao" href="${pageContext.request.contextPath}/search/mingyi.do">名医查询</a></li>
                <li><a class="adao" href="${pageContext.request.contextPath}/search/yaofang.do">名方查询</a></li>
                <li><a class="adao" href="${pageContext.request.contextPath}/search/jiliang.do">中药计量单位查询</a></li>
                <HR style="FILTER: alpha(opacity=100,finishopacity=0,style=3)" width="100%" color=#987cb9 SIZE=3>
            </ul>
            
        </div>
    </header>
    <aside class="box" id="test">
        <button id="btn">三</button>
        <ul>
            <li><a href="#">分类浏览</a></li>
            <li><a href="#">出现年代</a></li>
            <li><a href="#">字母顺序</a></li>
            <li><a href="#">功效</a></li>
            <li><a href="#">所属种类</a></li>
            <li><a href="#">药味</a></li>
        </ul>
    </aside>
    <div class="bbody">
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"  onclick=javascrtpt:jump()><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
        <div>
            <table  width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/01.jpg" class="bphoto"/> </td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/02.jpg" class="bphoto" /></td>
                  <td align="center"><img src="${pageContext.request.contextPath}/img/03.jpg" class="bphoto" /></td>
                </tr>
                <tr>
                  <td align="center">中药1</td>
                  <td align="center">中药2</td>
                  <td align="center">中药3</td>
                  <td align="center">中药4</td>
                  <td align="center">中药5</td>
                </tr>
              </table>
        </div>
    </div>
    
</body>
<script type="text/javascript">

	


    var box = document.getElementById("test")
    var btn = document.getElementById("btn")
    btn.onclick = function() {
        if (box.offsetLeft == 0) {
            box.style['margin-left'] = -150 + "px"
        } else {
            box.style['margin-left'] = 0 + "px"
        }
    }
//滚动条监听事件

// 固定侧边栏
$(window).scroll(function () {
var sTop = $(document).scrollTop();
var Bottom = 100;//设置底部距离
if (sTop >= 1738) {
    Bottom++;//不断增加

    $(".main .main_p").css("bottom",Bottom);//设置固定侧边框位置

}else{
    $(".main .main_p").css("bottom",0);
}

})

function getValue(){
	var search = document.getElementById('search');
	//location.href="${pageContext.request.contextPath}/search/md.do?mName="+search.value;
	location.href="${pageContext.request.contextPath}/search/md.do?mName="+search.value;
}

// 跳转页面
function jump(){
        window.location.href="next.html";
    }

// 每个图添加时间
function testClick () {
            console.log(this);
            console.log(this.innerText);
        }
    
    // 获得某class的所有对象的方法: (返回的是数组)
    var list = document.getElementsByClassName('bphoto');
    for(var i in list){
        // for循环给list对象数组的每个对象添加onclick单击事件,
        // 绑定testClick函数.注意函数后面不能加空格.
        list[i].onclick = testClick;
    }
</script>
</html>