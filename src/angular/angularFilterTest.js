/**
 * Created by cherryzhang on 2016/2/22.
 */
angular.module("myFilterTest",[]).filter("myFilter", function() {
    return function (input) {
        return input.replace(/tank/, "====");
    }
}).filter("myFilterHexafy", ['hexafy', function(hexafy){ //在filter中使用service
    return function(x) {
        return hexafy.myFunc(x);
    };
}]).filter("myFilter2", function() {
    return function (input) {
        return input[0].toUpperCase() + input.slice(1);
    }
})

