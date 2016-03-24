/**
 * Created by cherryzhang on 2016/3/8.
 */
angular.module("myServiceTest",[]).service('hexafy', function() {
    this.myFunc = function(x) {
        return x.toString(16);
    }
})