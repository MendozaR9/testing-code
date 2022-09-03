var num =0
var num2 = 0
var math = false
var firstNum= false
var equation;

$(document).ready(function (){
    $(".equation").click(function (){
        math = true;
        firstNum = false;
        equation =$(this).data('equation')
        console.log(equation)
    })

    $("#clear").click(function (){
        num = 0
        num2 = 0
        math =false;
        firstNum = false;
        $("#result").html(num)
    })


    $(".btn").click(function (){
        // $(this).css("background-color", "red")
        let numBtn =$(this).data('num')


        if (math===false){

            if (firstNum === false){
                num = numBtn;
                firstNum = true;
            }else {

                num += numBtn.toString();
               //Parse int will convert a string to a whole number and not a decimal
                num = parseFloat(num)

            }
            console.log("num 1 = "+num)
            $("#result").html(num)
        }

        else {
            console.log(firstNum)
            if (firstNum === false){
                num2 = numBtn
                firstNum = true;
            }
            else {
                num2 += numBtn.toString()
                num2 = parseFloat(num2)
            }
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
//todo figure out why when the decimal is clicked and  number is clicked it does not save the dot.
    $("#dot").click(function (){
        if (math === false && firstNum===true){
            num =num.toString()+"."
            $("#result").html(num)
        }else if (math === true && firstNum === true) {
            num2 = num2.toString()+"."
            $("#result").html(num2)
        }


    })
})
