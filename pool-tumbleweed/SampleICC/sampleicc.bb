SUMMARY = "Color Management System"
DESCRIPTION = "SampleICC is a C++ library for reading, writing, manipulating, and \
applying ICC profiles along with applications that make use of this \
library."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "SampleICC-1.6.8-4.20.aarch64.rpm"
RPM_HASH = "78000a80b39d844b4cba0c0fee28c4e172e4de553f12b2fc8e9ed6c8c537e97e705bc15494d14ab75f73f6841c5c5a8a25061c39741387cd0a6256461354d76d"

RPROVIDES:${PN} += "SampleICC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICC-utils.so.2 \
libSampleICC.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
