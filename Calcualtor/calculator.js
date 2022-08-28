var num;
var num2 = 1
var math = false
var equation;

$(document).ready(function (){
    $(".equation").click(function (){
        math = true;
        equation =$(this).data('equation')
        console.log(equation)
    })


    $(".btn").click(function (){
        $(this).css("background-color", "red")
        if (math===false){
            num = $(this).data('num')
            console.log("num 1 = "+num)
            $("#result").html(num)
        }else {
            num2 = $(this).data('num')
            console.log("num 2 = "+num2)
            $("#result").html(num2)
        }
    })

    $("#equal").click(function (){
        let result;
        if (equation =="add"){
            result= num+ num2;
            $("#result").html(result)
        }

    })


})
