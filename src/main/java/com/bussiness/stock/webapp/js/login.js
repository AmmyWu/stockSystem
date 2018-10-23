$(document).ready(function () {
    $("test").click(function () {
        test();
    });
});
function checkFormat() {

}
function dologin(){

}
function test() {
    $.ajax({
        type : "POST",
        url : "/userManager/test",
        dataType : "text",
        success: function (res) {
            alert(res);
        },
        error: function () {
            alert("error")
        }
    });
}
