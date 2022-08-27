var num;
$(document).ready(function (){
    $(".btn").click(function (){
        num = $(this).data('num')
        console.log(num)
    })
})
