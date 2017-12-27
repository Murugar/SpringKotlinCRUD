<%@tag pageEncoding="UTF-8"  trimDirectiveWhitespaces="true" %>
<%@ include file="/WEB-INF/taglibs.jsp" %>
<%@ attribute name="main" fragment="true" description="" %>
<%@ attribute name="css" fragment="true" description="" %>
<%@ attribute name="js" fragment="true" description="" %>
<%@ attribute name="noHead" type="java.lang.Boolean" description="" %>
<!DOCTYPE html>
<html>
<head>
    <common:metaTitle></common:metaTitle>
    <common:css></common:css>

    <jsp:invoke fragment="css"/>
</head>
<body>
<c:if test="${empty(noHead) || !noHead}">
    <common:header/>
</c:if>
<div class="container">
    <jsp:invoke fragment="main"/>
</div>
<!-- Modal -->
<div class="modal fade" id="commonModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true"></div>
<common:js></common:js>
<jsp:invoke fragment="js"/>
</body>
</html>