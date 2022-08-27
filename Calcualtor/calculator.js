var num;
$(document).ready(function (){
    $(".btn").click(function (){
        num = $(this).data('num')
        $("#result").html(num)
        console.log(num)
    })
})
