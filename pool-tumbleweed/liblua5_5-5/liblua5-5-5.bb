SUMMARY = "The Lua integration library"
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

RPM_NAME = "liblua5_5-5-5.5.0-1.5.aarch64.rpm"
RPM_HASH = "784cd1353d33b42bf593115f93efbad43a72920f07055bb8a82a55ca3743b4e40265725116b0f0c1453e7e4e828bf30eaf0f910970bbdcca497f5ebaf0b7e213"

RPROVIDES:${PN} += "liblua.so.5.5 \
liblua5-5 \
liblua5-5-5 \
liblua5.5.so.5 \
lua55-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
