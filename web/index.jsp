<%--
Document   : index
Created on : Dec 22, 2018, 11:51:19 AM
Author     : Admin
--%>
<%@page contentType='text/html' pageEncoding='UTF-8'%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
        <script src='https://code.jquery.com/jquery-3.3.1.min.js' integrity='sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=' crossorigin='anonymous'></script>
        <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css' integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u' crossorigin='anonymous'>
        <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js' integrity='sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa' crossorigin='anonymous'></script>
        <link rel='stylesheet' type='text/css' href='css/index.css'>
        <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.6.3/css/all.css' integrity='sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/' crossorigin='anonymous'>
        <title>Home</title>
    </head>
    <body>
        <div>
            <nav class='navbar navbar-default static-navbar'>
                <div class='navbar-header'>
                    <button type='button' class='navbar-toggle'>
                    <span class='sr-only'>Toggle navigation</span>
                    <span class='icon-bar'></span>
                    <span class='icon-bar'></span>
                    <span class='icon-bar'></span>
                    </button>
                    <a class='navbar-brand logo' ui-sref='home'>
                        <img class='logo-img' src='images/logo-small.png' alt='logo'/>
                        <span class='hidden-sm hidden-md hidden-xs' style='font-family: Righteous'>FTutorial</span>
                    </a>
                </div>
                <div class='navbar-collapse' uib-collapse='vm.isNavbarCollapsed'>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown pointer" ng-class="{activehtml: vm.$state.includes('html')}">
                            <a class="dropdown-toggle nav-font"-toggle id="html" ui-sref="html">
                                <i class="fab fa-html5"></i>
                                <span class="hidden-sm hidden-md">
                                    HTML
                                </span>
                            </a>
                        </li>
                        <li class="dropdown pointer" ng-class="{activecss: vm.$state.includes('css')}">
                            <a class="dropdown-toggle nav-font" id="css" ui-sref="css">
                                <i class="fab fa-css3"></i>
                                <span class="hidden-sm hidden-md">
                                    CSS
                                </span>
                            </a>
                        </li>
                        <li class="dropdown pointer" ng-class="{activejs: vm.$state.includes('javascript')}">
                            <a class="dropdown-toggle nav-font" id="javascript" ui-sref="javascript">
                                <i class="fab fa-js"></i>
                                <span class="hidden-sm hidden-md">
                                    JAVASCRIPT
                                </span>
                            </a>
                        </li>
                        <li class="dropdown pointer" ng-class="{activeeditor: vm.$state.includes('editor')}">
                            <a class="dropdown-toggle nav-font" id="editor" ui-sref="editor">
                                <i class="fas fa-terminal"></i>
                                <span class="hidden-sm hidden-md">
                                    EDITOR
                                </span>
                            </a>
                        </li>
                        <li ng-class="{activeaccount: vm.$state.includes('account')}" class="dropdown pointer">
                            <a class="dropdown-toggle nav-font" href="" id="account-menu">
                                <span>
                                    <i class="fas fa-user"></i>
                                    <span class="hidden-sm hidden-md">
                                        ACCOUNT
                                    </span>
                                    <b class="caret"></b>
                                </span>
                            </a>
                            <ul class="dropdown-menu"-menu>
                                <li ui-sref-active="active">
                                    <a ui-sref="details" >
                                        <i class="fas fa-info-circle"></i>
                                        <span>Details</span>
                                    </a>
                                </li>
                                <li ui-sref-active="active">
                                    <a ui-sref="settings" >
                                        <i class="fas fa-wrench"></i>
                                        <span>Settings</span>
                                    </a>
                                </li>
                                <li ui-sref-active="active">
                                    <a ng-click="vm.changePassword()">
                                        <i class="fas fa-lock"></i>
                                        <span>Password</span>
                                    </a>
                                </li>
                                <li ui-sref-active="active">
                                    <a href="" ng-click="vm.logout()" id="logout">
                                        <i class="fas fa-sign-out-alt"></i>
                                        <span>Sign out</span>
                                    </a>
                                </li>
                                <li ui-sref-active="active" ng-switch-when="false">
                                    <a href="" ng-click="vm.login()" id="login">
                                        <i class="fas fa-sign-in-alt"></i>
                                        <span>Sign in</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
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