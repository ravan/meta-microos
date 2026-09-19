SUMMARY = "Lua binding for the linenoise command line library"
DESCRIPTION = "Linenoise (https://github.com/antirez/linenoise) is a delightfully \
simple command line library. This Lua module is simply a binding for it. \
 \
The main Linenoise upstream has stagnated a bit, so this binding tracks \
https://github.com/yhirose/linenoise/tree/utf8-support, which includes \
things like UTF-8 support and ANSI terminal escape sequence detection."
LICENSE = "MIT"

PV = "0.9"

RPM_NAME = "lua53-linenoise-0.9-5.4.aarch64.rpm"
RPM_HASH = "85edaa1743a8ef738355fb9938bfc3e8a1838cc96048c0bcb172047883eab5292d847cc581f545c73459135d9330203d2eebf88989126b547b5afda9c0400af9"

RPROVIDES:${PN} += "lua53-linenoise"

RDEPENDS:${PN} += "libc.so.6 \
lua53"

inherit rpm
