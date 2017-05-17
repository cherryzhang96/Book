/**
 * Created by cherryzhang on 2015/10/29.
 */
window.onload = function () {
    //alert(indexOf([1, 2, 3, 4], 3))
    //alert(sum([1, 2, 3, 4]));
    //remove([1, 2, 3, 4, 2], 2);
    //alert(removeWithoutCopy([1, 2, 2, 3, 4, 2, 2], 2));
    //append([1, 2, 3, 4],  10);
    //truncate([1, 2, 3, 4]);
    //prepend([1, 2, 3, 4], 10);
    //curtail([1, 2, 3, 4]);
    //concat([1, 2, 3, 4], ['a', 'b', 'c', 1]);
    //insert([1, 2, 3, 4], 'z', 2);
    //count([1, 2, 4, 4, 3, 4, 3], 4);
    //alert(duplicates([1, 2, 4, 4, 3, 3, 1, 5, 3]).sort());
    //alert(square([1, 2, 3, 4]));
    //alert(findAllOccurrences('abcdefabc'.split(''), 'a').sort());
    //alert(functions(true))
    //alert(parse2Int('12')+'---'+parse2Int('12px')+'---'+parse2Int('0x12'));
    //alert(identity(1,'1'))
    //count(1,10);
    //alert(fizzBuzz('3'));
    //alert(argsAsArray(function (greeting, name, punctuation) {return greeting + ', ' + name + (punctuation || '!');}, ['Hello', 'Ellie', '?']));
    //alert(speak(function () {return this.greeting + ', ' + this.name + '!!!';}, {greeting: 'Hello', name: 'Rebecca'}));
    //alert(functionFunction('Hello')('world'));

    //var arr = [1, 2, 3];
    //var square = function (x) { return x * x; };
    //var funcs = makeClosures(arr, square);
    //alert(funcs[2]());

    //var sayIt = function(greeting, name, punctuation) {
    //    return greeting + ', ' + name + (punctuation || '!');
    //};
    //alert(partial(sayIt, 'Hello', 'Ellie')('!!!'));

    //alert(useArguments(1, 2, 3, 4));

    //var a = 1;
    //var b = 2;
    //var test = function (first, second) {
    //    return first === a && second === b;
    //};
    //alert(callIt(test, a, b));

    //var a = 1;
    //var b = 2;
    //var c = 3;
    //var d = 4;
    //var test = function (first, second, third, forth) {
    //    return first + second + third + forth;
    //};
    //alert(partialUsingArguments(test, a, b)(c, d));

    //var fn = function (a, b, c) {
    //    return a + b + c
    //};
    //alert(curryIt(fn)(1)(2)(3));

    //alert(or(false, true));

    //alert(and(false, true));

    //alert(createModule(1,2).sayIt());

    //alert(valueAtBit(128, 8));

    //alert(base10('11000000'));

    //alert(convertToBinary(65));

    //alert(multiply(3, 0.0001));

    //alert(alterContext(function() {return this.greeting + ', ' + this.name + '!'; }, {name: 'Rebecca', greeting: 'Yo' }));

    //storage();

    //var C = function (name) {
    //    this.name = name;
    //    return this;
    //};
    //var obj1 = new C('Rebecca');
    //alterObjects(C, 'What\'s up');
    //alert(obj1.greeting);

    //var C = function () {
    //    this.foo = 'bar';
    //    this.baz = 'bim';
    //};
    //C.prototype.bop = 'bip';
    //alert(iterate(new C()));

    //alert(containsNumber('abc123'));

    //alert(containsRepeatingLetter('rattler'));

    //alert(endsWithVowel('gorillaf'));

    //alert(captureThreeNumbers('aaa932adr'))

    //alert(matchesPattern('800-555-1212'))

    //alert(isUSD('$20,933,209.93'));

    //earlyDeclar();
    //click();

    //crossDomain();

    //alert(unique(['a','d','c','b','d']))

    //compare()

    //loop()

    //nullEqual();

    //numTest();

    //jsonTest();

    //flowMsg();

    //jsonUnicode();

    //alert(unixTime2Date(1478184946, true));

    //changeP();

    //madeJson();

    //splitStr();

    //timeoutTest(parseInt(60));
    //urlTest();

    objectTest();
}


//返回item在arr中的下标，没有则为-1
function indexOf(arr, item) {
    return arr.indexOf(item);
}

//返回数组arr里元素的求和
function sum(arr) {
    var result = 0;
    for (var i = 0; i < arr.length; i++) {
        result += arr[i];
    }
    return result;
}

//删除数组arr中为item的元素，且不改变原数组，结果返回新的数组
function remove(arr, item) {
    //----------方法一
    //var newArr = arr.concat();
    //for(var i = 0; i < newArr.length; i++) {
    //    if(item == newArr[i]) {
    //        newArr.splice(i, 1); //下标  删除个数  替代内容
    //    }
    //}


    //----------方法二
    var newArr = [];
    for(var i = 0; i < arr.length ; i++) {
        if(item != arr[i]) {
            newArr.push(arr[i]);
        }
    }
    alert(arr);
    alert(newArr) ;
}

