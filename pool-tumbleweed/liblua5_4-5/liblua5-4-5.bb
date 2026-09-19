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

PV = "5.4.8"

RPM_NAME = "liblua5_4-5-5.4.8-4.7.aarch64.rpm"
RPM_HASH = "2c940a1f7edbf1e669724ffc0929d6282f4db55c4a281b6e9d4319fc65f8c65ea4dc3cb22a0d0a78347c07a0b447a273a63250e40a13b79835f4cc0625463b68"

RPROVIDES:${PN} += "liblua.so.5.4 \
liblua5-4 \
liblua5-4-5 \
liblua5.4.so.5 \
lua54-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
