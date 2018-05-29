/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
function search(newsToSearch){
    
 for (var news of $(".div-news")){
     
    console.log(news)
     
    if (news.innerText.includes(newsToSearch) && newsToSearch !== ""){
        $("#"+news.id).css({
            "color" : "green",
            "background" : "white"
        });
    }
    else {
        $("#"+news.id).css({
            "color" : "white",
            "background" : ""
        });
    }
     
 }
}
*/


function createElement(news){
    
    var id = $("<h1>").html(news.id);
    var name = $("<h2>").html(news.autore);
    var content = $("<p>").html(news.content);
    
    
    return $("<div>").attr("class", "div-news").append(id)
            .append(name).append(content);
    
}



function stateSuccess(data){
    
    var newsDiv = $(".main-box");
    
    $(newsDiv).empty();
    
    for (var instance in data)
    {
        $(newsDiv).append(createElement(data[instance]))
    }
}

function stateFailure(data, state){
    console.log(state);
}

$(document).ready(function () {
// istruzioni per agganciare event handlers
    $("#search").click(function(event){
           
        $.ajax({
            url: "SearchAjax",
            data: {
                cmd: "search",
                toSearch: event.target.value
            },
            dataType: 'json',
            success: function(data, state){stateSuccess(data);},
            error: function (data, state) {stateFailure(data, state);}
        });
            
    });
});




