//여기는 모듈

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