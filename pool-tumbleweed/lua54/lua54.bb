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

PV = "5.4.8"

RPM_NAME = "lua54-5.4.8-4.7.aarch64.rpm"
RPM_HASH = "9d9b162ff696dd5f3997804ef5c60deb2cb47ee88a3b410c62dc7fb43cefc2eb24b60c0fff9a6c0aa8cb3e693a3e1cf1115a9860d4774b1dca487ef5eba646e2"

RPROVIDES:${PN} += "Lua-API \
lua \
lua54"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libreadline.so.8 \
lua-interpreter"

inherit rpm
