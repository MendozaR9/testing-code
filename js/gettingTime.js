var today = new Date();
var time = today.getHours()+":"+ today.getMinutes()+":"+today.getSeconds()
// today.getHours() is the 24 hour format
// today.getMinutes()is the current minute
// today.getSeconds() is the current second when it is run
var date =  today.getMonth()+1 +"/" + today.getDate()+"/"+today.getFullYear()
// today.getMonth() is the month but is a month off
// today.getDate() is the current date
// today.getFullYear() is the current year
console.log(time)
console.log(date)