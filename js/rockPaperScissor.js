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
    let options = ['rock', 'paper', 'scissor']
    let choice1 = options.indexOf(player)
    let choice2 = options.indexOf(cpu)
    console.log("You have choice "+player)
    console.log("The cpu has choice "+cpu)
    if (player === cpu){
        console.log("You have tied")
    }
   else if (choice1 === 0 && choice2 === 2 || choice1 ===  1 && choice2 === 0 || choice1 === 2 && choice2 === 1){
        console.log('You win!')
    }else {
        console.log('you lose')
    }
}