SUMMARY = "Scripting library"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
It supports Unix sockets and TCP/IP sockets with optional \
SSL/TLS support."
LICENSE = "Zlib"

PV = "2.38.0"

RPM_NAME = "libangelscript_addons2_38_0-2.38.0-2.5.aarch64.rpm"
RPM_HASH = "36842a6c62ed4f8e2df4a9a5bfd9f8d2b6e45d1e8edfa150b5ecc26567c1ae19ac1264919fbda3952a50f26585c022df205ff819ad45ec92588261d06f97afc8"

RPROVIDES:${PN} += "libangelscript-addons.so.2.38.0 \
libangelscript-addons2-38-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libangelscript.so.2.38.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
