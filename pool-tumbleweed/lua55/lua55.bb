SUMMARY = "Small Embeddable Language with Procedural Syntax"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
Lua combines procedural syntax (similar to Pascal) with \
data description constructs based on associative arrays and extensible \
semantics. Lua is dynamically typed, interpreted from byte codes, and \
has automatic memory management, making it suitable for configuration, \
scripting, and rapid prototyping. Lua is implemented as a small library \
of C functions, written in ANSI C."
LICENSE = "MIT"

PV = "5.5.0"

RPM_NAME = "lua55-5.5.0-1.5.aarch64.rpm"
RPM_HASH = "9a7b163f4703ff9421fd643d53411cdc6b1db913b82512d41e830e70197f0ae4eef90975cf38b432c8c17d8feab775ac71dffcd4271ef27f73de941f39f9a45f"

RPROVIDES:${PN} += "Lua-API \
lua \
lua55"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.5.so.5 \
lua-interpreter"

inherit rpm
