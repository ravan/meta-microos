SUMMARY = "C bindings for Google's Protocol Buffers"
DESCRIPTION = "This package provides a code generator and runtime libraries to use Protocol \
Buffers from pure C (not C++)."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "libprotobuf-c1-1.5.2-2.6.aarch64.rpm"
RPM_HASH = "ef39cc04107946eb503730dcc0caad9da54b5bfaad68a2fdd96c52c39b9033c23fed4ba37508c74124695bc03b39358b61a14eb3bd72e3b137de6f2c1bd8abbb"

RPROVIDES:${PN} += "libprotobuf-c.so.1 \
libprotobuf-c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