//删除数组arr中为item的元素，直接改变原数组
function removeWithoutCopy(arr, item) {
    for (var i = 0; i < arr.length; i++) {
        if (item == arr[i]) {
            arr.splice(i, 1);
            i--;
        }
    }
    alert(arr)
}

//在数组中arr后追加item，且不改变原数组，结果返回新的数组
function append(arr, item) {
    var newArr = arr.concat(item);
    alert(arr)
    alert(newArr)
}

//删除数组 arr 最后一个元素。不要直接修改数组 arr，结果返回新的数组
function truncate(arr) {
    alert(arr)
    alert( arr.slice(0, arr.length - 1));
}

//在数组 arr 开头添加元素 item。不要直接修改数组 arr，结果返回新的数组
function prepend(arr, item) {
    var newArr = [item];
    alert(newArr.concat(arr));
    alert(arr)
}

//删除数组 arr 第一个元素。不要直接修改数组 arr，结果返回新的数组
function curtail(arr) {
    alert(arr.slice(1, arr.length))
}

//合并数组 arr1 和数组 arr2。不要直接修改数组 arr，结果返回新的数组
function concat(arr1, arr2) {
    alert(arr1.concat(arr2))
}

//在数组 arr 的 index 处添加元素 item。不要直接修改数组 arr，结果返回新的数组
function insert(arr, item, index) {
    var newArr = arr.slice();
    newArr.splice(index, 0, item);
    alert(newArr)

    //---------或者
    //var newArr1 = arr.slice(0, index);
    //var newArr2 = arr.slice(index, arr.length);
    //var result = newArr1.concat(item).concat(newArr2);
    //alert(result)
}

//统计数组 arr 中值等于 item 的元素出现的次数
function count(arr, item) {
    var newArr = arr.filter(function(a) {
        return a === item;
    });
    alert(newArr.length)
}

//找出数组 arr 中重复出现过的元素
function duplicates(arr) {
    var arr2 = arr.slice();
    var result1 = [];
    var result2 = [];
    for(var i = 0; i < arr2.length; i++) {
        if(result1.indexOf(arr2[i]) == -1) {
            result1.push(arr2[i]);  //存放去重后的数组
        } else if (result2.indexOf(arr2[i]) == -1) {
            result2.push(arr2[i]);  //存放重复的数(且重复的数不再重复)
        }
    }
    return result2;
}

//为数组 arr 中的每个元素求二次方。不要直接修改数组 arr，结果返回新的数组
function square(arr) {
    var newArr = [];
    for(var i = 0; i < arr.length; i++) {
        newArr.push(arr[i]*arr[i]);
    }
    return newArr;
}

//在数组 arr 中，查找值与 item 相等的元素出现的位置
function findAllOccurrences(arr, target) {
    var result = [];
    for(var i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            result.push(i);
        }
    }
    return result;
}

//函数定义
function functions(flag) {
    function getValue() {
        if (flag) {
            return 'a';
        } else {
            return 'b';
        }
    }
    return getValue();
}

//正确的使用 parseInt
function parse2Int(num) {
    return parseInt(num,10);
}

//判断 val1 和 val2 是否完全等同
function identity(val1, val2) {
    return val1 === val2;
}

//实现一个打点计时器，要求
//1、从 start 到 end（包含 start 和 end），每隔 100 毫秒 console.log 一个数字，每次数字增幅为 1
//2、返回的对象中需要包含一个 cancel 方法，用于停止定时操作
//3、第一个数需要立即输出
function count(start, end) {
    //var st = setTimeout(function(){
    //    if (start <= end) {
    //        console.log(start);
    //        start++;
    //    }
    //    count(start, end);
    //}, 100);
    //return{cancel: function(){clearTimeout(st)}};

    //或者
    console.log(start++);
    var timer = setInterval(function () {
        if (start <= end) {
            console.log(start++);
        } else {
            clearInterval(timer);
        }
    }, 100);
    return {
        cancel: function () {
            clearInterval(timer);
        }
    }
}

//实现 fizzBuzz 函数，参数 num 与返回值的关系如下：
//1、如果 num 能同时被 3 和 5 整除，返回字符串 fizzbuzz
//2、如果 num 能被 3 整除，返回字符串 fizz
//3、如果 num 能被 5 整除，返回字符串 buzz
//4、如果参数为空或者不是 Number 类型，返回 false
//5、其余情况，返回参数 num
function fizzBuzz(num) {
    if(null == num || undefined == num || (typeof num) != "number") {
        return false;
    } else if(num%3 == 0 && num%5 == 0) {
        return "fizzbuzz";
    } else if(num%3 == 0) {
        return "fizz";
    } else if(num%5 == 0) {
        return "buzz";
    } else {
        return num;
    }
}

//将数组 arr 中的元素作为调用函数 fn 的参数
//调用函数可以使用call或者apply这两个方法，
//区别在于call需要将传递给函数的参数明确写出来，是多少参数就需要写多少参数。
//而apply则将传递给函数的参数放入一个数组中，传入参数数组即可。
function argsAsArray(fn, arr) {
    return fn.apply(this, arr);
}

