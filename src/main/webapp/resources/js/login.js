$(document).ready(function () {
    // form animation
    $("input").each(function () {
        $(this).on("focus", function () {
            $(this).parent(".loginInput").addClass("active");
        });

        $(this).on("blur", function () {
            if ($(this).val().length == 0) {
                $(this).parent(".loginInput").removeClass("active");
            }
        });

        if ($(this).val() != "")
            $(this).parent(".loginInput").addClass("active");

    });
});