SUMMARY = "Common source code tag system"
DESCRIPTION = "GLOBAL is a common source code tag system for C, C++, Yacc, and Java. \
You can locate the specified function in source files and move there \
easily. It is useful to hack a large project containing many \
subdirectories or many main() functions like MH, X, or Linux kernel."
LICENSE = "GPL-3.0-only"

PV = "6.6.14"

RPM_NAME = "global-6.6.14-1.2.aarch64.rpm"
RPM_HASH = "78e073616eecc025f485f9e2ac7d9ac9c3c255ee0c55329ea6b7877a6e85c598dfdd3b2157d4a09ed4d8229f9a540df4018714b70bb94d72a63371e9cb4ec200"

RPROVIDES:${PN} += "config-global \
global"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libncurses.so.6 \
libtinfo.so.6 \
python3-Pygments"

inherit rpm
