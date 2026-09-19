SUMMARY = "Library to simplify development of OpenEXR utilities"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRUtil"
LICENSE = "BSD-3-Clause"

PV = "3.4.14"

RPM_NAME = "libOpenEXRUtil-3_4-33-3.4.14-1.1.aarch64.rpm"
RPM_HASH = "81f16040a414175a6edeb5ed3d131504625010c1fd03d2f435d554d0f534ac1c436512637c33cdce3eb4562cd8af49f97c98a63b96787b8e9847019512f5f022"

RPROVIDES:${PN} += "libOpenEXRUtil-3-4-33 \
libOpenEXRUtil-3-4.so.33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libOpenEXR-3-4.so.33 \
libOpenEXRCore-3-4.so.33 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
