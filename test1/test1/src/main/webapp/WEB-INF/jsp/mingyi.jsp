<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>中药查询</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/img/page.css"/>
    <style>
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
<div>
  <header> <a class="btn-back" href="${pageContext.request.contextPath}/login/main.do"> <span>首页</span> </a> </header>
  <p class="subject">名 医 查 询</p>
              <div class="right">
                <input id="search" class="" type="text" placeholder="  搜索或输入关键字" />
                <a onclick="getValue()"><span class="search-advertise"></span></a>
            </div>
</div>
<hr align=center width=300 color=#987cb9 SIZE=1>
<div>
  <div class="table">
<table width="80%" border="0">
  <tr>
   <div class="picture" width="263" height="204"> <td ><img src="${pageContext.request.contextPath}/img/bianque.jpg"></td>
   </div>
    <td width="70%"><table width="100%" border="0">
      <tr>
        <td width="24%" height="46" align="right">名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</td>
        <td width="76%" align="left">${doctor.dName }</td>
      </tr>
      <tr>
        <td height="51" align="right">出&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;地：</td>
        <td align="left">${doctor.dBrief}
</td>
      </tr>
      <tr>
        <td height="42" align="right">生&nbsp;&nbsp;卒&nbsp;&nbsp;年&nbsp;&nbsp;份：</td>
        <td align="left">${doctor.dbirth }

</td>
      </tr>
    </table></td>
  </tr>
</table>

</div>
</div>
<hr />
<div>
  <div class="text2">
		<p><strong>简&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;介</strong></p>
  </div>
  <div class="text3"><table width="84%" height="225" border="1">
  <tr>
    <td height="200">
        扁鹊(公元前407—前310年)姬姓，秦氏，名越人，春秋战国时期名医，渤海郡鄚(今河北沧州市任丘市)人。 <br></td>
  </tr>
</table>
</div>
</div>

</body>
<script type="text/javascript">
function getValue(){
	var search = document.getElementById('search');
	//location.href="${pageContext.request.contextPath}/search/md.do?mName="+search.value;
	location.href="${pageContext.request.contextPath}/search/my.do?dName="+search.value;
}
</script>
</html>