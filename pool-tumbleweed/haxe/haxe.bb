SUMMARY = "Multiplatform programming language"
DESCRIPTION = "Haxe is a high-level multiplatform programming language and compiler \
that can produce applications and source code for many different \
platforms from a single code-base. The Haxe compiler can compile Haxe \
source code to Adobe Flash SWF files, ActionScript 3, JavaScript, \
C++, PHP, C#, Java, Python, Lua, and Neko VM binary files."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "4.3.7"

RPM_NAME = "haxe-4.3.7-4.1.aarch64.rpm"
RPM_HASH = "d5f2c2e7cd589de178705f2e7d03e5eeec9f125466f538b5261f96cbb9f5f930011ca9a6cfa5548207b9aac9607ca4dc7d20a388c94a04d2c2e29ffbcc88c625"

RPROVIDES:${PN} += "haxe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmbedcrypto.so.16 \
libmbedtls.so.21 \
libmbedx509.so.7 \
libneko.so.2 \
libpcre2-8.so.0 \
libuv.so.1 \
libz.so.1 \
neko"

inherit rpm
