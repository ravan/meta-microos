SUMMARY = "Software for reading and writing Data Matrix barcodes"
DESCRIPTION = "libdmtx is open source software for reading and writing Data Matrix barcodes. \
At its core libdmtx is a native shared library, allowing C/C++ programs to use \
its capabilities without extra restrictions or overhead."
LICENSE = "BSD-2-Clause"

PV = "0.7.8"

RPM_NAME = "libdmtx0-0.7.8-1.5.aarch64.rpm"
RPM_HASH = "05c42e74b2d1dd7a1b532194efdfc339777a20e338db049d537b5167025530713c11d01a59ccf019689298b617591aa64ece3ac688483dd0ee3370d8c9e0d421"

RPROVIDES:${PN} += "libdmtx.so.0 \
libdmtx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
