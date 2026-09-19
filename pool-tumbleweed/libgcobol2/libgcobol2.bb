SUMMARY = "GNU GCC COBOL compiler runtime library"
DESCRIPTION = "Runtime library for the GNU GCC COBOL language."
LICENSE = "BSD-3-Clause"

PV = "16.2.0+git9497"

RPM_NAME = "libgcobol2-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "23a4cd7fa65feba5b8f4ce92548b95f61beb40b2bec4dbbde2262bd8fdf5b6826efc0a9d33c45479cde40d3bbc6aaab110f619eeda54a70dd35315e2e2b6178d"

RPROVIDES:${PN} += "libgcobol.so.2 \
libgcobol2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
