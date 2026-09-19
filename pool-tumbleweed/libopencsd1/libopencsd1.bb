SUMMARY = "C++ API for the CoreSight Trace Decode library"
DESCRIPTION = "C++ API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "libopencsd1-1.8.3-1.2.aarch64.rpm"
RPM_HASH = "940495ea14e348392db259d7a08269c3151a3d9a8a8f5d5f4df027d567b0b5c3691941a2ca9df2fed874bcb8c119259bc523239e34761eb2a86d83cd06df5b4a"

RPROVIDES:${PN} += "libopencsd.so.1 \
libopencsd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