//将函数 fn 的执行上下文改为 obj 对象
//在JavaScript中，函数是一种对象，其上下文是可以变化的，对应的，函数内的this也是可以变化的，
//函数可以作为一个对象的方法，也可以同时作为另一个对象的方法，可以通过Function对象中的call或者apply方法来修改函数的上下文，
//函数中的this指针将被替换为call或者apply的第一个参数。将函数 fn 的执行上下文改为 obj 对象，
//只需要将obj作为call或者apply的第一个参数传入即可。
function speak(fn, obj) {
    return fn.apply(obj, obj);
}

//实现函数 functionFunction，调用之后满足如下条件：
//1、返回值为一个函数 f
//2、调用返回的函数 f，返回值为按照调用顺序的参数拼接，拼接字符为英文逗号加一个空格，即 ', '
//3、所有函数的参数数量为 1，且均为 String 类型
function functionFunction(str) {
    return function(str2) {
        return str + ', ' + str2;
    }
}

//实现函数 makeClosures，调用之后满足如下条件：
//1、返回一个函数数组 result，长度与 arr 相同
//2、运行 result 中第 i 个函数，即 result[i]()，结果与 fn(arr[i]) 相同

//简单的描述闭包：如果在函数func内部声明函数inner，然后在函数外部调用inner，这个过程即产生了一个闭包。
//题目要求的是返回一个函数数组，如果在循环中直接写result[i] = function(){return fn(arr[i]);}
//或者result.push(function(){return fn(arr[i]);})，最终的结果是不正确的，因为在每次迭代的时候，
//那样的语句后面的方法并没有执行，只是创建了一个函数体为“return fn(arr[i]);”的函数对象而已，
//当迭代停止时，i为最终迭代停止的值，在函数被调用时，i依旧为最终迭代停止的值，因此无法返回正确的结果。
//为了解决这个问题，需要声明一个匿名函数，并立即执行它。
//function(num){return function(){return fn(arr[num]); }; }(i)，函数执行后，i立即传入并被内部函数访问到，
//因此就能得到正确的结果。闭包允许你引用存在于外部函数中的变量。
function makeClosures(arr, fn) {
    var result = [];
    for (var i = 0; i < arr.length; i++) {
        result[i] = (function(i){
            return function() {
                return fn(arr[i])
            }
        })(i);
    }
    return result;
}

//已知函数 fn 执行需要 3 个参数。请实现函数 partial，调用之后满足如下条件：
//1、返回一个函数 result，该函数接受一个参数
//2、执行 result(str3) ，返回的结果与 fn(str1, str2, str3) 一致
function partial(fn, str1, str2) {
    var result = function(str3) {
        return fn.call(this, str1, str2, str3);
    }
    return result;
}

//函数 useArguments 可以接收 1 个及以上的参数。
//请实现函数 useArguments，返回所有调用参数相加后的结果。
//本题的测试参数全部为 Number 类型，不需考虑参数转换。
function useArguments() {
    var result = 0;
    for(var i = 0; i < arguments.length; i++) {
        result += arguments[i];
    }
    return result;
}

//实现函数 callIt，调用之后满足如下条件
//1、返回的结果为调用 fn 之后的结果
//2、fn 的调用参数为 callIt 的第一个参数之后的全部参数

//因为arguments并非真正的数组，因此要获得callIt的第一个参数之后的所有参数，
//不能直接使用slice方法截取，需要先将arguments转换为真正的数组才行。
//有两种常见的方法，一是使用slice方法：var args = Array . prototype . slice . call ( arguments );
//二是循环遍历逐一填入新数组。在获得了args之后，就可以调用apply来执行传入的函数参数。
function callIt(fn) {
    var ar2 = Array.prototype.slice.call(arguments, 1);
    return fn.apply(this, ar2);
}

//实现函数 partialUsingArguments，调用之后满足如下条件：
//1、返回一个函数 result
//2、调用 result 之后，返回的结果与调用函数 fn 的结果一致
//3、fn 的调用参数为 partialUsingArguments 的第一个参数之后的全部参数以及 result 的调用参数
function partialUsingArguments(fn) {
    var ar1 = Array.prototype.slice.call(arguments, 1);
    var result = function() {
        var ar2 = Array.prototype.slice.call(arguments);
        var ar3 = ar1.concat(ar2);
        return fn.apply(this, ar3);
    };
    return result;
}

//已知 fn 为一个预定义函数，实现函数 curryIt，调用之后满足如下条件：
//1、返回一个函数 a，a 的 length 属性值为 1（即显式声明 a 接收一个参数）
//2、调用 a 之后，返回一个函数 b, b 的 length 属性值为 1
//3、调用 b 之后，返回一个函数 c, c 的 length 属性值为 1
//4、调用 c 之后，返回的结果与调用 fn 的返回值一致
//5、fn 的参数依次为函数 a, b, c 的调用参数

