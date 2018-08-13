# 切换目录时列出文件
cdls() {
cd $1;
ls;
}

alias cd=cdls