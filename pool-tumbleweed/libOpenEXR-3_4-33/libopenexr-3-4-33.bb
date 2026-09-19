SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXR"
LICENSE = "BSD-3-Clause"

PV = "3.4.14"

RPM_NAME = "libOpenEXR-3_4-33-3.4.14-1.1.aarch64.rpm"
RPM_HASH = "bb793b9fa543031da3b4b56c2602760ee5d197c217bd8c2ff053446a4ff14509827feeca320a1c39f7c94b0154d5b00410c1fa3893db91b2d93177e14b3894ba"

RPROVIDES:${PN} += "libOpenEXR-3-4-33 \
libOpenEXR-3-4.so.33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libIlmThread-3-4.so.33 \
libImath-3-2.so.30 \
libOpenEXRCore-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
