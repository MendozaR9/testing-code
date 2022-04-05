var checkList = document.getElementById('list1');
checkList.getElementsByClassName('anchor')[0].onclick = function(evt) {
    if (checkList.classList.contains('visible'))
        checkList.classList.remove('visible');
    else
        checkList.classList.add('visible');
}

$('#submit').click( function () {
    let genre = $('.genre:checked').val();
    for (let i = 0; i >$('.genre').length;i++){
        if ($('.genre[i]:checked')){
            console.log($('.genre[i]').val())
        }
    }
    console.log(genre)
})