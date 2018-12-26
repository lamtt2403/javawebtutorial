<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="libs/bootstrap/dist/css/bootstrap.css">
        <link rel="stylesheet" href="libs/font/Open-Sans/style.css">
        <link rel="stylesheet" href="libs/font/Righteous-Regular/style.css">
        <link rel='stylesheet' href='css/index.css'>
        <link rel="stylesheet" href="libs/font-awesome/web-fonts-with-css/css/fontawesome-all.css">
        <link rel="stylesheet" href="libs/codemirror/lib/codemirror.css">
        <link rel="stylesheet" href="libs/codemirror/addon/hint/show-hint.css">
        <link rel="stylesheet" href="libs/codemirror/addon/lint/lint.css">
        <link rel="stylesheet" href="libs/codemirror/theme/material.css">
        <link rel="stylesheet" href="libs/codemirror/theme/monokai.css">

        <script src="libs/jquery/dist/jquery.js"></script>
        <script src="libs/bootstrap/dist/js/bootstrap.min.js"></script>
        <script src="libs/codemirror/lib/codemirror.js"></script>
        <script src="libs/codemirror/mode/htmlmixed/htmlmixed.js"></script>
        <script src="libs/codemirror/mode/javascript/javascript.js"></script>
        <script src="libs/codemirror/mode/xml/xml.js"></script>
        <script src="libs/codemirror/mode/css/css.js"></script>
        <script src="libs/codemirror/addon/hint/show-hint.js"></script>
        <script src="libs/codemirror/addon/hint/xml-hint.js"></script>
        <script src="libs/codemirror/addon/hint/html-hint.js"></script>
        <script src="libs/codemirror/addon/hint/css-hint.js"></script>
        <script src="libs/codemirror/addon/hint/javascript-hint.js"></script>
        <script src="libs/codemirror/addon/selection/active-line.js"></script>
        <script src="libs/codemirror/addon/fold/xml-fold.js"></script>
        <script src="libs/codemirror/addon/edit/closebrackets.js"></script>
        <script src="libs/codemirror/addon/edit/matchbrackets.js"></script>
        <script src="libs/codemirror/addon/edit/matchtags.js"></script>
        <script src="libs/codemirror/addon/edit/closetag.js"></script>
        <script src="libs/codemirror/addon/lint/lint.js"></script>
        <script src="libs/codemirror/addon/lint/csslint.js"></script>
        <script src="libs/codemirror/addon/lint/jshint.js"></script>
        <script src="libs/codemirror/addon/lint/html-lint.js"></script>
        <script src="libs/codemirror/addon/lint/htmlhint.js"></script>
        <script src="libs/codemirror/addon/lint/javascript-lint.js"></script>
        <script src="libs/codemirror/addon/lint/css-lint.js"></script>

        <title>Online Editor</title>
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
                    <a class='navbar-brand logo' href='/JavaWebTutorial/index.jsp'>
                        <img class='logo-img' src='images/logo-small.png' alt='logo'/>
                        <span class='hidden-sm hidden-md hidden-xs' style='font-family: Righteous'>FTutorial</span>
                    </a>
                </div>
                <div class='navbar-collapse'>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown pointer">
                            <a class="dropdown-toggle nav-font">
                                <i class="fab fa-html5"></i>
                                <span class="hidden-sm hidden-md">
                                    HTML
                                </span>
                            </a>
                        </li>
                        <li class="dropdown pointer">
                            <a class="dropdown-toggle nav-font">
                                <i class="fab fa-css3"></i>
                                <span class="hidden-sm hidden-md">
                                    CSS
                                </span>
                            </a>
                        </li>
                        <li class="dropdown pointer">
                            <a class="dropdown-toggle nav-font">
                                <i class="fab fa-js"></i>
                                <span class="hidden-sm hidden-md">
                                    JAVASCRIPT
                                </span>
                            </a>
                        </li>
                        <li class="activeeditor dropdown pointer">
                            <a class="dropdown-toggle nav-font" href="/JavaWebTutorial/editor.jsp">
                                <i class="fas fa-terminal"></i>
                                <span class="hidden-sm hidden-md">
                                    EDITOR
                                </span>
                            </a>
                        </li>
                        <li class="dropdown pointer">
                            <a class="dropdown-toggle nav-font" href="" id="account-menu" data-toggle='dropdown'>
                                <span>
                                    <i class="fas fa-user"></i>
                                    <span class="hidden-sm hidden-md">
                                        ACCOUNT
                                    </span>
                                    <b class="caret"></b>
                                </span>
                            </a>
                            <ul class="dropdown-menu" role="menu">
                                <li>
                                    <a>
                                        <i class="fas fa-info-circle"></i>
                                        <span>Details</span>
                                    </a>
                                </li>
                                <li>
                                    <a>
                                        <i class="fas fa-wrench"></i>
                                        <span>Settings</span>
                                    </a>
                                </li>
                                <li>
                                    <a id="logout">
                                        <i class="fas fa-sign-out-alt"></i>
                                        <span>Sign out</span>
                                    </a>
                                </li>
                                <!-- <li>
                                    <a id="login">
                                        <i class="fas fa-sign-in-alt"></i>
                                        <span>Sign in</span>
                                    </a>
                                </li> -->
                            </ul>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
        <div class="demo-frame editor-frame">
            <div class="row" style="margin-top: 65px;">
                <div class="col-md-6" style="display: flex; flex-direction: row; margin-bottom: 10px;">
                    <div class="dropdown" style="margin-right: 10px;">
                        <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Choose Theme
                            <span class="caret"></span></button>
                        <ul class="dropdown-menu">
                            <li><a onclick="return changeTheme('default')">Default</a></li>
                            <li><a onclick="return changeTheme('monokai')">Monokai</a></li>
                            <li><a onclick="return changeTheme('material')">Material</a></li>
                        </ul>
                    </div>
                    <div style="margin-right: 10px;">
                        <button type="button" class="btn btn-success" ng-click="vm.save()">
                            <i class="fas fa-save"></i>
                            <span>Save</span>
                        </button>
                    </div>
                    <div>
                        <button type="button" class="btn btn-primary" ng-click="vm.run()">
                            <i class="fas fa-play"></i>
                            <span>Run</span>
                        </button>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <span style="font-size: 20px;">HTML</span>
                    <textarea id="htmlEditor" style="display: none;"></textarea>
                </div>
                <div class="col-md-4">
                    <span style="font-size: 20px;">CSS</span>
                    <textarea id="cssEditor" style="display: none;"></textarea>
                </div>
                <div class="col-md-4">
                    <span style="font-size: 20px;">Javascript</span>
                    <textarea id="jsEditor" style="display: none;"></textarea>
                </div>
                <div class="col-md-12">
                    <span style="font-size: 20px;">Result</span>
                    <iframe id="result" style="width: 100%; height: 500px; background-color: white; border: 1px solid #9E9E9E;"></iframe>
                </div>
            </div>
        </div>

        <script src="js/editor.controller.js"></script>
    </body>
</html>
