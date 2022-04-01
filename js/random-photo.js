let poster = ['../img/movie.jpg', '../img/movie2.jpg','../img/movie3.jpg']
console.log(poster.length)


int();
function int() {
    getcard();
}
function getcard(){
    let html=`<section class="rows">`
    for (let i =0 ; i < 3; i++ ){
        let randomnum = Math.floor(Math.random()*poster.length);
        html+=`<div class="card" style="width: 18rem;">
  <img src='${poster[randomnum]}' class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">Movie</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>`


    }
    html+=`</section>`

    $('#cards').html(html)

}