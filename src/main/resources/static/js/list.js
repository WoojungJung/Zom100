import * as mo from './mo.js'
//------------------------리스트페이지진입----------------------------
console.log("list.js실행")

let page = 1;
let $userId = $('#userId');
showId();

//왼쪽 상단에 닉네임 띄우기(지정된 userId(닉네임)이 없는경우 이메일주소)
function showId(){
    mo.findId(function(result){
        $userId.text(result.userId);
    });
    console.log('아이디show');
}
//---------------------------------닉네임변경하기----------------------
//닉네임을 클릭하면 input박스로 바꿔준다
$userId.on('click',function(){
    $userId.addClass('hide');
    $('.id-box').toggleClass('hide');
});
//ok 버튼을 누르면 닉네임업데이트, 새로 보여주기
$('.section1-top').on('click','#idChangeDone',function(){
    let modifyId = $('#changeUserId').val();
    mo.changeId(modifyId);
    $('.id-box').toggleClass('hide');
    $userId.removeClass('hide');
    $userId.text(modifyId);
});
//----------------------------------리스트조회----------------------




//----------------------------------리스트내용추가----------------------




//----------------------------------리스트초기화----------------------


