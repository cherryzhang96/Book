/**
 * Created by cherryzhang on 2016/2/18.
 */
var app = angular.module("myApp",["myCtrlTest", "myFilterTest", "myServiceTest","ngAnimate"]);
app.directive("runoobDirective", function(){
    return {
        //restrict : "C", //必须设置 restrict 的值为 "C" 才能通过类名来调用指令
        template:"<h5>自定义指令!</h5>"
    };
});
var app2 = angular.module("myApp2",[]); //创建myApp2
var app3 = angular.module("myApp3",[]); //创建myApp3
angular.element(document).ready(function() {
    angular.bootstrap(document.getElementById("myForm"),["myApp2"]); //多个ng-app时默认加载第一个，其余的得手动启动
    angular.bootstrap(document.getElementById("myScope"),["myApp3"]); //多个ng-app时默认加载第一个，其余的得手动启动
})
