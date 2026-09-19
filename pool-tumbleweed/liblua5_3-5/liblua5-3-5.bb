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

PV = "5.3.6"

RPM_NAME = "liblua5_3-5-5.3.6-4.7.aarch64.rpm"
RPM_HASH = "96bf5625cd22cf1a0fb1af5b7453999d9fc82f3590c308f22c46e8a06ee88d04a40e6e6f6ca84d0d6032f6abd33a9bb19f7dae6a04ac3e9a131e285c82f52e4f"

RPROVIDES:${PN} += "liblua.so.5.3 \
liblua5-3 \
liblua5-3-5 \
liblua5.3.so.5 \
lua53-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
