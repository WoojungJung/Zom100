//여기는 모듈

// 닉네임userId조회
export function findId(callback){
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
// 닉네임userID 변경
export function changeId(modifyId, callback){
    $.ajax({
        url : '/zom100wish/changeId',
        type : 'patch',
        data : {userId : modifyId},
        success : function(result){
            if(callback){
                callback(result);
            }
            console.log('변경완료')
        },
        error : function(a,b,c){console.error(c)}
    });
}

export function findList(page,callback,error){
    $.ajax({
        url : `/zom100wish/list/${page}`,
        type : 'get',
        dataType : 'json',
        success : function (result){
            if(callback){
                console.log(result);
                callback(result);
            }
        },
        error : error
    });
}