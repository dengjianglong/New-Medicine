<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>管理_dynasty</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/img/guanli.css" type="text/css">
    <script language="javascript" type="text/javascript">
    function $(id) {
    return document.getElementById(id);
    }
    function addHero() {
        var z;
        var i=$("ph").value;
        for (var j=1;j<$("mytable").rows.length;j++) {
            if(parseInt(i)>=parseInt($("mytable").rows[j].cells[0].innerText)) {
            z=j;
            }
        }
        var tableRow=$("mytable").insertRow(z+1);
        var Cell_0=tableRow.insertCell(0);
        Cell_0.innerText=$("ph").value;
        Cell_0.className="s1";
        var Cell_1=tableRow.insertCell(1);
        Cell_1.innerText=$("xm").value;
        Cell_1.className="s2";
        var Cell_2=tableRow.insertCell(2);
        Cell_2.innerText=$("ch").value;
        Cell_2.className="s3";
        var Cell_3=tableRow.insertCell(3);
        Cell_3.innerText=$("d").value;
        Cell_3.className="s4";
        var Cell_4=tableRow.insertCell(4);
        Cell_4.innerText=$("e").value;
        Cell_4.className="s5";
        var Cell_5=tableRow.insertCell(5);
        Cell_5.innerText=$("f").value;
        Cell_5.className="s6";

        var Cell_6=tableRow.insertCell(6);
        Cell_6.innerText=$("g").value;
        Cell_6.className="s7";
        var Cell_7=tableRow.insertCell(7);
        Cell_7.innerText=$("h").value;
        Cell_7.className="s8";

        var Cell_8=tableRow.insertCell(8);
        Cell_8.innerHTML="<a href='#' onclick='Del(this.parentNode,this.parentNode.parentNode.rowIndex)'>删除bai</a>";
        Cell_8className="s9";
        var Cell_9=tableRow.insertCell(9);
        Cell_9.innerHTML="<a href='#' onclick='edit(this.parentNode.parentNode.rowIndex)' class='edit'>修改</a>";
        Cell_9.className="s10";
    }
    function Del(obj,val) {
        var a=window.confirm("您确定要删除吗？");
        if(a) {
        $("mytable").deleteRow(val);
        } else {
        window.alert("未删除！du");
        }
    }
    function edit(rowIndex) {
        var rowHtml = $("mytable").rows[rowIndex];
        rowHtml.cells[0].innerHTML = "<input type='text' value='"+rowHtml.cells[0].innerText+"' name='c0'>";
        rowHtml.cells[1].innerHTML = "<input type='text' value='"+rowHtml.cells[1].innerText+"' name='c0'>";
        rowHtml.cells[2].innerHTML = "<input type='text' value='"+rowHtml.cells[2].innerText+"' name='c0'>";
        rowHtml.cells[3].innerHTML = "<input type='text' value='"+rowHtml.cells[3].innerText+"' name='c0'>";
        rowHtml.cells[4].innerHTML = "<input type='text' value='"+rowHtml.cells[4].innerText+"' name='c0'>";
        rowHtml.cells[5].innerHTML = "<input type='text' value='"+rowHtml.cells[5].innerText+"' name='c0'>";

        rowHtml.cells[6].innerHTML = "<input type='text' value='"+rowHtml.cells[6].innerText+"' name='c0'>";
        rowHtml.cells[7].innerHTML = "<input type='text' value='"+rowHtml.cells[7].innerText+"' name='c0'>";

        rowHtml.cells[8].innerHTML = "<a href='#' onclick='Del(this.parentNode,this.parentNode.parentNode.rowIndex)'>删除</a>";
        rowHtml.cells[9].innerHTML = "<a href='#' onclick='save(this.parentNode.parentNode.rowIndex)' class='edit'>保存</a>";

    }
    function save(rowIndex){
        var rowHtml = $("mytable").rows[rowIndex];
        for(var i = 0;i<8;i++){
        rowHtml.cells[i].innerHTML = rowHtml.cells[i].children[0].value;
        }
        rowHtml.cells[8].innerHTML = "<a href='#' onclick='Del(this.parentNode,this.parentNode.parentNode.rowIndex)'>删除</a>";
        rowHtml.cells[9].innerHTML = "<a href='#' onclick='edit(this.parentNode.parentNode.rowIndex)' class='edit'>修改</a>";

    }

    </script>
