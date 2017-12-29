<%--
  Created by IntelliJ IDEA.
  User: Mindit
  Date: 12/28/2017
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <body>
    <h1>${headerMessage}</h1>

    <h1>Congrats</h1>
    <h1>Details submitted by you:: </h1>
    <table>
      <tr>
        <td>Student name:</td>
          <td>${student1.studentName}</td>
      </tr>
      <tr>
        <td>Student hobby: <td/>
        <td>${student1.studentHobby}</td>
      </tr>

      <tr>
        <td>Student mobile: <td/>
        <td>${student1.studentMobile}</td>
      </tr>
      <tr>
        <td>Student DOB: <td/>
        <td>${student1.studentDOB}</td>
      </tr>
      <tr>
        <td>Student skills: <td/>
        <td>${student1.studentSkills}</td>
      </tr>
      <tr>
        <td>Student address: </td>
        <td>Country: ${student1.studentAddress.country}
        City: ${student1.studentAddress.city}
        Street: ${student1.studentAddress.street}
        Pincode: ${student1.studentAddress.pincode}</td>
      </tr>
    </table>
    <h2>${msg}</h2>
  </body>
</html>