//柯里化是把接受多个参数的函数变换成接受一个单一参数(最初函数的第一个参数)的函数，
//并且返回接受余下的参数且返回结果的新函数的技术。简单理解题目意思，就是指，
//我们将预定义的函数的参数逐一传入到curryIt中，当参数全部传入之后，就执行预定义函数。
//于是，我们首先要获得预定义函数的参数个数fn.length，然后声明一个空数组去存放这些参数。
//返回一个匿名函数接收参数并执行，当参数个数小于fn.length，则再次返回该匿名函数，继续接收参数并执行，
//直至参数个数等于fn.length。最后，调用apply执行预定义函数。
function curryIt(fn) {
    //获取fn参数的数量
    var n = fn.length;
    //声明一个数组args
    var args = [];
    //返回一个匿名函数
    return function(arg){
        //将curryIt后面括号中的参数放入数组
        args.push(arg);
        //如果args中的参数个数小于fn函数的参数个数，
        //则执行arguments.callee（其作用是引用当前正在执行的函数，这里是返回的当前匿名函数）。
        //否则，返回fn的调用结果
        if(args.length < n){
            return arguments.callee;
        }else return fn.apply("",args);
    }
}

//返回参数 a 和 b 的逻辑或运算结果
function or(a, b) {
    return a || b;
}

//返回参数 a 和 b 的逻辑且运算结果
function and(a, b) {
    return a && b;
}

//完成函数 createModule，调用之后满足如下要求：
//1、返回一个对象
//2、对象的 greeting 属性值等于 str1， name 属性值等于 str2
//3、对象存在一个 sayIt 方法，该方法返回的字符串为 greeting属性值 + ', ' + name属性值
function createModule(str1, str2) {
    var obj = {
        greeting: str1,
        name: str2,
        sayIt: function() {
            return this.greeting + "," + this.name;
        }
    };
    return obj;
}

//获取数字 num 二进制形式第 bit 位的值。注意：
//1、bit 从 1 开始
//2、返回 0 或 1
//3、举例：2 的二进制为 10，第 1 位为 0，第 2 位为 1

//通过num.toString(2)能直接将num转换为2进制数格式的字符串，利用下标就能将对应值取出来。
//题目返回的数字是从右往左，因此下标为倒数。
function valueAtBit(num, bit) {
    var to = parseInt(num).toString(2);  //将十进制转为二进制，转八进制十六进制同理  parseInt(num,8).toString(2)为八进制转为二进制
    return to[to.length - bit];
}

//给定二进制字符串，将其换算成对应的十进制数字
function base10(str) {
    var to = parseInt(str, 2);
    return to;
}

//将给定数字转换成二进制字符串。如果字符串长度不足 8 位，则在前面补 0 到满8位。
function convertToBinary(num) {
    var to = parseInt(num).toString(2);
    if (to.length >= 8) {
        return to;
    } else {
        var differ = 8 - to.length;
        var str = '';
        for (var i = 0; i < differ; i++) {
            str += '0';
        }
        return str + to;
    }
}

//求 a 和 b 相乘的值，a 和 b 可能是小数，需要注意结果的精度问题
function multiply(a, b) {
    return a * b;
}

//将函数 fn 的执行上下文改为 obj，返回 fn 执行后的值
function alterContext(fn, obj) {
    return fn.apply(obj, obj);
}

function storage() {
    //localStorage.setItem("key1", "a");
    //alert(localStorage.getItem("key1"));

    //if (localStorage.getItem("num")) {
    //    localStorage.setItem("num", Number(localStorage.getItem("num"))+1);
    //} else {
    //    localStorage.setItem("num", 1);
    //}
    //alert(localStorage.getItem("num"));

    //sessionStorage.setItem("num", 1);
    //alert(sessionStorage.getItem("num"));

    if (sessionStorage.getItem("num")) {
        sessionStorage.setItem("num", Number(sessionStorage.getItem("num")) + 1);
    } else {
        sessionStorage.setItem("num", 1);
    }
    alert(sessionStorage.getItem("num"));
}

//给定一个构造函数 constructor，请完成 alterObjects 方法，
//将 constructor 的所有实例的 greeting 属性指向给定的 greeting 变量。
//这是原型链问题。访问一个对象的方法或者是属性，首先会在该对象中寻找，如果找到则返回，
//如果没找到，则在其原型链上面向上寻找，直至基原型，如还未找到，则返回undefined。
//将 constructor 的所有实例的 greeting 属性指向给定的 greeting 变量，
//只需要在constructor的原型上面添加greeting属性，并指定值。
function alterObjects(constructor, greeting) {
   constructor.prototype.greeting = greeting;
}

//找出对象 obj 不在原型链上的属性(注意这题测试例子的冒号后面也有一个空格~)
//1、返回数组，格式为 key: value
//2、结果数组不要求顺序
function iterate(obj) {
    var result = [];
    for(var key in obj) {
        if (obj.hasOwnProperty(key)) {
            result.push(key + ": " + obj[key]);
        }
    }
    return result;
}

//给定字符串 str，检查其是否包含数字，包含返回 true，否则返回 false
function containsNumber(str) {
    var pattern = /\d/;
    return pattern.test(str);
}

