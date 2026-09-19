SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua54-linenoise-0.9-5.4.aarch64.rpm"
RPM_HASH = "3e06342444f01fdd827590805a6e643dc82a6ba35513133d9264ccb0157a7f4358a7905537638a52fc255284e5c4c7dd931852197beb857aaa480068cfe2cecb"

RPROVIDES:${PN} += "lua-linenoise \
lua54-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
lua54"

inherit rpm
