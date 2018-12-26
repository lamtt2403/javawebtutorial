function highlight(id, string, language) {
    if (language == "HTML")
        return document.getElementById(id).innerHTML = Prism.highlight(string, Prism.languages.markup);
    else if (language == "CSS")
        return $(id).html(Prism.highlight(string, Prism.languages.css));
    else if (language == "JAVASCRIPT")
        return $(id).html(Prism.highlight(string, Prism.languages.javascript));
}