//给定字符串 str，检查其是否包含连续重复的字母（a-zA-Z），包含返回 true，否则返回 false
//在正则表达式中，利用()进行分组，使用斜杠加数字表示引用，
//  \1就是引用第一个分组，\2就是引用第二个分组。将[a-zA-Z]做为一个分组，然后引用，就可以判断是否有连续重复的字母。
function containsRepeatingLetter(str) {
    var pattern = /([a-zA-Z])\1/;
    return pattern.test(str);
}

//给定字符串 str，检查其是否以元音字母结尾
//1、元音字母包括 a，e，i，o，u，以及对应的大写
//2、包含返回 true，否则返回 false
//首先确定元音集合[a,e,i,o,u]，然后是以元音结尾，加上$，最后通配大小写，加上i。
function endsWithVowel(str) {
    var pattern = /[a,e,i,o,u]$/i;
    return pattern.test(str);
}

//给定字符串 str，检查其是否包含 3 个连续的数字
//1、如果包含，返回最新出现的 3 个数字的字符串
//2、如果不包含，返回 false
//实际考察的是字符串中是否含有连续的三个任意数字，而不是三个连续的数字。
// 依题，若存在连续的三个任意数字，则返回最早出现的三个数字，若不存在，则返回false。
// 因此需要用到match方法，match()返回的是正则表达式匹配的字符串数组，连续的三个任意数字用正则表达式表示为/\d{3}/。
function captureThreeNumbers(str) {
    var arr = str.match(/\d{3}/);
    if (arr) {
        return arr[0];
    } else {
        return false;
    }
}

//给定字符串 str，检查其是否符合如下格式
//1、XXX-XXX-XXXX
//2、其中 X 为 Number 类型
//开头^和结尾$必须加上来限定字符串，3个数可表示为\d{3}，4个数则为\d{4}，{n}表示前面内容出现的次数。
// 正则表达式可写作/^\d{3}-\d{3}-\d{4}$/，有相同部分\d{3}-，因此也可写作/^(\d{3}-){2}\d{4}$/
function matchesPattern(str) {
    var pattern = /^\d{3}-\d{3}-\d{4}$/; //or  /^(\d{3}-){2}\d{4}$/
    return pattern.test(str);
}

//给定字符串 str，检查其是否符合美元书写格式
//1、以 $ 开始
//2、整数部分，从个位起，满 3 个数字用 , 分隔
//3、如果为小数，则小数部分长度为 2
//4、正确的格式如：$1,023,032.03 或者 $2.03，错误的格式如：$3,432,12.12 或者 $34,344.3

//首先，开头必是$，而正则表达式中$表示结尾，需要进行转义，因此开头为^\$
//然后$后必然接数字，并且最少一位，最多三位数，可用{m,n}表示,最少m位，最多n位，因此此段为\d{1,3}
//接着，后面如还有数，则必然有，分隔，并且后面必有3个数，类似于，XXX的格式会出现0或者n次，因此此段可表示为(,\d{3})*
//最后，如有小数部分，则注意对小数点进行转义，此段可表示为(\.\d{2})?(?的意思为匹配0或1个正好在它之前的那个字符)
function isUSD(str) {
    var pattern = /^\$(\d{1,3})(,\d{3})*(\.\d{2})?$/;
    return pattern.test(str);
}

//提前声明
var b = 1;
function earlyDeclar() {
    console.log(b); //在函数内部查找上下文是否有b的声明，有声明。但是赋值操作不能提前，所以类型为undefined
    console.log(!b);//！undefined为true
    if (!b) {
        var b = 2;
    }
    console.log(b); //b赋值成功，为2
}

//--------继承
//----------------------------.js原型（prototype）实现继承
//function person(name, age) {
//    this.name = name;
//    this.age = age;
//    this.child = [1,2];
//}
//person.prototype.say = function() {
//    alert("使用原型得到Name：" + this.name)
//}
////var per = new person("cherry", 22);
////per.say();
//
//function Student() {}
//Student.prototype = new person("cherryStu", 23);//继承person类并初始化
//Student.prototype.grade = 3;//定义新的属性
//Student.prototype.init = function() { //定义新的方法
//    alert(this.child);
//}
//var stu = new Student();
////stu.say(); //父类方法可以调用
//stu.init(); //1,2
//
//var stu2 = new Student();   //缺点：当有子类有多个实例时，其中一个实例改变父类中的属性值，其他子类跟着变化
//stu.child.push(3);
//stu2.init();//1,2,3
//stu.init();//1,2,3


//----------------------------.js构造函数实现继承
//function  Parent(name){
//    this.name=name;
//    this.sayParent = function() {
//        alert("Parent:"+this.name);
//    }
//}
////父类方法如改成这样定义，则子类在用构造函数继承时不能调用
////Parent.prototype.sayParent = function() {
////    alert("Parent:"+this.name);
////}
//function Child(name, age) {
//    this.tempMethod = Parent; //tempMethod为自定义名字， 这里使用了构造函数继承 对象冒充
//    this.tempMethod(name);
//    this.age = age;
//    this.sayChild = function() {
//        alert("Child:" + this.name + " age:" + this.age);
//    }
//}
//var par = new Parent("Father");
//par.sayParent();
//var child = new Child("Lucy", 22);
//child.sayChild();
//child.sayParent();
//----------------------------call apply实现继承
//function Person(name, age, love) {
//    this.name = name;
//    this.age = age;
//    this.love = love;
//    this.say = function say() {
//        alert("姓名：" + name + " 年龄：" + age + " 爱人：" + love);
//    }
//}
//function Student(name, age) {
//    Person.call(this, name, age);
//}
//function Teacher(name, age) {
//    Person.apply(this, [name, age]);
//}
//var per = new Person("武凤楼", 25, "魏荧屏");
//per.say();
//var stu = new Student("曹玉", 18);
//stu.say();
//var tea = new Teacher("秦杰", 16);
//tea.say();
//--------继承end

