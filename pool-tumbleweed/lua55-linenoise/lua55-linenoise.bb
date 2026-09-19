SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua55-linenoise-0.9-5.4.aarch64.rpm"
RPM_HASH = "242b6f34f3c86950c29e31fdad36f5b8d91fc435a99f9d2ee03df426e5a4800ab0363529abb42ce5ed8b4f902e873edb89331271c7f770a1db6aa649dcf9b4b2"

RPROVIDES:${PN} += "lua55-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
lua55"

inherit rpm
