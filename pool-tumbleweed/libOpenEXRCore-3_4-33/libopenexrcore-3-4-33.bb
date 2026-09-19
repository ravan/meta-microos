SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRCore"
LICENSE = "BSD-3-Clause"

PV = "3.4.14"

RPM_NAME = "libOpenEXRCore-3_4-33-3.4.14-1.1.aarch64.rpm"
RPM_HASH = "b5cb15fc2b4bce25917eb8d4b24b13329c9a56bd7ceff88fab992c09c2050361234cb03044dfc8b1bf078e51efc3cdb34d2737951c2e28ba24aef885eb503f76"

RPROVIDES:${PN} += "libOpenEXRCore-3-4-33 \
libOpenEXRCore-3-4.so.33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdeflate.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libopenjph.so.0.31 \
libstdc++.so.6"

inherit rpm
