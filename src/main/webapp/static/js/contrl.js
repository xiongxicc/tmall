/**
 * Created by 格瑞 on 2019/11/14.
 */
$(function () {
        $(".enter").on({"mouseenter" : function () {
            $(this).css("background" , "white");
        },
            "mouseleave" : function () {
                $(this).css("background" , "rgb(226,226,227)");
            }
        });

    }
);