//----------------------------闭包使用场景
//function funcRef(paramA, paramB, paramC) {
//    alert(paramA+paramB+paramC)
//};
///*调用setTimeout函数，传递内部函数的引用作为第一个参数*/
//setTimeout(funcRef("a", "b", "c"), 500);
//function callLater(paramA, paramB, paramC) {
//    /*使用函数表达式创建并放回一个匿名内部函数的引用*/
//    return (function () {
//        /*
//         这个内部函数将被setTimeout函数执行；
//         并且当它被执行时，
//         它能够访问并操作外部函数传递过来的参数
//         */
//        alert(paramA+paramB+paramC)
//    });
//}
//
///*
// 调用这个函数将在它的执行上下文中创建，并最终返回内部函数对象的引用
// 传递过来的参数，内部函数在最终被执行时，将使用外部函数的参数
// 返回的引用被赋予了一个变量
// */
//var funcRef = callLater("elStyle ", "display ", "none ");
///*调用setTimeout函数，传递内部函数的引用作为第一个参数*/
//setTimeout(funcRef, 500);
function click() {
    for (var i = 1; i < 4; i++) {
        var id = document.getElementById("a" + i);
        //id.onclick = function () {  //每次都会是4，因为循环完毕后i值变成了4
        //    alert(i)
        //};
        id.onclick = (function (i) { //保存i的值
            return function () {
                alert(i);
            }
        })(i);

    }
}

function crossDomain() {
    //$.ajax({
    //    type:"get",
    //    url: "http://localhost:8080/dmp/broadbanddmp/findTop10Data?broadbandId=178001",
    //    dataType:"jsonp",
    //    jsonp:"s_callback",
    //    success:function(data) {
    //    }
    //})
    $.getJSON("http://localhost:8080/dmp/broadbanddmp/findTop10Data?callback=?", {broadbandId:"178001"}, function(data){
        //alert(JSON.stringify(data));
    })
}

function s_callback(data) {
    alert("---"+JSON.stringify(data))
}

function unique(arr) {
    //arr.sort(function(a,b){ return a>b?1:-1}); //升序，sort里为空默认为也为升序
    arr.sort(function (a, b) {
        return a < b ? 1 : -1
    });//降序
    var re = [arr[0]];
    for (var i = 1; i < arr.length; i++) {
        if (re[re.length - 1] != arr[i]) {
            re.push(arr[i]);
        }
    }
    return re;
}

function compare() {
    alert('false == "false"  ' + (false == "false")); //false
    alert('false == "0"  ' + (false == "0")); //true
    alert('false == undefined  ' + (false == undefined)); //false
    alert('false == null  ' + (false == null)); //false
    alert('null == undefined  ' + (null == undefined)); //true
    alert('"\t\r\n" == 0  ' + ("\t\r\n" == 0)); //true
    alert('{}==={}  ' + ({}==={})); //false
    alert('new String("foo") === "foo"  ' + (new String('foo') === 'foo')); //false
    alert('new Number(10) === 10  ' + (new Number(10) === 10)); //false
    var foo = {};
    alert('var foo = {};foo == foo  ' + (foo == foo)) //true

}

function loop() {
    //--------------for in
    var x
    var mycars = new Array()
    mycars[0] = "Saab"
    mycars[1] = "Volvo"
    mycars[2] = "BMW"
    var mycars = {'key1':'value1', 'key2':'value2'};

    for (x in mycars)
    {
        console.log(x + mycars[x])
    }

}

function nullEqual() {
    var a = null;
    var b = '';
    var c = undefined;
    var d = 2;
    alert(d + " : isNaN " + isNaN(d));//not a number --true
    alert(a==b); //false
    alert(a==c); //true
    alert(b==c); //false
}

var num=10;
function numTest() {
    alert(num);
    var num=100;
    alert(num);
}

function jsonTest() {
    var j = jQuery.parseJSON('{"aKey":"a","bKey":"b"}');//json字符串转json对象方法1
    alert(j.aKey);
    var j2 = eval('('+'{"aKey":"a","bKey":"b"}'+')');//json字符串转json对象方法2
    alert(j2.bKey);
    var j3 = {"aKey":"a","bKey":"b"};//直接json对象
    alert(j3.aKey);
    alert(JSON.stringify(j3));//json对象转Json字符串
}

