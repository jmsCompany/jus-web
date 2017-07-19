function initializePage(){
  bindOnResize();
  
}

/*---------------method---------------*/
//
function bindOnResize(){
  var resize=function(){
    var width=$(window).width();
    var height=$(window).height();
    $('.full-height').height(height);
    $('html').css('font-size', width/320*10+'px');
  }
  resize();
  $(window).resize(function(event) {
    resize();
  });
}