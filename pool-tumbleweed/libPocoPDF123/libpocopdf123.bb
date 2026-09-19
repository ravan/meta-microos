SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.15.3"

RPM_NAME = "libPocoPDF123-1.15.3-1.3.aarch64.rpm"
RPM_HASH = "35466e7dfe7f0b2275f945cd7feae781f2cdda882e2b19a09a0572f9060aff153d55f68e81c0d5d3393316b28c98f7f63fc7aaf15a8202c6f8edea83cd58b0a6"

RPROVIDES:${PN} += "libPocoPDF.so.123 \
libPocoPDF123 \
poco-pdf"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.123 \
libPocoUtil.so.123 \
libPocoXML.so.123 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
