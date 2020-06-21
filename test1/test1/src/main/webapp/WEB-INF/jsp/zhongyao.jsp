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
</head>
<body>
<div>
  <header> <a class="btn-back" href="${pageContext.request.contextPath}/login/main.do"> <span>首页</span> </a> </header>
  <p class="subject">中 药 查 询</p>
</div>
<hr align=center width=300 color=#987cb9 SIZE=1>
<div>
  <div class="table">
<table width="80%" border="0">
  <tr>
   <div class="picture" width="263" height="204"> <td ><img src="images/shanyao.jpg"></td>
   </div>
    <td width="70%"><table width="100%" border="0">
      <tr>
        <td width="24%" height="46" align="right">名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称：</td>
        <td width="76%" align="left">${medicine.mName }</td>
      </tr>
      <tr>
        <td height="51" align="right">作&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用：</td>
        <td align="left">${medicine.mEffect }</td>
      </tr>
      <tr>
        <td height="42" align="right">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;味：</td>
        <td align="left">${medicine.mSmell }</td>
      </tr>
      <tr>
        <td height="42" align="right">所属种类：</td>
        <td align="left">${medicine.mKind }</td>
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
    <td height="219">${medicine.mName }<br>
      ${medicine.mEffect }${medicine.mSmell }${medicine.mKind }<br></td>
  </tr>
</table>
</div>
</div>

</body>
</html>