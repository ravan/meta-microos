SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "luajit-linenoise-0.9-5.4.aarch64.rpm"
RPM_HASH = "9093fccbf5b27b7c62ec16d065226cd3bb708ee96dbd12a02a09c809e34801c74e838326836d8191c0f868e1179d34dd990007942bff644d588b6d96ac19126a"

RPROVIDES:${PN} += "luajit-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
luajit"

inherit rpm
