#!/bin/bash

if [ $1 = "0" ]; then

	# Transformam gramatica Hello.g4 in fisiere Java folosind ANTLR
	# 下面这就应该就是生成antlr需要的一些文件
	java -jar antlr-4.7.1-complete.jar Hello.g4 -visitor -Werror

	#下面是编译java源代码
	javac Hello*.java MyVisitor.java Main.java -cp antlr-4.7.1-complete.jar

else
	#下面是执行
	DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
	ANTLR_FILE="/antlr-4.7.1-complete.jar"
	FILE_PATH="$DIR$ANTLR_FILE"
	export CLASSPATH="$CLASSPATH:$FILE_PATH"
	java  Main
fi
