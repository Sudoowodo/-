# -
第三次java上机 姜颖慧 2018311499 
一 实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
二 业务要求
内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能：

1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常，在程序中设计异常处理程序

输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>
输出：
汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
…………
三 核心代码和注释
int last = s.length(); //调用方法计算诗歌长度 for(int i = last - 7; i > 0; i-=7) { if(i%14==0) { s.insert(i,'。'); s.insert(i+1,'\n'); } else s.insert(i,'，'); } //运用for函数每隔7字加，每隔十四字加。 StringTokenizer a = new StringTokenizer(d,j); int number = a.countTokens(); while(a.hasMoreTokens()) { String k = a.nextToken(); //用于查询字出现的次数 public class A extends Exception { public A(){ } public A(String str) { super (str); } } //用于反应异常 try { changhenge=new Changhenge(b); if (b=="") { throw new A("不能输入空字符"); //抛出异常提示 } else { System.out.print(changhenge); } } catch(A r) { r.printStackTrace(); 
四 运行结果图
1.空字符 https://github.com/Sudoowodo/-/blob/master/5fedde604596a9a31de847b7c17b73f.png
2.断句https://github.com/Sudoowodo/-/blob/master/8e28bc93a3380f9f0531dda37565d5a.png
四流程图https://github.com/Sudoowodo/-/blob/master/06a236866a237f107bd55daca1b14c0.png
五编程感想
这次编程内容是关于string字符串的应用，在周一课上老师详细为我们讲了string字符串的各种应用，对比了stringbuffer和string字符串的区别和效率。通过这一次实验，我对java编程有了更加深刻的理解，这次的实验内容较为简单，我们还借此机会学习了在github上上传代码，因此这次实验收获颇为丰富。
