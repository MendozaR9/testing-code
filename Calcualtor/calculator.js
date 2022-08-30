var num =0
var num2 = 0
var math = false
var equation;

$(document).ready(function (){
    $(".equation").click(function (){
        math = true;
        equation =$(this).data('equation')
        console.log(equation)
    })

    $("#clear").click(function (){
        num = 0
        num2 = 0
        math =false;
        $("#result").html(num)
    })


    $(".btn").click(function (){
        // $(this).css("background-color", "red")
        let numBtn =$(this).data('num')

        if (math===false){
            num =numBtn
            console.log("num 1 = "+num)
            $("#result").html(num)
        }else {
            num2 = numBtn
            console.log("num 2 = "+num2)
            $("#result").html(num2)
        }
    })

    $("#equal").click(function (){
        let result;
        if (equation ==="add"){
            result= num+ num2;
            $("#result").html(result)
        }else if (equation ==="subtract"){
            result = num - num2;
            $("#result").html(result)
        }else if (equation ==="multiply"){
            result = num * num2
            $("#result").html(result)

        }else if (equation === "division"){
            result = num / num2
            $("#result").html(result)

        }

    })


})
