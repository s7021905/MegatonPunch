public class Result {

    int score;
    public Result(int score)
    {
        this.score = score;
    }
    
    public void displayAnimation() {
        int animationSpeed;
        int crack;

        //アニメーションのスピード animationSpeed
        if(score>20000){
            animationSpeed = 500;
        } else {
            animationSpeed = 1000;
        }

        //星の壊滅度 crack
        if(score<5000){
            crack = 1;
        } else if(score<10000){
            crack = 2;
        } else if(score<15000){
            crack = 3;
        } else if(score<20000){
            crack = 4;
        } else if(score<25000){
            crack = 5;
        } else if(score<30000){
            crack = 6;
        } else {
            crack = 7;
        }

        //星のAA
        String[] star = {"MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC<~~~~_``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<~~~.__ ` `    .+Z77<<<~~` ```````` .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                "MMNMNMMNNN>___~__(_____~.~?7TTUWUWWUOI~~~__  `   `  (V>  ```      `  `` ` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                "MNMMMMNNMMm-_~_<<__(J+ggQQa+-...```~<!~~~(;_   `  `  (z-`    ```..    ``.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                "MMMMMMNMMMNNe-~(<_.d###H@@gmqkHWA&(-..~.~_<``` ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                "MMHMMMMMMNMMNNm._<_.7M#M@@gHbWyyVOC<~ _~~     - ``(I(?z<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                "MMMMMMNNMMNMMMMMHa- `_TH@gmHpWU=!``    `              `_` `    ``  `` (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                "MMMNMMNMMNMMMMMMMNMma.  ?THY7! ``` ```.-        _`` `` ....` `   `   (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                "MMMMMMNMMMNMMMNMMN###MHo.` -. ```````` _          ``` ```-~_. `  `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                "MMNMNMMMMMMNMMMMNN##MY!````` ___. ` ``-~__.```` _~  ```````  `  `  (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                "MMMMMMMNMMMMNMMMMNNHR-________--_~_                 `` ` `  `   .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                "NNNMMMMMNNMMMMMMNN##MHe+<::<~~` (<-              ~_~_. ```  .(<<!` .1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                "MMMMNMMMMMNMMMMMMN###MMHSy+<_`   _~:::__-       __`   _.-<<~`  ` `  (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--._~~~~       ..` ```__-_` _. ```` `._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_~:~~:~~       __+z&(     _. .__` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(            ``~<<       __ ._~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz<<<~~~(~`__   __~~____           ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>`  ``__<````  `  ~_(:~~          _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_     _``_~_. _ `_~:~~~~___~:::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpfyk-`  ` - ``` `` .(+zzzz+++(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                "MMMMMMMNNMMMNMMMMMNMMNNN##HHH@@@HmqWpWo-.  __``` .-_(jrttttrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                "MNMMNNNMMNNNMMMNNMMMMNMNNN##HHHH@@gmmqR<;<_~ .._~_(zwwwwwXXXVfppWqmH@HHH##NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                "MNMNNMMMMMMNMMNMMMNMMNMMNNNN##HHH@@HggR><~(<:~~_jdXVyWWWWppWkWHmgggHHHH##NNNNMNMMMMMMNMNMMMMMMMNMMNM\r\n" + //
                "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I~.  -~(dqWkkkkHqqqmmgg@HHHHHH##NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                "NN#NMMNMMNNM#MNNM#MNMNMMNNNNNNNN###HHHMR_-..(uW@gg@ggggg@@@@@@HHHH##NNNNNMMMMMNMMNMNNNNMNMNNNNNNMNNM\r\n" + //
                "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###No<+gH@M@H@HH@HHH@HHHHMM###NNNNNMMMMMMMMMMMNMMMMMMMMNMMMMMNMM\r\n" + //
                "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMM#HH#HHHHHHHHHHHHH###NNNNNMMMMMMNNNMMMMNMMMNNMMNNNMMMMMMMMN\r\n" + //
                "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMMMMMMNNNNN###N########NNNNNNNNNNMNMNMNMMNMMMNMNMNNNMMMMMNMMNMMMNMMMM\r\n" + //
                "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMNMMMMMNMMNNNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMNMMMMMNMMMNMMMMNMMMMMNM",
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                        "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                        "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                        "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                        "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                        "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                        "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                        "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                        "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC<~~~~_``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                        "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<~~~.__ ` `    .+Z77<<<~~` ```````` .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                        "MMNMNMMNNN>___~__(_____~.~?7TTUWUWWUOI~~~__  `   `  (V>  ```      `  `` ` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                        "MNMMMMNNMMm-_~_<<__(J+ggQQa+-...```~<!~~       `  `  (z-`    ```..    ``.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                        "MMMMMMNMMMNNe-~(<_.d###H@@gmqkHWA&(-..~    ``` ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                        "MMHMMMMMMNMMNNm._<_.7M#M@@gHbWyyVOC<~           ``(OuZI<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                        "MMMMMMNNMMNMMMMMHa- `_TH@gmHpWU=!``    `         .jXWHo_``  `  ``  `` (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                        "MMMNMMNMMNMMMMMMMNMma.  ?THY7! ``` ```.-  `    ~_-jWVY!-...` `   `   (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                        "MMMMMMNMMMNMMMNMMN###MHo.` -. ```````` _   `` (+zv76- ```-~_.    `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                        "MMNMNMMMMMMNMMMMNN##MY!````` ___. ` ``-~__.````_~~  ~<.````  ` `   (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                        "MMMMMMMNMMMMNMMMMNNHR-________--_~_                 `` ` `  `   .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                        "NNNMMMMMNNMMMMMMNN##MHe+<::<~~` (<-              ~_~_. ```  .(<<!` .1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                        "MMMMNMMMMMNMMMMMMN###MMHSy+<_`   _~:::__-       __`   _.-<<~`  ` `  (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                        "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--._~~~~       ..` ```__-_` _. ```` `._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                        "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_~:~~:~~       __+z&(     _. .__` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                        "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(            ``~<<       __ ._~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                        "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz<<<~~~(~`__   __~~____           ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                        "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>`  ``__<````  `  ~_(:~~          _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                        "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_     _``_~_. _ `_~:~~~~___~:::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                        "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpfyk-`  ` - ``` `` .(+zzzz+++(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                        "MMMMMMMNNMMMNMMMMMNMMNNN##HHH@@@HmqWpWo-.  __``` .-_(jrttttrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                        "MNMMNNNMMNNNMMMNNMMMMNMNNN##HHHH@@gmmqR<;<_~ .._~_(zwwwwwXXXVfppWqmH@HHH##NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                        "MNMNNMMMMMMNMMNMMMNMMNMMNNNN##HHH@@HggR><~(<:~~_jdXVyWWWWppWkWHmgggHHHH##NNNNMNMMMMMMNMNMMMMMMMNMMNM\r\n" + //
                        "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I~.  -~(dqWkkkkHqqqmmgg@HHHHHH##NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                        "NN#NMMNMMNNM#MNNM#MNMNMMNNNNNNNN###HHHMR_-..(uW@gg@ggggg@@@@@@HHHH##NNNNNMMMMMNMMNMNNNNMNMNNNNNNMNNM\r\n" + //
                        "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###No<+gH@M@H@HH@HHH@HHHHMM###NNNNNMMMMMMMMMMMNMMMMMMMMNMMMMMNMM\r\n" + //
                        "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMM#HH#HHHHHHHHHHHHH###NNNNNMMMMMMNNNMMMMNMMMNNMMNNNMMMMMMMMN\r\n" + //
                        "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMMMMMMNNNNN###N########NNNNNNNNNNMNMNMNMMNMMMNMNMNNNMMMMMNMMNMMMNMMMM\r\n" + //
                        "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMNMMMMMNMMNNNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMNMMMMMNMMMNMMMMNMMMMMNM",
                        "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC<~~~~_``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<~~~.__ ` `    .+Z77<<<~~` ```````` .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                                "MMNMNMMNNN>___~__(_____~.~?7TTUWUWWUOI~~~__  `   `  (V>  ```      `  `` ` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                                "MNMMMMNNMMm-_~_<<__(J+ggQQa+-...```~<!~~~(;_   `  `  (z-`    ```..    ``.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                                "MMMMMMNMMMNNe-~(<_.d###H@@gmqkHWA&(-..~.~_<``` ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                                "MMHMMMMMMNMMNNm._<_.7M#M@@gHbWyyVOC<~ _~~       ``(OuZI<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                                "MMMMMMNNMMNMMMMMHa- `_TH@gmHpWU=!``    `         .jXWHo_``  `  ``  `` (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                                "MMMNMMNMMNMMMMMMMNMma.  ?THY7! ``` ```.-  ` _   _-jW0Y!-...` `   `   (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                                "MMMMMMNMMMNMMMNMMN###MHo.` -. ```````` _   `` (+zwWH$_```-~_.    `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                                "MMNMNMMMMMMNMMMMNN##MY!````` ___. ` ``-~__.````_~~dkXo_````  ` `   (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                                "MMMMMMMNMMMMNMMMMNNHR-________--_~___          _(jWD_~ ` `  `   .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                                "NNNMMMMMNNMMMMMMNN##MHe+<::<~~` (<--       ::::jwwWW<. ```  .(<<!``.1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                                "MMMMNMMMMMNMMMMMMN###MMHSy+<_`   _~:::__-__~~<<+Z>~1<<_.-<<~`   `   (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--._~~       __..`(C<.__-_` _. ```` `._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                                "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_~:~~    _((+&z<~+z&(.(:::_. .__` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+   +uwVT71!  ``~<<<<<<<~~__ ._~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                                "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZO        (~`__   __~~_____~~~:_-    ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                                "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>`  ``__<```` ` ` ~_(:~~  ` ___~<~_(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                                "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_     _``_~_. _ `_~:~~    _    __ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                                "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpfyk-`  ` - ``` `` .(+zzzz+++(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                                "MMMMMMMNNMMMNMMMMMNMMNNN##HHH@@@HmqWpWo-.  __``` .-_(jrttrtrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                                "MNMMNNNMMNNNMMMNNMMMMNMNNN##HHHH@@gmmqR<;<_~ .._~_(zwwwwwXXXVfppWqqH@HHH##NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                                "MNMNNMMMMMMNMMNMMMNMMNMMNNNN##HHH@@HggR><~(<:~~_jdXVyWWWWppWkWHmgggHHHH##NNNNMNMMMMMMNMNMMMMMMMNMMNM\r\n" + //
                                "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I~.  -:(dqWkkkkHqqqmmgg@H@HHH###NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                                "NN#NMMNMMNNM#MNNM#MNMNMMNNNNNNNN###HHHMR_-..(uW@gg@gggggg@@@@@HHHH###NNNNMMMMMNMMNMNNNNMNMNNNNNNMNNM\r\n" + //
                                "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###No<+gH@M@HH@HH@HHH@HHHMM#NNNNNNNMMMMMMMMMMMNMMMMMMMMNMMMMMNMM\r\n" + //
                                "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMMHHH#HHHHHHHHHHH#H###NNNNNMMMMMMNNNMMMMNMMMNNMMNNNMMMMMMMMN\r\n" + //
                                "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMMMMMMNNNNN##NN#######NNNNNNNNNNNMNMNMNMMNMMMNMNMNNNMMMMMNMMNMMMNMMMM\r\n" + //
                                "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMNMMMMMNMMNMNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMNMMMMMNMMMNMMMMNMMMMMNM",
                                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                                        "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                                        "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                                        "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                                        "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                                        "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                                        "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                                        "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                                        "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC<~~~~_``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                                        "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<~~~.__ ` `    .+Z77<<<~~` ```````` .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                                        "MMNMNMMNNN>___~__(_____~.~?7TTUWUWWUOI~~~__  `   `  (V>  ```      `  `` ` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                                        "MNMMMMNNMMm-_~_<<__(J+ggQQa+-...```~<!~~~(;_   `  `  (z-`    ```..    ``.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                                        "MMMMMMNMMMNNe-~(<_.d###H@@gmqkHWA&(-..~.~_<``` ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                                        "MMHMMMMMMNMMNNm._<_.7M#M@@gHbWyyVOC<~ _~~(<(((- ``(OuZI<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                                        "MMMMMMNNMMNMMMMMHa- `_TH@gmHpWU=!``    ` ___~<<~ .jXWHo_``  `  ``  `` (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                                        "MMMNMMNMMNMMMMMMMNMma.  ?THY7! ``` ```.-  ` _~~~_-jWXUC_...` `   `   (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                                        "MMMMMMNMMMNMMMNMMN###MHo.` -. ```````` _   `` (+wkWH$+! `-~_.    `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                                        "MMNMNMMMMMMNMMMMNN##MY!````` ___. ` ``-~__.````_?SXkXk_````  ` `   (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                                        "MMMMMMMNMMMMNMMMMNNHR-________--_~_            __( HS+O~```  `   .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                                        "NNNMMMMMNNMMMMMMNN##MHe+<::<~~` (<--         hrj  HHC~ ```  .(<<!``.1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                                        "MMMMNMMMMMNMMMMMMN###MMHSy+<_`   _~:::__-__~~<<+wWU0<<_.-<<~`   `   (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                                        "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--._~      jlk__..`(C+<<_-_` _. ```` `._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                                        "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_~       _((+&dn--z&(.(:kl_. .__` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                                        "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+    uwVT71''WmyC<<<<   ~~__ ._~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                                        "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOz   ~~~(+O<?XC __~~_____~~~:_-    ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                                        "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>`  ``__<~<  ?!`  ~_(:~~  ` ___~<~_(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                                        "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_     _``_~_. _ `_~:~        ::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                                        "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpfyk-`  ` - ``` `` .(+zzzz+++(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                                        "MMMMMMMNNMMMNMMMMMNMMNNN##HHH@@@HmqWpWo-.  __``` .-_(jrtrttrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                                        "MNMMNNNMMNNNMMMNNMMMMNMNNN##HHHH@@gmmqR<;<_~ .._~_(zwwwwwXXXVfppWqqH@HHH##NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                                        "MNMNNMMMMMMNMMNMMMNMMNMMNNNN##HHH@@HggR><~(<:~~_jdXVyWWWWppWkWHmgggHHHH##NNNNMNMMMMMMNMNMMMMMMMNMMNM\r\n" + //
                                        "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I~.  -:(dqWkkkkHqqqmmgg@H@HHH###NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                                        "NN#NMMNMMNNM#MNNM#MNMNMMNNNNNNNN###HHHMR_-..(uW@gg@gg@ggg@@@@@HHHH###NNNNMMMMMNMMNMNNNNMNMNNNNNNMNNM\r\n" + //
                                        "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###No<+gH@M@HH@HH@HHH@HHHMM#NNNNNNNMMMMMMMMMMMNMMMMMMMMNMMMMMNMM\r\n" + //
                                        "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMMHHH#HHHHHHHHHHH#H###NNNNNMMMMMMNNNMMMMNMMMNNMMNNNMMMMMMMMN\r\n" + //
                                        "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMMMMMMNNNNN##NN########NNNNNNNNNNMNMNMNMMNMMMNMNMNNNMMMMMNMMNMMMNMMMM\r\n" + //
                                        "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMNMMMMMNMMNMNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMNMMMMMNMMMNMMMMNMMMMMNM",
                                        "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                                                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                                                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                                                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                                                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                                                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                                                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                                                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                                                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC<~~~~_``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                                                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<~~~.__ ` `    .+Z77<<<~~` ```````` .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                                                "MMNMNMMNNN>___~__(_____~.~?7TTUWUWWUOI~~~__  `   `  (V>  ```      `  `` ` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                                                "MNMMMMNNMMm-_~_<<__(J+ggQQa+-...```~<!~~~(;_   `  `  (z-`    ```..    ``.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                                                "MMMMMMNMMMNNe-~(<_.d###H@@gmqkHWA&(-..~.~_<``` ```..((d>   ` `` `-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                                                "MMHMMMMMMNMMNNm._<_.7M#M@@gHbWyyVOC<~         - ``(OuZZC` `  ` ``` ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                                                "MMMMMMNNMMNMMMMMHa- `_TH@gmHpWU=!``    `         .jXWHk!`  `   ``  `` (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                                                "MMMNMMNMMNMMMMMMMNMma.  ?THY7! ``` ```.-  `    ~_-jWXU3-... ``     ` (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                                                "MMMMMMNMMMNMMMNMMN###MHo.` -. ```````` _   `` (+wkWH$jXo--~_.   ` ` (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                                                "MMNMNMMMMMMNMMMMNN##MY!````` ___. ` ``-~__.````_?SXkXk<zAw>   `  ` (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                                                "MMMMMMMNMMMMNMMMMNNHR-________--_             __(dHH1O~(d>  `   .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                                                "NNNMMMMMNNMMMMMMNN##MHe+<::<~~` (<--       ::ljk:jwXHH0< <!`  .(<<!``.1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                                                "MMMMNMMMMMNMMMMMMN###MMHSy+<_`   _~:     lkhh~~<<+wW  <<~._<<~`  `    (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                                                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--._~~    kll  _..`(1z<<_-_`jh. ``````._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                                                "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_~:~~:~~kljh(+&dn++z&(.(khi_. .__` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                                                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+  (+uwVT71~~WmyC<<<khj<<~~__ ._~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                                                "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz kjgi~~(+X ZXC __kih    kij  ~:_-    ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                                                "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>`  ``__<dW$`?!`  ~_( ~~  ` ___~<~_(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                                                "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_     _JHHS>. _ `_~:~~~~___    __ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                                                "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpfyk-`  ` (dH  !`` .(+zzzz+++(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                                                "MMMMMMMNNMMMNMMMMMNMMNNN##HHH@@@HmqWpWo-.  (kUWI~.-_(jrtrttrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                                                "MNMMNNNMMNNNMMMNNMMMMNMNNN##HHHH@@gmmqR<;<_~.(Ov~_(zwwwwwXXXVfppWqmH@HHH##NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                                                "MNMNNMMMMMMNMMNMMMNMMNMMNNNN##HHH@@HggR><~(<~~?<jdXVyWWWWppWkWHmgggHHHH##NNNNMNMMMMMMNMNMMMMMMMNMMNM\r\n" + //
                                                "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I~.  -~(dqWkkkkHqqqmmgg@H@HHH###NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                                                "NN#NMMNMMNNM#MNNM#MNMNMMNNNNNNNN###HHHMR_-..(uW@gg@gggggg@@@@@HHHH#N#NNNNMMMMMNMMNMNNNNMNMNNNNNNMNNM\r\n" + //
                                                "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###No<+gHHMHH@HH@HHHH@HHHMM#NNNNNNNMMMMMMMMMMMNMMMMMMMMNMMMMMNMM\r\n" + //
                                                "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMMHHH#HHHHHHHHHHH#H###NNNNNMMMMMMNNNMMMMNMMMNNMMNNNMMMMMMMMN\r\n" + //
                                                "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMMMMMMNNNNN##N#########NNNNNNNNNNMNMNMNMMNMMMNNMMNNNMMMMMNMMNMMMNMMMM\r\n" + //
                                                "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMNMMMMMNMMNMNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMMNMMMNMMNMMNMMMNMMMMMNM",
                                                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                                                        "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                                                        "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                                                        "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                                                        "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                                                        "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                                                        "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                                                        "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                                                        "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC<~~~~_``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                                                        "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<~~~.__ ` `    .+Z77<<<~~` ```````` .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                                                        "MMNMNMMNNN>___~__(_____~.~?7TTUWUWWUOI~~~    `   `  (VC` ```      `  `` ` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                                                        "MNMMMMNNMMm-_~_<<__(J+ggQQa+-...```~<!~        `  `  (w<     ```..    ``.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                                                        "MMMMMMNMMMNNe-~(<_.d###H@@gmqkHWA&(-..~.~_<``` ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                                                        "MMHMMMMMMNMMNNm._<_.7M#M@@gHbWyyVOC<~         - ``(OuZUC`  `  ```  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                                                        "MMMMMMNNMMNMMMMMHa- `_TH@gmHpWU=!``    `    ~<<~ .jXWHk!``     ` `  ` (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                                                        "MMMNMMNMMNMMMMMMMNMma.  ?THY7! ``` ```.-  ` _~~~_-jWXU0_...` `   `   (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                                                        "MMMMMMNMMMNMMMNMMN###MHo.` -. ```````` _   `` (+wkWH$jXo--~_. `   ` (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                                                        "MMNMNMMMMMMNMMMMNN##MY!````` ___. ` ``-~__.````_?SXkXk<zAw>  ` `   (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                                                        "MMMMMMMNMMMMNMMMMNNHR-________--_~            __(dHH1O~(d>  `   .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                                                        "NNNMMMMMNNMMMMMMNN##MHe+<::<~~` (<--        :::jwXHH0< <!`  .(<< ``.1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                                                        "MMMMNMMMMMNMMMMMMN###MMHSy+<_`   _~:      lkj~<<+wWU0<<~._<<~`  `    (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                                                        "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--._~~~  khij::_..`(1z<hki-_`::_. ``````._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                                                        "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_~:  kjdh_((+&dn++z&(.(lkj _. .__` -_<XVpH@@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                                                        "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz    +lihT71wWWmyC<<hski   ~__ ._~_` jWWmH@H##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                                                        "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOz hyn ~~~(+XXZXC __~~ljik__~~~:_-    ?HH@HM#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                                                        "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>`  `gsbj_+dW$`?!`  ~_(:~~  ` ___~<~_(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                                                        "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_ hyy  (dHHS>. _ `_~:     __:~::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                                                        "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpfyk-` `hfkzXHMk<kjlkhf.(+zzzz+++(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                                                        "MMMMMMMNNMMMNMMMMMNMMNNN##HHH@@@HmqWpWo-.  (XWHkj  _(jrtrttrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                                                        "MNMMNNNMMNNNMMMNNMMMMNMNNN##HHHH@@gmmqR<;<_(  XXUVwzwwwwwXXXVfppWqqH@HHHH#NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                                                        "MNMNNMMMMMMNMMNMMMNMMNMMNNNN##HHH@@HggR><(  WHWWkdXVyWWWWppWkWHmgggHHHH##NNNNMNMMMMMMNMNMMMMMMMNMMNM\r\n" + //
                                                        "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I._<XW90XqWkkkkHqqqmmgg@H@HHH###NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                                                        "NN#NMMNMMNNM#MNNM#MNMNMMNNNNNNNN###HHHMR_(d01uW@gg@gggggg@@@@@HHHH###NNNNMMMMMNMMNMNNNNMNMNNNNNNMNNM\r\n" + //
                                                        "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###NQHSQH@MHH@HH@HHHH@HHHMM#NNNNNNNMMMMMMMMMMMNMMMMMMMMNMMMMMNMM\r\n" + //
                                                        "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMM#HH#HHHHHHHHHHH#H###NNNNNMMMMMMNNNMMMMNMMMNNMMNNNMMMMMMMMN\r\n" + //
                                                        "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMMMMMMNNNNNN#NNN#######NNNNNNNNNNMNMNMMMMNMMMNNMMNNNMMMMMNMMNMMMNMMMM\r\n" + //
                                                        "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMNMMMMMMMMNNNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMMNMMMNMMNMMNMMMNMMMMMNM",
                                                        "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                                                                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                                                                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                                                                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                                                                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                                                                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                                                                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                                                                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                                                                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC<~~~~_``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                                                                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<~~~.__ ` `    .+Z77<<<~~` ```````` .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                                                                "MMNMNMMNNN>___~__(_____~.~?7TTUWUWWUOI~~~__  `   `  (VC` ```      `  `` ` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                                                                "MNMMMMNNMMm-_~_?+__(J+ggQQa+-...```~<!~~~(;_   `  `  (w<     ```..    ``.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                                                                "MMMMMMNMMMNNe-~(Oo-d###H@@gmqkHWA&(-..~.~_<_  .((J-(-(do-  ` `` `-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                                                                "MMHMMMMMMNMMNNm.?Oo_7M#M@@gHbWyyVOC<~ _~~(+umQ2~``?UkZUXwo..zs-``` ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                                                                "MMMMMMNNMMNMMMMMHazo-(TM@gmHpWU=!``  ` .JT77<11< .jXWHk<_?TY77To.  `` (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                                                                "MMMNMMNMMNMMMMMMMNMNkX6<?THY7! ``` `.+z>``` (jV<-(wpXU0zz&-  (&JXo.  (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                                                                "MMMMMMNMMMNMMMNMMN###MHI~<+-. ```````  <o-  <dkdWWWH$jXo__?4zXHS7Y! (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                                                                "MMNMNMMMMMMNMMMMNN##MY!`` _<~___...```-+Xy+wXHHwzSXkXk<Xmy>.(wX6:  (lzO>+dHHg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                                                                "MMMMMMMNMMMMNMMMMNN#R-_____      ?>  __(yXXXHHmQkdHH1O~(WH<(z~  .JdVTC?7XWbHg@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                                                                "NNNMMMMMNNMMMMMMNN##MHe+<::<~~` (&&zZXz<<zXZWHmz0XHH0< <!~<<OOAwXC~(1+-_(?vWHHHHH#NNwMMNMMMMMMMMNNMM\r\n" + //
                                                                "MMMMNMMMMMNMMMMMMN###MMHSy+<_` ` _<<:+XC1<?<<<?zwWU0<<<((uv~`_Xm-`  (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                                                                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--._~:+&&&&yZ&-.. (1z<<_-?UC1w&JJXHX&._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                                                                "MMMMMMMMMNMMMMMMBXAQWWMMHggqpWywz+_<0y?T6<:<jww&dn++z&(-(;zTTBwzWY  -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                                                                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+11jasdfU71wWWmyC   <<<<~~T>(X-~_` jWWgH@H##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                                                                "MMMHMMMNMMMMM9U0IwXMH#HM@@HHmHWyXwXXWU0=<<~(((jXXZXXz&&mo-(-__~~(<<-    ?HH@HM#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                                                                "MMMNMMNMMM9OOzzXwzwWHH@HMHW0XXWWHHSVO>` (dW0COXH$`?>(XWWWWXWm,  1z__~<~_(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                                                                "MNMMMMMMMNkXXZyyWUX0ZVWHAXHHH@mqpVykwI_ .d{_(dHHS>.(z!_??<?WMH<__::::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                                                                "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpVykAwVC1<zXHMk<?7>_(+zzzzOwz(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                                                                "MMMMMMMNNMMMNMMMMMNMMNNN##HHHH@@HmqWpWI<<.(zXWHkVC~_(jttrttrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                                                                "MNMMNNNMMNNNMMMNNMMNMNMNNN##HHH@@@gmmqR<>?V<d0XXUVwzwwwwwXXXffppWqqH@HHH##NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                                                                "MNMNNMMMMMMNMMNMMMNMMMMMNNNN##HHHH@HggR><(+dWHWWkdXVyWWWWppWkWHmgggHHHHH#NNNNMNMMMMMMNMMNMMMMMMNMMNM\r\n" + //
                                                                "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I._<XW90XqWkkkkHqqqmmgg@HHHHHH##NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                                                                "NN#NMMNMMNNM#MNNMNMNMNMMNNNNNNNN##HHHHMR_(d01uW@gg@gg@ggg@@@@@HHHH###NNNNMMMMMNMMNMNNNNNNMNNNNNNMNNM\r\n" + //
                                                                "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###NQHSQH@MHH@HH@HHHH@HHHMM###NNNNNMMMMMMMMMMMNMMMMMMMMMMMMMMNMM\r\n" + //
                                                                "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMM#HH#HHHHHHHHHHH#H###NNNNNMMMMMMNNNMMMMNMMMNMMMNNNMMMMMMMMN\r\n" + //
                                                                "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMNMMMMNNNNN##NN########N#NNNNNNNNMNMNMMMMNMMMNMMMNNMNMMMMMMMNMNMMMMMM\r\n" + //
                                                                "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMMMMMMMNMMNNNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMNMMMMNMMNMNNMMNMMMMMMNM"};

        //アニメーションの再生
        for(int i=0; i<crack; i++){
            System.out.println(star[i]);
            try {
                Thread.sleep(animationSpeed);
            } catch (InterruptedException e) {
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

        }

        //結果表示
        if(score<10000){
            System.out.println("＿人人人人人人人人人人人＿\r\n" + //
                    "＞　NORMAL DESTROY　＜\r\n" + //
                    "￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");
        } else if(score<20000){
            System.out.println("＿人人人人人人人人人人人＿\r\n" + //
                    "＞　GREAT DESTROY　＜\r\n" + //
                    "￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");
        } else if(score<30000){
            System.out.println("＿人人人人人人人人人人人＿\r\n" + //
                    "＞　SUPER DESTROY　＜\r\n" + //
                    "￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");
        } else {
            System.out.println("＿人人人人人人人人人人人＿\r\n" + //
                    "＞　PERFECT DESTROY　＜\r\n" + //
                    "￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");
        }        
    }
}