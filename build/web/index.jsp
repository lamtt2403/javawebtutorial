<%-- 
    Document   : index
    Created on : Dec 22, 2018, 11:51:19 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
        <title>Home</title>
    </head>
    <body>
        <div class="container well">
            <div class="row">
                <div class="banner">
                    <img src="images/banner.jpg" class="banner-image">
                    <span class="banner-text">FTUTORIAL</span>
                </div>
                <section>
                    <div class="welcome demo-frame">
                        <div>Welcome!</div>
                    </div>
                </section>
                <section class="intro-html demo-frame">
                    <div class="col-md-12">
                        <div class="col-md-4">
                            <button type="button" class="btn btn-html">
                                <i class="fab fa-html5" style="font-size: 20vh;"></i>
                            </button>
                        </div>
                        <div class="col-md-8" style="color: white; font-size: 2vh;">
                            <p>With HTML you can create your own Website</p>
                            <p>This tutorial teaches you everything about HTML</p>
                            <p>HTML is easy to learn - Even you don't have brain, you can still learn HTML</p>
                        </div>
                    </div>
                </section>
                <section class="intro-css demo-frame">
                    <div class="col-md-12">
                        <div class="col-md-8" style="color: white; font-size: 2vh;">
                            <p>CSS is a language that describes the style of an HTML document</p>
                            <p>CSS describes how HTML elements should be displayed</p>
                            <p>This tutorial will teach you CSS from basic to advanced</p>
                        </div>
                        <div class="col-md-4">
                            <button type="button" class="btn btn-css">
                                <i class="fab fa-css3-alt" style="font-size: 20vh;"></i>
                            </button>
                        </div>
                    </div>
                </section>
                <section class="intro-javascript demo-frame">
                    <div class="col-md-12">
                        <div class="col-md-4">
                            <button type="button" class="btn btn-js">
                                <i class="fab fa-js-square" style="font-size: 20vh;"></i>
                            </button>
                        </div>
                        <div class="col-md-8" style="color: white; font-size: 2vh;">
                            <p>JavaScript is the programming language of HTML and the Web</p>
                            <p>JavaScript is very easy to learn too - Like HTML, brain is not required</p>
                            <p>This tutorial will teach you JavaScript from basic to advanced</p>
                        </div>
                    </div>
                </section>
            </div>
        </div>
    </body>
</html>
