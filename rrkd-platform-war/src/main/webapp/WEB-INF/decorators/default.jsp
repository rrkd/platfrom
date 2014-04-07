<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ include file="../view/globe.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <title>Local Business - Bootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="rrkd">
    <meta name="author" content="">
    <meta name="geo.placename" content="WC1B, london">
    <meta name="geo.position" content="51.51954;-0.125549" />


    <title><decorator:title/></title>


    <link rel="stylesheet" href="assets/css/themes/default/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="assets/css/themes/default/bootstrap-responsive.css" type="text/css">


    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <link href="assets/js/perfect-scrollbar-0.3.3/perfect-scrollbar.css" rel="stylesheet" type="text/css"/>

    <decorator:head/>
</head>
<body>
    <decorator:body/>


    <script src="http://maps.google.com/maps/api/js?sensor=false&libraries=places"></script>
    <script type="text/javascript" src="assets/js/jquery.js"></script>
    <script type="text/javascript" src="assets/js/jquery.mousewheel.js"></script>
    <script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="assets/js/perfect-scrollbar-0.3.3/perfect-scrollbar.js"></script>
    <script type="text/javascript" src="assets/js/global.js"></script>
</body>
</html>