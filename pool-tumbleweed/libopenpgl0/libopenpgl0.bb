SUMMARY = "Open Path Guiding Library"
DESCRIPTION = "Open Path Guiding Library (Intel® Open PGL) implements a set of representations \
and training algorithms needed to integrate path guiding into a renderer. Open \
PGL offers implementations of current state-of-the-art path guiding methods, \
which increase the sampling quality and, therefore, the efficiency of a \
renderer."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "libopenpgl0-0.7.1-1.5.aarch64.rpm"
RPM_HASH = "f45a34d04886264ad18d1aa8c6b53c8a39744d2f3ebe3c1748e67cba2b51bb270be5478f2c1af40de1c30fa3bf0f7aebe5ad29b5a382c662f3c9c58df66baff9"

RPROVIDES:${PN} += "libopenpgl.so.0 \
libopenpgl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
