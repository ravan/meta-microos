SUMMARY = "Library for parsing the MS Visio file format structure"
DESCRIPTION = "libvisio is a library for parsing the MS Visio file format structure. It is \
cross-platform, at the moment it can be build on Microsoft Windows and Linux."
LICENSE = "MPL-2.0"

PV = "0.1.11"

RPM_NAME = "libvisio-0_1-1-0.1.11-1.3.aarch64.rpm"
RPM_HASH = "3d4dd03ae9d3c2c8839f0b66daaa22ac5da55f2cc4382c7f4bd066002f222e4534890e8f3718cee18b5ca52a7801efdee1709c465f892d6c8a3c5f846e0a7f42"

RPROVIDES:${PN} += "libvisio-0-1-1 \
libvisio-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