function flowMsg(){
    var url="https://sp0.baidu.com/9_Q4sjW91Qh3otqbppnN2DJv/pae/channel/data/asyncqury?cb=s_callback&appid=4001&com=shunfeng&nu=150459090273&vcode=&token=&_=1478495920104";
    $.ajax({
        url:url,
        type:"get",
        dataType:"jsonp",
        jsonp:"s_callback",
        success:function(data){
            alert(JSON.stringify(data));
        },
        error:function(){
            alert("error");
        }
    })

}

function s_callback(obj){
    if (obj==""||obj==null||obj==undefined) {
        console.log("物流信息返回空")
    }else{
        alert("----"+JSON.stringify(obj));
    }
}

function jsonUnicode() {
    var a = '{"message":"记录成功！","status":1,"code":1,"logistics":"{\"msg\":\"\",\"status\":\"0\",\"error_code\":\"0\",\"data\":{\"info\":{\"status\":\"1\",\"com\":\"shunfeng\",\"state\":\"3\",\"context\":[{\"time\":\"1478306865\",\"desc\":\"\\u5df2\\u7b7e\\u6536,\\u611f\\u8c22\\u4f7f\\u7528\\u987a\\u4e30,\\u671f\\u5f85\\u518d\\u6b21\\u4e3a\\u60a8\\u670d\\u52a1\"},{\"time\":\"1478304563\",\"desc\":\"\\u5feb\\u4ef6\\u4ea4\\u7ed9\\u5468\\u632f\\u4e91\\uff0c\\u6b63\\u5728\\u6d3e\\u9001\\u9014\\u4e2d\\uff08\\u8054\\u7cfb\\u7535\\u8bdd\\uff1a18536891936\\uff09\"},{\"time\":\"1478304563\",\"desc\":\"\\u5feb\\u4ef6\\u5230\\u8fbe \\u3010\\u592a\\u539f\\u5e02\\u5c0f\\u5e97\\u533a\\u534e\\u5e9c\\u8425\\u4e1a\\u70b9\\u3011\"},{\"time\":\"1478280301\",\"desc\":\"\\u5feb\\u4ef6\\u5728\\u3010\\u592a\\u539f\\u5c0f\\u5e97\\u96c6\\u6563\\u4e2d\\u5fc3\\u3011\\u5df2\\u88c5\\u8f66\\uff0c\\u51c6\\u5907\\u53d1\\u5f80 \\u3010\\u592a\\u539f\\u5e02\\u5c0f\\u5e97\\u533a\\u534e\\u5e9c\\u8425\\u4e1a\\u70b9\\u3011\"},{\"time\":\"1478261758\",\"desc\":\"\\u5feb\\u4ef6\\u5230\\u8fbe \\u3010\\u592a\\u539f\\u5c0f\\u5e97\\u96c6\\u6563\\u4e2d\\u5fc3\\u3011\"},{\"time\":\"1478184946\",\"desc\":\"\\u5feb\\u4ef6\\u5728\\u3010\\u5317\\u4eac\\u9996\\u90fd\\u673a\\u573a\\u96c6\\u6563\\u4e2d\\u5fc32\\u3011\\u5df2\\u88c5\\u8f66\\uff0c\\u51c6\\u5907\\u53d1\\u5f80 \\u3010\\u592a\\u539f\\u5c0f\\u5e97\\u96c6\\u6563\\u4e2d\\u5fc3\\u3011\"},{\"time\":\"1478181800\",\"desc\":\"\\u5feb\\u4ef6\\u5230\\u8fbe \\u3010\\u5317\\u4eac\\u9996\\u90fd\\u673a\\u573a\\u96c6\\u6563\\u4e2d\\u5fc32\\u3011\"},{\"time\":\"1478175926\",\"desc\":\"\\u5feb\\u4ef6\\u5728\\u3010\\u5317\\u4eac\\u6d77\\u6dc0\\u5317\\u7406\\u5de5\\u8425\\u4e1a\\u70b9\\u3011\\u5df2\\u88c5\\u8f66\\uff0c\\u51c6\\u5907\\u53d1\\u5f80 \\u3010\\u5317\\u4eac\\u9996\\u90fd\\u673a\\u573a\\u96c6\\u6563\\u4e2d\\u5fc32\\u3011\"},{\"time\":\"1478162638\",\"desc\":\"\\u987a\\u4e30\\u901f\\u8fd0 \\u5df2\\u6536\\u53d6\\u5feb\\u4ef6\"}],\"_source_com\":\"\"},\"com\":\"shunfeng\",\"company\":{\"url\":\"http:\\/\\/www.kuaidi100.com\\/all\\/sf.shtml?from=openv\",\"fullname\":\"\\u987a\\u4e30\\u901f\\u8fd0\",\"shortname\":\"\\u987a\\u4e30\",\"icon\":{\"id\":\"16\",\"smallurl\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=1807529516,3291075151&fm=58\",\"smallpos\":\"0,32\",\"middleurl\":\"https:\\/\\/ss1.baidu.com\\/6ONXsjip0QIZ8tyhnq\\/it\\/u=1835223070,3312272045&fm=58\",\"middlepos\":\"0,180\",\"normal\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=3775999286,734565944&fm=58\"},\"icon249\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=659014994,2919842554&fm=58\",\"website\":{\"title\":\"www.sf-express.com\",\"url\":\"http:\\/\\/www.sf-express.com\"},\"tel\":\"95338\",\"auxiliary\":[{\"title\":\"\\u7f51\\u70b9\\u67e5\\u8be2\",\"url\":\"http:\\/\\/www.sf-express.com\\/cn\\/sc\\/dynamic_functions\\/store\\/?from=kuaidi100\"},{\"title\":\"\\u7f51\\u4e0a\\u5bc4\\u4ef6\",\"url\":\"http:\\/\\/www.sf-express.com\\/cn\\/sc\\/dynamic_functions\\/order\\/?from=kuaidi100\"}],\"timecost\":{\"btn_show\":\"1\",\"url\":\"http:\\/\\/www.sf-express.com\\/mobile\\/cn\\/sc\\/dynamic_functions\\/payFee\\/payFee.html\"},\"onlineorder\":{\"btn_show\":\"1\",\"url\":\"http:\\/\\/www.sf-express.com\\/mobile\\/cn\\/sc\\/dynamic_functions\\/ship\\/ship.html\"}},\"source\":{\"logo\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=1429564979,1787167512&fm=58\",\"title\":\"\\u6570\\u636e\\u6765\\u81ea\\u5feb\\u9012100\",\"url\":\"http:\\/\\/www.kuaidi100.com\\/?from=baidu_ala\",\"name\":\"\\u5feb\\u9012100\",\"showName\":\"\\u5feb\\u9012100\"},\"kuaidiSource\":{\"logo\":\"https:\\/\\/ss2.baidu.com\\/6ONYsjip0QIZ8tyhnq\\/it\\/u=1429564979,1787167512&fm=58\",\"title\":\"\\u6570\\u636e\\u6765\\u81ea\\u5feb\\u9012100\",\"url\":\"http:\\/\\/www.kuaidi100.com\\/?from=baidu_ala\",\"name\":\"\\u5feb\\u9012100\",\"showName\":\"\\u5feb\\u9012100\"}}}"}';
    alert(JSON.stringify(a));
}

