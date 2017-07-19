/**
 * Created by slashhuang on 16/4/20.
 */


(function(){
    var refreshFunc=function(){
        var params = RouterManager.getParams();
        var viewId='';
        if(params['groupId']){
            //groupId也可以标示页面
            viewId=params['viewId']||params['groupId'];
        }else{
            viewId='materialList'
        }
        var renderUrl = "views/"+viewId+".html";
        $.get(renderUrl,function(data){
            $("#body").html(data);
            var groupId = params['groupId'] || viewId;
            setTimeout(function(){
                $(".menu-img").each(function(){
                    var tid=this.id;
                    tid =tid.substring(4,tid.length);
                    $(this).attr("src", "images/menu/"+tid+".png");
                    $("#"+tid).attr("style","color:#000000;");
                });
                $("#img_"+groupId).attr("src", "images/menu/"+groupId+"_c.png");
                $("#"+groupId).attr("style","color:#FF9900;");
            },0)
        });
    };
    //刷新立即执行
   // refreshFunc();

    window['RefreshManager'] = refreshFunc;
}());