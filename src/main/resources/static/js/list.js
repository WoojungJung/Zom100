// import * as mo from './mo.js'
console.log("list.js실행")

let page = 1;


//왼쪽 상단에 닉네임 띄우기(지정된 userId(닉네임)이 없는경우 이메일주소)
findId(function(result){
    console.log(result.userId);
    $('#userId').text(result.userId);
});







//모듈이 import되지 않아서 임의로 여기에 작성
function findId(callback){
    $.ajax({
        url : '/zom100wish/findId',
        type : 'get',
        dataType : 'json',
        success : function(result){
            if(callback){
                callback(result);
            }
            console.log('조회완료')
        },
        error : function(a,b,c){console.error(c)}
    });
}
