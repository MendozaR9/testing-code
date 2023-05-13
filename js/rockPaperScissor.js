$(document).ready(function (){

    $(".rps").click(function (){
        let cpuRps = cpuChoice()
        let playerChoice = $(this).data('choice')

        RockPaperScissor(playerChoice, cpuRps)
    })


})
function cpuChoice(){
    let choices = ['rock', 'paper', 'scissor']

  let random =   Math.floor(Math.random()*3)
    return choices[random]
}
function RockPaperScissor(player, cpu){
    let outcome = ""
    let options = ['rock', 'paper', 'scissor']
    let choice1 = options.indexOf(player)
    let choice2 = options.indexOf(cpu)
    $("#cp-choice").text("The cpu has choice "+cpu)

    if (player === cpu){
        outcome ="You have tied"
    }
   else if (choice1 === 0 && choice2 === 2 || choice1 ===  1 && choice2 === 0 || choice1 === 2 && choice2 === 1){
       outcome= "You win!"

    }else {
       outcome = "you lose"

    }
   $("#winLose"). text(outcome)
}