</head>
    <body>
        <div>
        <header> <a class="btn-back" href="${pageContext.request.contextPath}/login/main.do"> <span>首页</span> </a> </header></div>
        		    <!--
        把logo放在右上角-->
        <div id="image2" style="POSITION:absolute;LEFT:88%; VISIBILITY:visible;TOP:50px; HEIGHT:135px; width:12%;">
            <img src="${pageContext.request.contextPath}/img/logo.png" id="image22" hspace="6" border="0" alt="image1"   />
        </div>
        
        <aside class="box" id="test">
            <u1>
                <li><input class="a" type="text" placeholder="  搜索或输入关键字" /></li>
                <li><span class="search-advertise"></span></li>
            </u1>
            <ul>
                    
 <li><a href="${pageContext.request.contextPath}/dm/findAllDM.do">表1  t_dm</a></li>
                <li><a href="${pageContext.request.contextPath}/doctor/findAllDoctor.do">表2  t_doctor</a></li>
                <li><a href="${pageContext.request.contextPath}/dynasty/findAllDynasty.do">表3  t_dynasty</a></li>
                
                <li><a href="${pageContext.request.contextPath}/medicine/findAllMedicine.do">表5  t_medicine</a></li>
                <li><a href="${pageContext.request.contextPath}/prescription/findAllPrescription.do">表6  t_prescription</a></li>
                <li><a href="${pageContext.request.contextPath}/weight/findAllWeight.do">表7  t_weight</a></li>
            </ul>
        </aside>
        <form action="${pageContext.request.contextPath}/dynasty/saveDynasty.do" methon="post">
        
        <span class="span1">Nane</span>
        <input id="xm" type="text" name="dyName"/>
        <span class="span1">Attribute</span>
        <input id="ch" type="text" name="qin"/>
        <span class="span1">Attribute</span>
        <input id="d" type="text" name="sanguo"/>
        <span class="span1">Attribute</span>
        <input id="e" type="text" name="sui"/>
        <span class="span1">Attribute</span>
        <input id="f" type="text" name="tang"/>
        <span class="span1">Attribute</span>
        <input id="f" type="text" name="yuan"/>
        <span class="span1">Attribute</span>
        <input id="f" type="text" name="qing"/>

        <button class="but" type="submit">添加</button>
        </form>
        
        <div class="text" style="text-align: center;">
            <h1>数据管理</h1>
        </div>
        &nbsp;
        <table id="mytable" cellspacing="0px" border="3" bordercolor="red">
            <tr>
                <td class="s_top">ID</td>
                <td class="s_top">Name</td>
                <td class="s_top">Attribute</td>
                <td class="s_top">Attribute</td>
                <td class="s_top">Attribute</td>
                <td class="s_top">Attribute</td>
                <td class="s_top">Attribute</td>
                <td class="s_top">Attribute</td>
                <td class="s_top" colspan="2">操作</td>
            </tr>
            
            
            
            <c:forEach items="${dynasty }" var="dynasty">
             <tr>
                <td class="s1">${dynasty.id }</td>
                <td class="s2">${dynasty.dyName }</td>
                <td class="s3">${dynasty.qin }</td>
                <td class="s4">${dynasty.sanguo }</td>
                <td class="s5">${dynasty.sui }</td>
                <td class="s6">${dynasty.tang }</td>
                <td class="s7">${dynasty.yuan }</td>
                <td class="s8">${dynasty.qing }</td>
                <td class="s9"><a href="${pageContext.request.contextPath}/dynasty/deleteDynasty.do?id=${dynasty.id}" onclick='Del(this.parentNode,this.parentNode.parentNode.rowIndex)'>删除</a></td>
                <td class="s10"><a href="#" onclick="edit(this.parentNode.parentNode.rowIndex)">修改</a></td>
            </tr>
            </c:forEach>
            
            
            
            
           
        </table>

    </body>
</html>
