SUMMARY = "The D standard library"
DESCRIPTION = "This package includes ldc's phobos library - The D standard library."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.42.0"

RPM_NAME = "libphobos2-ldc112-1.42.0-1.3.aarch64.rpm"
RPM_HASH = "1b0bebad2bd6ea942e3ebcd0619a964b532f72b5f2045845ce023a6480606110538ab66be77f21563b9c30da3c1701d9a592513cce9e15acb590ca295c772d12"

RPROVIDES:${PN} += "libphobos2-ldc-debug-shared.so.112 \
libphobos2-ldc-shared.so.112 \
libphobos2-ldc112"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdruntime-ldc-debug-shared.so.112 \
libdruntime-ldc-shared.so.112 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