function unixTime2Date(unixTime, isFull, timeZone) {
    if (typeof (timeZone) == 'number')
    {
        unixTime = parseInt(unixTime) + parseInt(timeZone) * 60 * 60;
    }
    var time = new Date(unixTime * 1000);
    var ymdhis = "";
    ymdhis += time.getUTCFullYear() + "-";
    ymdhis += (time.getUTCMonth()+1) + "-";
    ymdhis += time.getUTCDate();
    if (isFull === true)
    {
        ymdhis += " " + time.getUTCHours() + ":";
        ymdhis += time.getUTCMinutes() + ":";
        ymdhis += time.getUTCSeconds();
    }
    return ymdhis;
}

function changeP() {
    var arr = [1,2,3]
    $.each(arr, function(i, item) {
        if (i == 1) {
            $(".b" + item).html("哈哈哈哈");
        }
    })

}

function madeJson() {
    var package = {
        "56": "国内分钟数100分钟，国内流量500MB",
        "76": "国内分钟数200分钟，国内流量800MB",
        "106": "国内分钟数300分钟，国内流量1G",
        "136": "国内分钟数500分钟，国内流量1G",
        "166": "国内分钟数500分钟，国内流量2G",
        "196": "国内分钟数500分钟，国内流量3G",
        "296": "国内分钟数1000分钟，国内流量4G",
        "396": "国内分钟数2000分钟，国内流量6G",
        "596": "国内分钟数3000分钟，国内流量11G"
    };
    var num = "76";
    alert(package[num]);
}

function splitStr() {
    var str = 'http://sd4g.cn/active/images/terminal/3000/oppoR9Plus/0.jpg;http://sd4g.cn/active/images/terminal/3000/oppoR9Plus/1.jpg;http://sd4g.cn/active/images/terminal/3000/oppoR9Plus/2.jpg;http://sd4g.cn/active/images/terminal/3000/oppoR9Plus/3.jpg;';
    var arr = str.split(";");
    $.each(arr, function(i,item){
       alert(item);
        console.log(item == "")
    });
}

function timeoutTest(intDiff) {
    window.setInterval(function () {
        var day = 0,
            hour = 0,
            minute = 0,
            second = 0; //时间默认值
        if (intDiff > 0) {
            day = Math.floor(intDiff / (60 * 60 * 24));
            hour = Math.floor(intDiff / (60 * 60)) - (day * 24);
            minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
            second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
        }
        if (minute <= 9) minute = '0' + minute;
        if (second <= 9) second = '0' + second;
        $('#day_show').html(day + "天");
        $('#hour_show').html('<s id="h"></s>' + hour + '时');
        $('#minute_show').html('<s></s>' + minute + '分');
        $('#second_show').html('<s></s>' + second + '秒');
        intDiff--;
    }, 1000);

    window.setInterval(function() {
        t();
    }, 10000);
}

function t() {
    alert("哈哈");
}

function urlTest() {
    alert(encodeURI("http://gz.mobicloud.com.cn/active/gzGame/img/wxred.jpg"));
}

function objectTest(){
    var a = {"a":"aa","b":"bb"};
    alert(a.a);
    alert(a.A);
}