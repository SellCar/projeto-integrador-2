var MercoSulMaskBehavior = function (val) {
    var myMask = 'SSS0A00';
    var mercosul = /([A-Za-z]{3}[0-9]{1}[A-Za-z]{1})/;
    var normal = /([A-Za-z]{3}[0-9]{2})/;
    var replaced = val.replace(/[^\w]/g, '');
    if (normal.exec(replaced)) {
        myMask = 'SSS-0000';
    } else if (mercosul.exec(replaced)) {
        myMask = 'SSS0A00';
    }
        return myMask;
    },

    mercoSulOptions = {
        onKeyPress: function(val, e, field, options) {
            field.mask(MercoSulMaskBehavior.apply({}, arguments), options);
        }
    };

    $(function() {
        $("body").delegate('input.placa','paste', function(e) {
            $(this).unmask();
        });
        $("body").delegate('input.placa','input', function(e) {
            $('input.placa').mask(MercoSulMaskBehavior, mercoSulOptions);
        });
    });