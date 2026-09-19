SUMMARY = "Shared library for CLHEP Matrix"
DESCRIPTION = "This package provides the CLHEP Matrix shared library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "libCLHEP-Matrix-2_4_7_2-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "baf3650fe2348f6ca6f38c3838c17cdfeca20cad1bc88faa5395c7221f72c29b2dd01f2d9e86c5486e298a2bb4d3dd4a3cbcf7948d1812765d609f4a616c0bbd"

RPROVIDES:${PN} += "libCLHEP-Matrix-2-4-7-2 \
libCLHEP-Matrix-2.4.7.2.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
