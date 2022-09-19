$(document).ready(function (){

    $(".rps").click(function (){
        console.log($(this).data('choice'))
        console.log(cpuChoice())
    })
})
function cpuChoice(){
    let choices = ['rock', 'paper', 'scissor']
  let random =   Math.floor(Math.random()*3)
    return choices[random]
}