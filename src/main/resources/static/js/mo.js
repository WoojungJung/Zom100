export function findId(callback){
    $.ajax({
        url : '/zom100wish/findId',
        type : 'get',
        dataType : 'json',
        success : function(result){
            console.log(result.userId)
            if(callback){
                callback(result);
            }
            console.log('조회완료')
        },
        error : function(a,b,c){console.error(c)}
    });
}