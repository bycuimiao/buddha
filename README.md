# buddha
一款开源，娱乐项目，启动服务器时候，加载各种有趣的字符图，达到娱乐的效果

V1.0效果
使用该包后，启动服务时会在控制台打印出佛祖字符画像，保佑服务器。

V1.0版本
暂时只支持“佛祖”字符画，“保佑服务，永无bug”
打印输出使用的是println，而非log，不会出现在日志中，1.0版本只用来自己玩
以后版本可以选择是否使用log打印，并可以选择其他字符画

V1.0使用教程
下载对应版本jar包，或者下载源代码自己打包。
在web.xml增加以下配置即可
<dependency>
      <groupId>org.waters.forfun</groupId>
      <artifactId>amulet</artifactId>
      <version>1.0</version>
    </dependency>

v1.0 bug列表
1、会存在某些日志把“佛祖”击穿的情况。。。就是字符画中有其他日志穿插

v1.0待优化
1、没有测试用例覆盖
2、不支持参数输入和配置文件
3、打印使用print输出，而非log
这些都会在后续版本优化滴

ps：抱歉，target和.idea等文件一起提交了，可能会给您使用代码造成麻烦，
在后续版本中会解决这些问题
