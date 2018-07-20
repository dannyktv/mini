<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="join.mem" method=post>
      <table border=2>
         <tr>
            <th colspan="2">회원 가입 정보</th>
         </tr>
         <tr>
            <td class="right">아이디:</td>
            <td><input id="id1" type="text" name="id">
              
         </tr>
         <tr>
            <td class="right">비밀번호:</td>
            <td><input id="pw" type="password" name="password"></td>
         </tr>
  
         <tr>
            <td id="name" class="right">이름:</td>
            <td><input id="nametext" type="text" name="name"></td>
         </tr>
         <tr>
            <td class="right">이메일:</td>
            <td><input type="email" name="e	mail"></td>
         </tr>
         <tr>
            <th colspan="2">
               <button id="joinbt" type="submit">회원가입</button>
               <button id="resetbt">다시입력</button>
            </th>
         </tr>
      </table>
   </form>
</body>
</html>