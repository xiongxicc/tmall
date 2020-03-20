/* $(function () {

 var nowId;
 $(".enter").on({"mouseenter" : function () {
 $(this).css("background" , "white");
 },
 "mouseleave" : function () {
 $(this).css("background", "rgb(226,226,227)");

 }
 });


 }); */


$(function() {


    document.getElementsByClassName("proValues")[11].onmouseover = document.getElementsByClassName("enter")[11].onmouseover = function () {
        document.getElementsByClassName("enter")[11].style.background="white";
        document.getElementsByClassName("proValues")[11].style.display = "block";

    }
    document.getElementsByClassName("proValues")[11].onmouseout = document.getElementsByClassName("enter")[11].onmouseout = function () {
        document.getElementsByClassName("enter")[11].style.background="rgb(226,226,227)";
        document.getElementsByClassName("proValues")[11].style.display = "none";
    }

    document.getElementsByClassName("proValues")[12].onmouseover = document.getElementsByClassName("enter")[12].onmouseover = function () {
        document.getElementsByClassName("enter")[12].style.background="white";
        document.getElementsByClassName("proValues")[12].style.display = "block";

    }
    document.getElementsByClassName("proValues")[12].onmouseout = document.getElementsByClassName("enter")[12].onmouseout = function () {
        document.getElementsByClassName("enter")[12].style.background="rgb(226,226,227)";
        document.getElementsByClassName("proValues")[12].style.display = "none";
    }




});

$(function() {


    var size = $(".slide-img li").size();
    for(var i = 1; i <= size; i++){
        var li = "<li></li>";
        $(".slide-index").append(li);
    }

    var i=0;

    $(".slide-index li").eq(0).addClass("active").siblings().removeClass("active");
    $(".slide-img li").eq(0).show();

    $(".slide-index li").mouseenter(function () {
        $(this).addClass("active").siblings().removeClass("active");
        var index = $(this).index();
        $(".slide-img li").eq(index).stop().fadeIn(0).siblings().stop().fadeOut(0);
        i=index;
        $(".slide-img li").eq(i).fadeIn(0).siblings().fadeOut(0);
    });
    var t=setInterval(animates, 5000);
    function animates() {
        i++;
        if (i == size) {
            i = 0;
        }
        $(".slide-index li").eq(i).addClass("active").siblings().removeClass("active");
        $(".slide-img li").eq(i).fadeIn(0).siblings().fadeOut(0);
    }

});