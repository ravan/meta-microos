SUMMARY = "Library for Parsing Excel (XLS) Files"
DESCRIPTION = "libxlsreader is a C library which can read Excel (xls) files since Excel \
97 (the BIFF8 format). libxlsreader cannot write Excel files."
LICENSE = "BSD-2-Clause"

PV = "1.6.3"

RPM_NAME = "libxlsreader8-1.6.3-1.7.aarch64.rpm"
RPM_HASH = "1a51f6563a67d17e4b5eda508acc216bc07c57f381d73a411a141d8b0e0948162dcd933cee491dda33227d12af434a956693fb2841872dbedbb3315ed3c44bd4"

RPROVIDES:${PN} += "libxlsreader.so.8 \
libxlsreader8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
