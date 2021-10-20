################################################################################
# Description: 该脚本用于完成antlr依赖程序生成、java源码编译以及程序运行工作
# Parameter  : 
# Author     : houxuecheng
# Date       : 20211020
# Version    : 1.0
# Modifiy    : 
################################################################################
#!/bin/bash 
 
 
 
case "$1" in
    build)
        make build
    ;;
    run)
        make run
    ;;
    all)
        make build && make run && make clean
    ;;
    *)
        echo "Usage:$0\n
        'build' for setup the program\n
        'run'   for start the program\n
        'all'   for setup and run the program."
    ;;
esac