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
        } else if(score<28000){
            crack = 6;
        } else {
            crack = 7;
        }

        //星のAA
        String[] star = {
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC     _``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<   `         .+Z77      ````````   .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                "MMNMNMMNNN>___~__(_____                    _  `   `  (V>  ```      `  ``` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                "MNMMMMNNMMm-_~_<              ...```          `  `  (z-`    ```..    ` `.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                "MMMMMMNMMMNNe-~(<_.d                           ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                "MMHMMMMMMNMMNNm._<                            - ``(I(?z<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                "MMMMMMNNMMNMMMMMHa- `                `              `_` `    ``  ``   (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                "MMMNMMNMMNMMMMMMMNMma.  ?                                     `      (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                "MMMMMMNMMMNMMMNMMN###MHo.`                                       `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                "MMNMNMMMMMMNMMMMNN##MY!`                                        `  (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                "MMMMMMMNMMMMNMMMMNNHR-___                                       .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                "NNNMMMMMNNMMMMMMNN##MHe+<::                                        .1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                "MMMMNMMMMMNMMMMMMN###MMHSy+<_`                                      (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--.                                  ._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_                               ` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(                            _~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz                                 ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>                                 _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_                           :::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
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
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC     _``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<   `         .+Z77      ````````   .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                "MMNMNMMNNN>___~__(_____                    _  `   `  (V>  ```      `  ``` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                "MNMMMMNNMMm-_~_<              ...```          `  `  (z-`    ```..    ` `.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                "MMMMMMNMMMNNe-~(<_.d                           ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                "MMHMMMMMMNMMNNm._<                            - ``(I(?z<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                "MMMMMMNNMMNMMMMMHa- `                `           (OuZI<` `    ``  ``   (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                "MMMNMMNMMNMMMMMMMNMma.  ?                        jwwWW<.      `      (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                "MMMMMMNMMMNMMMNMMN###MHo.`                     :::fehfi)(e     `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                "MMNMNMMMMMMNMMMMNN##MY!`                                      `  (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                "MMMMMMMNMMMMNMMMMNNHR-___                                       .(+<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                "NNNMMMMMNNMMMMMMNN##MHe+<::                                        .1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                "MMMMNMMMMMNMMMMMMN###MMHSy+<_`                                      (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--.                                  ._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_                               ` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(                            _~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz                                 ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>                                 _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_                           :::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
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
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC     _``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<   `         .+Z77      ````````   .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                "MMNMNMMNNN>___~__(_____                    _  `   `  (V>  ```      `  ``` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                "MNMMMMNNMMm-_~_<              ...```          `  `  (z-`    ```..    ` `.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                "MMMMMMNMMMNNe-~(<_.d                           ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                "MMHMMMMMMNMMNNm._<                            - ``(I(?z<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                "MMMMMMNNMMNMMMMMHa- `                `           (OuZI<` `    ``  ``   (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                "MMMNMMNMMNMMMMMMMNMma.  ?                        jwwWW<.      `      (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                "MMMMMMNMMMNMMMNMMN###MHo.`                     :::fehfi)(e       `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                "MMNMNMMMMMMNMMMMNN##MY!`                         _( HS+O~`      `  (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                "MMMMMMMNMMMMNMMMMNNHR-___                    -__~~<<+wWU0<<_      +<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                "NNNMMMMMNNMMMMMMNN##MHe+<::                (OuZI<`       (OuZI<`   .1+-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                "MMMMNMMMMMNMMMMMMN###MMHSy+<_`                                      (OrrOx-~~?WM##NMMMMMMNMMMMMMMMMM\r\n" + //
                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--.                                  ._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_                               ` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(                            _~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz                                 ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>                                 _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_                           :::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
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
                ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC     _``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<   `         .+Z77      ````````   .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                "MMNMNMMNNN>___~__(_____                    _  `   `  (V>  ```      `  ``` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                "MNMMMMNNMMm-_~_<              ...```          `  `  (z-`    ```..    ` `.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                "MMMMMMNMMMNNe-~(<_.d                           ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                "MMHMMMMMMNMMNNm._<                            - ``(I(?z<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                "MMMMMMNNMMNMMMMMHa- `                `           (OuZI<` `    ``  ``   (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                "MMMNMMNMMNMMMMMMMNMma.  ?                        jwwWW<.      `      (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                "MMMMMMNMMMNMMMNMMN###MHo.`                     :::fehfi)(e       `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                "MMNMNMMMMMMNMMMMNN##MY!`                         _( HS+O~`      `  (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                "MMMMMMMNMMMMNMMMMNNHR-___                    -__~~<<+wWU0<<_      +<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                "NNNMMMMMNNMMMMMMNN##MHe+<::                (OuZI<` #*Nn3(OuZI<`   .1 +-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                "MMMMNMMMMMNMMMMMMN###MMHSy+<_`           kll  _..`( JE8&(@N3)       _`<twXWWm+_M##NMMMMMMNMMMMMMMMMM\r\n" + //
                "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--.                                  ._`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_                               ` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(                            _~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz                                 ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>                                 _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_                           :::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
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
                 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                 "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                 "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                 "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                 "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                 "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                 "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                 "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                 "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                 "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC     _``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                 "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<   `         .+Z77      ````````   .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                 "MMNMNMMNNN>___~__(_____                    _  `   `  (V>  ```      `  ``` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                 "MNMMMMNNMMm-_~_<              ...```          `  `  (z-`    ```..    ` `.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                 "MMMMMMNMMMNNe-~(<_.d                           ```..((d>  ` `` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                 "MMHMMMMMMNMMNNm._<                            - ``(I(?z<`    ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                 "MMMMMMNNMMNMMMMMHa- `                `           (OuZI<` `    ``  ``   (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                 "MMMNMMNMMNMMMMMMMNMma.  ?                        jwwWW<.      `      (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                 "MMMMMMNMMMNMMMNMMN###MHo.`                     :::fehfi)(e       `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                 "MMNMNMMMMMMNMMMMNN##MY!`                         _( HS+O~`      `  (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                 "MMMMMMMNMMMMNMMMMNNHR-___                    -__~~<<+wWU0<<_      +<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                 "NNNMMMMMNNMMMMMMNN##MHe+<::                (OuZI<` #*Nn3(OuZI<`   .1 +-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                 "MMMMNMMMMMNMMMMMMN###MMHSy+<_`           kll  _..`( JE8&(@N3)       _`<twXWWm+_M##NMMMMMMNMMMMMMMMMM\r\n" + //
                 "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--.        +lihT71wWWmyC<<hski23$JEI# _`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                 "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_         +lihT71wWWmyC<<hski   ` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                 "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(       #t*##Nj37h8392r32    _~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                 "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz                                 ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                 "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>                                 _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                 "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_                           :::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
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
                 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                 "MMMMNMMMMNMMNMMMMMMMMMMMMMNMMMNMNMMMMMNNNNNNNNNNNNNNNNNNNNNNNMMMMMMMMMMMMMMMMMMMMNMMMMMMMMMMMMMMMMMM\r\n" + //
                 "MMMMMMNMMMMNMMMMNMMNMNNNMMMNMMMMMMMNNNNNNN################NNNNNNNNNMMN#NNMMMMMMMMMMNNMMMNNMMMMMNNNMM\r\n" + //
                 "MMNMMMNHNMMM#HMMNHMMNNMMNMMMMNNNNNNNNN#MMHMMHHHHHHHHHHHHHH#H###NNNNNNNNMMNNMMNMMNMMNMNMMMNMNMNMMMMMM\r\n" + //
                 "MNMMMMMMMMNMMMMMMMMMMMMMNMMMMNNNNN###H#K<_ ?WH@@@@@@@@@@H@@H@@H###NNNNNNNMNNMNMMNNMMMMNMMMNMMMMHNMMM\r\n" + //
                 "MMMNMMMMMMMMMMM@MMMMHMMMMNdMNNNN##HHHHM$~<_` ?WMgmggmgggg@@@@@@HHHH##NNNNNMMMMMNMMMMMMMMNMMMMMMMMMMM\r\n" + //
                 "MMNMNMMMMNMMMMMMMMNMMNMMMNNMM###HH@@@MM{ ~_ `` ?WHHHHHHHHqHmggg@@@HHH###NNNMMWMMMNMMMMMMMMMNMMNMNMMM\r\n" + //
                 "MNMMMMMMMMMMMMMNMMMMMNMNNNN###HH@@@gmqH:` __````.?UVyyVfWfpWbkqHmg@@HHH##NNNNMMMMMMNNNMMNNNMMMMMNMMN\r\n" + //
                 "MMMMMMN#MMMMMMMMMMMMMMNNN##HHHH@@@mqbHS_ ~~_ ` ```_?wOZ0UUUyyVppHqgH@HHHH##NNNMMMMNMMNMNNMMMMMNMMMMM\r\n" + //
                 "MMMMMNMNMMMMNMNMMNNMN#####M@@@@ggHbppWC     _``  `  .1OrtrtOZXyWWWUVYY77??UM##NNMMMMMMNMMMMMMMMMNMMM\r\n" + //
                 "MMMMNMMNMMMBYYYYYTYYWMMMMM@M@ggqqpWVW0<   `         33Z77      ````````   .WMMMHHB9UUB9WMMMMMMmdMMNM\r\n" + //
                 "MMNMNMMNNN>___~__(_____                    _  `   `  SKei(V>       `  ``` ?C1?<<<<11111z?zUMNMMMNMMM\r\n" + //
                 "MNMMMMNNMMm-_~_<              ...```          `  `  (z-`JIEEU `..    ` `.jAQAgga&+__+c(z1dMMMMMNMNMM\r\n" + //
                 "MMMMMMNMMMNNe-~(<_.d                           ```..((d>#J#* ` ``-<. ~_.jH@MHH#HMD~(z<+ugNMMMMMMMNNM\r\n" + //
                 "MMHMMMMMMNMMNNm._<                            -3j3io(Is(?z<` ` ``  ``` jWqm@@H#M=_(v+dNMMMNNMNMMNMMM\r\n" + //
                 "MMMMMMNNMMNMMMMMHa- `                `          (OuZI<`#(    ``  ``   (XfHqHMHY~._(gMMMMNMMMMNNNMNNM\r\n" + //
                 "MMMNMMNMMNMMMMMMMNMma.  ?                      3ojijwwWW<     `      (twWbH9>~-(gMNMMMMMMMMMMMMMMNMM\r\n" + //
                 "MMMMMMNMMMNMMMNMMN###MHo.`                 39i9:::fehfi)(e       `  (OtOO>_.(gHHH#NMNMMNMMMMMMNMMMMM\r\n" + //
                 "MMNMNMMMMMMNMMMMNN##MY!`               ##3ss5935i_( HS+O~`      `  (z1<<(+dWg@HH##NMNMNMNNMMMNMMMNMM\r\n" + //
                 "MMMMMMMNMMMMNMMMMNNHR-___                    -__~~<<+wWU0<<_      +<<~(zwWpH@@HHH#NNMMMMMMMNNMMNMMMM\r\n" + //
                 "NNNMMMMMNNMMMMMMNN##MHe+<::                (OuZI<` #*Nn3(OuZI<`   .1 +-_(?vWHH@H##NNwMMNMMMMMMMMNNMM\r\n" + //
                 "MMMMNMMMMMNMMMMMMN###MMHSy+<_`           kll  _..`( JE8&(@N3)       _`<twXWWm+_M##NMMMMMMNMMMMMMMMMM\r\n" + //
                 "MMMNMMMMMMMMMMNMMMMMWWWWWWmkA--.        +lihT71wWWmyC<<hski23$JEI# _`<twXWWm+___?TMMNMMHMMMNMMMMNMMM\r\n" + //
                 "MMMMMMMMMNMMMMMMBXAQWWMMHgmqpWywz+_         +lihT71wWWmyC<<hski   ` -_<XVpHg@Nm,___?TMMMMMMMNNNNMMNM\r\n" + //
                 "NMNMMNMNMMNMNMHkpWWWM#HH@ggmkWVWwrtz+(       #t*##Nj37h8392r32    _~_` jWWmHHH##m-~<_(TMNNMNMMMMMNMM\r\n" + //
                 "MMMHMMMNMMMMM9U0I1dMH#HM@@HHmHWyXzZZOzz       #8h3ru2h93rje             ?HH@@M#MM$ _<<__7MNMMNNNMMN#\r\n" + //
                 "MMMNMMNMMM9OOzzXwzzwXUUWWUZ0VVVOOuzzO>   #&3nfisjf388f)33              _(_(<<<<<~_-(+<~_.(HMMNMMNMMM\r\n" + //
                 "MNMMMMMMMNkXXZyyWUX0ZOzseAQQHkHqpfykwI_       e#*h3jo             :::__ ` (&++-<__~~~~~__(dMMNMMMNMM\r\n" + //
                 "MMMMNNMMNMNNNmmmmQNNMM###HHH@@gqqWpfyk-`  ` - J37h.(   +zzzz+++(-(-(<:::_.,M##MMMMNNNNNNMMNMMNNNMMNM\r\n" + //
                 "MMMMMMMNNMMMNMMMMMNMMNNN##HHH@@@HmqWpWo-.  #u83ji -_(jrttttrwwXWfpWWQmmmgQH##NMMMMMMMNNMMMMMNMMMNNMM\r\n" + //
                 "MNMMNNNMMNNNMMMNNMMMMNMNNN##HHHH@@gmmqR<;<_#J39_~_(zwwwwwXXXVfppWqmH@HHH##NNNNMNMMMNNNMMNNMMMNNNMMMM\r\n" + //
                 "MNMNNMMMMMMNMMNMMMNMMNMMNNNN##HHH@@HggR><~(3J#~_jdXVyWWWWppWkWHmgggHHHH##NNNNMNMMMMMMNMNMMMMMMMNMMNM\r\n" + //
                 "MMMMMMMNMNMMNMNMMNMMMNMMMMNNN###HHHHH@@I~.Ej-~(dqWkkkkHqqqmmgg@HHHHHH##NNNNMMMMMNMNMMNMMMMMNMMMNMMMM\r\n" + //
                 "NN#NMMNMMNNM#MNNM#MNMNMMNNNNNNNN###HHHMR_-$.(uW@gg@ggggg@@@@@@HHHH##NNNNNMMMMMNMMNMNNNNMNMNNNNNNMNNM\r\n" + //
                 "MNMMNMMMNMMMMNMMMMNMMMMNMMMNMNMNNNNN###No<+gH@M@H@HH@HHH@HHHHMM###NNNNNMMMMMMMMMMMNMMMMMMMMNMMMMMNMM\r\n" + //
                 "MMMMNMNNMNNMMMNNNMMNNNMMNNNMMNNNMNNNNN#NMM#HH#HHHHHHHHHHHHH###NNNNNMMMMMMNNNMMMMNMMMNNMMNNNMMMMMMMMN\r\n" + //
                 "MMMMNMNMMMMNMNMMMNMNMNMNMMMMMMMMMMMMMNNNNN###N########NNNNNNNNNNMNMNMNMMNMMMNMNMNNNMMMMMNMMNMMMNMMMM\r\n" + //
                 "NNNMMMMMNMMMMMMMMMMMMMMNMMMNMNMMNMMMMMNMMNNNNNNNNNNNNNNNNNNMMMMMMMMMNMMNMNMMMNMMMMMNMMMNMMMMNMMMMMNM",
                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}