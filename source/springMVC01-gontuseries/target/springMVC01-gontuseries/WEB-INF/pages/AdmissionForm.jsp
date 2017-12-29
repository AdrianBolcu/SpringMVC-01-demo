<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Mindit
  Date: 12/28/2017
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

    <h1>${headerMessage}</h1>
    <h1>Student addmission form for engineering courses</h1>
    <form:errors path="student1.*"/>
        <form action="/submitAdmissionForm.html" method="POST">
            <table>

                <tr>
                    <td>Student's name:</td>  <td><input type="text" name="studentName"/></td>
                </tr>

                <tr>
                   <td>Student's hobby: </td>  <td><input type="text" name="studentHobby"/></td>
                <tr/>

                <tr>
                    <td>Student's mobile: </td> <td><input type="text" name="studentMobile"/></td>
                </tr>
                <tr>
                    <td>Student's DOB: </td> <td> <input type="text" name="studentDOB"></td>
                </tr>
                <!--
                <tr>
                    <td>Student's skills set: </td> <td><select name="studentSkills" multiple>
                                                                <option value="Java Core">Java Core</option>
                                                                <option value="Spring Core">Spring Core</option>
                                                                <option value="Spring MVC">Spring MVC</option>
                                                                </select></td>
                </tr>
                -->

            </table>

            <table>
                <tr><td>Student's address: </td></tr>
                <tr>
                    <td>Country: </td><td><input type="text" name="studentAddress.country"></td>
                    <td>City: </td><td><input type="text" name="studentAddress.city"></td>
                    <td>Street</td><td><input type="text" name="studentAddress.street"> </td>
                    <td>Pincode</td><td><input type="text" name="studentAddress.pincode"> </td>
                </tr>

                <tr> <td><input type="submit" value="Submit this form by clicking here"/></td>
                </tr>
            </table>


         </form>


</body>
</html>
