SUMMARY = "A C library for creating Excel XLSX files"
DESCRIPTION = "Libxlsxwriter is a C library for creating Excel XLSX files. \
 \
This package holds the shared library files."
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "libxlsxwriter9-1.2.2-1.5.aarch64.rpm"
RPM_HASH = "bb469ba5cb307deb9b4ee60f3fa4c100ab9e67f257916a1e4274a4ab861d91b7c2d0ef19cf598f81d83fdf4514ccf63d44a88efc69ba9f72313ec776d31cd650"

RPROVIDES:${PN} += "libxlsxwriter.so.9 \
libxlsxwriter9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libminizip.so.1"

inherit rpm
