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

PV = "5.3.6"

RPM_NAME = "lua53-5.3.6-4.7.aarch64.rpm"
RPM_HASH = "49e7a004317feecf174bca4a22127ffc7b7c3252cd108e41099ec2a34d771087b14e4a16a4c4a9a2147c8f149d93b6450d387729a017d2e0f181f01a696f9a00"

RPROVIDES:${PN} += "Lua-API \
lua \
lua53"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libreadline.so.8 \
lua-interpreter"

inherit rpm
