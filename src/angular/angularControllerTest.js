/**
 * Created by cherryzhang on 2016/2/22.
 */
angular.module("myCtrlTest", []).controller("myCtrl", function ($scope, $rootScope, $location, $timeout,
                                                                $interval, hexafy, $http, $parse, $interpolate) {
    $scope.name = 'cherry';
    $scope.arr2 = ["Emil", "Linus", "Tobias"];
    $rootScope.age = 21;
    $scope.nameAge = function () {
        return $scope.name + ' : ' + $rootScope.age;
    }
    $scope.today = new Date();
    $scope.myUrl = $location.absUrl();

    $timeout(function () {
        $scope.myTimeOut = 'How are you today?';
    }, 2000);

    $scope.myInterval = new Date().toLocaleTimeString();
    $interval(function () {
        $scope.myInterval = new Date().toLocaleTimeString();
    }, 1000);

    $scope.hex = hexafy.myFunc(255);//hexafy为自定义的service，在angularServiceTest.js里

    var args = {dspId: -25};
    //$http.post('http://localhost:8080/dmp/dsp/dspCount',args).success(function(response){ //post方法，不可行，需进行下面的改造后台才能收到参数
    //    $scope.dsps = response.clickNums;
    //}).error(function(data) {
    //    alert("failure message:" + JSON.stringify({data:data}));
    //});
    //$http.get("http://www.runoob.com/try/angularjs/data/Customers_JSON.php") //get方法
    //    .success(function(response) {$scope.names = response.records;});
    $http({
        url: 'http://localhost:8080/dmp/dsp/dspCount',
        method: "POST",
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        data: args,
        transformRequest: function (obj) {
            var str = [];
            for (var p in obj) {
                str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
            }
            return str.join("&");
        }
    }).success(function (data) {
        $scope.dsps = data.clickNums;
    }).error(function (data) {
        alert("failure message:" + JSON.stringify({data: data}));
    });

    $scope.mySwitch = true;
    $scope.hour = 13;
    $scope.hideVar = true;
    $scope.hideShow = function() {
        $scope.hideVar = !$scope.hideVar;
    }

    $scope.x1 = "john";
    $scope.x11 = angular.uppercase($scope.x1);
    $scope.x2 = "JOHN";
    $scope.x22 = angular.lowercase($scope.x2);
    $scope.x3 = angular.isString($scope.x1);
    $scope.x33 = angular.isString(2);
    $scope.x4 = angular.isNumber(2);
    $scope.x44 = angular.isNumber($scope.x1);

    $scope.message = '';
    $scope.save = function() {
        alert("save!");
    };
    $scope.clear = function() {
        $scope.message = '';
    }
    $scope.left = function() {
        return 100 - $scope.message.length;
    }

    $scope.$watch('expr', function(newVal, oldVal, scope) {
        if (newVal !== oldVal) {
            // Let's set up our parseFun with the expression
            var parseFun = $parse(newVal);
            // Get the value of the parsed expression, set it on the scope for output
            scope.parsedExpr = parseFun(scope);
        }
    });

    $scope.to = 'ari@fullstack.io';
    $scope.emailBody = 'Hello {{ to }},\n\nMy name is Ari too!';
    // Set up a watch
    $scope.$watch('emailBody', function(body) {
        if (body) {
            var template = $interpolate(body);
            $scope.previewText =
                template({to: $scope.to});
        }
    });

    $timeout(function() {
        $rootScope.myHref = 'http://www.baidu.com';
    }, 2000);

    $timeout(function() {
        $rootScope.imgSrc = 'http://img10.360buyimg.com/imgzone/g13/M02/02/0C/rBEhVFM9IygIAAAAAAJXsJP3Z2sAALLgAM5cGQAAlfI313.jpg';
    }, 2000);

    $scope.equation = {};
    $scope.change = function() {
        $scope.equation.output = parseInt($scope.equation.x) + 2;
    }
});

angular.module('myApp3', [])
    .run(function($rootScope) {
        // 使用.run访问$rootScope
        $rootScope.rootProperty = 'root scope';
    })
    .controller('ParentController', function($scope) {
        // 使用.controller访问`ng-controller`内部的属性
        // 在DOM忽略的$scope中，根据当前控制器进行推断
        $scope.parentProperty = 'parent scope';
    })
    .controller('ChildController', function($scope) {
        $scope.childProperty = 'child scope';
        // 同在DOM中一样，我们可以通过当前$scope直接访问原型中的任意属性
        $scope.fullSentenceFromChild = 'Same $scope: We can access: ' +
            $scope.rootProperty + ' and ' +
            $scope.parentProperty + ' and ' +
            $scope.childProperty
    })
    .directive('geliDirective', function() { //隔离作用域
        return {
            restrict: 'A',
            replace: true,
            scope: {
                geliUrl: '@', //绑定策略
                geliLinkText: '@' //绑定策略
            },
            template: '<a href="{{geliUrl}}">{{geliLinkText}}</a>'
        };
    })
    .directive('geli2Directive', function() {//双向数据绑定
        return {
            restrict: 'A',
            replace: true,
            scope: {
                geli2Url: '=someAttr', //绑定策略 不能用@策略，@得到的是dom属性值里的副本
                geli2LinkText: '@' //绑定策略
            },
            template: ' <div><label>My Url Field:</label>' +
            '<input type="text" ng-model="geli2Url" />' +
            '<a href="{{geli2Url}}">{{geli2LinkText}}</a></div>'
        }
    })
    .controller('SomeController', function($scope) {  //由于原型继承的关系，修改父级对象中的someBareValue会同时修改子对象中的值，但反之则不行。
        $scope.someBareValue = "hello computer";
        $scope.someAction = function() {
            $scope.someBareValue = 'hello human, from parent';
        }
    })
    .controller('ChildController', function($scope) {
        $scope.childAction = function() {
            $scope.someBareValue = 'hello human, from child';
        };
    })
    .controller('SomeController2', function($scope) {
        $scope.someModel = {
            someValue:'hello computer'
        };
        $scope.someAction = function() {
            $scope.someModel.someValue = 'hello human, from parent';
        }
    })
    .controller('ChildController2', function($scope) {//JavaScript对象要么是值复制要么是引用复制。字符串、数字和布尔型变量是值复制。数组、对象和函数则是引用复制
        //如果将模型对象的某个属性设置为字符串，它会通过引用进行共享，因此在子$scope中修改属性也会修改父$scope中的这个属性
        $scope.childAction = function() {
            $scope.someModel.someValue = 'hello human, from child';
        };
    });
