SUMMARY = "Scripting library"
DESCRIPTION = "The AngelCode Scripting Library, or AngelScript as it is also known, \
is a scripting library designed to allow applications to extend their \
functionality through external scripts. \
 \
It supports Unix sockets and TCP/IP sockets with optional \
SSL/TLS support."
LICENSE = "Zlib"

PV = "2.38.0"

RPM_NAME = "libangelscript2_38_0-2.38.0-2.5.aarch64.rpm"
RPM_HASH = "7f05fa12c5663e718989ee9f90f363e4d05e2ef62d24ad715e901e0337e5d516ddf7c6b7a13c86bf423946239c23e51486fe89e2ce5edac46e554a125f03c52f"

RPROVIDES:${PN} += "libangelscript.so.2.38.0 \
libangelscript2-38-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
