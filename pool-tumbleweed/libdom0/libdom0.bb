SUMMARY = "C implementation of the W3C DOM API"
DESCRIPTION = "LibDOM is an implementation of the W3C DOM API written in C. It was developed as \
part of the NetSurf project."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "libdom0-0.4.2-2.9.aarch64.rpm"
RPM_HASH = "d2ad7cc62778c3e6c4fc14c47a9fe916ef7873959f607be0e814d6db627c086d83a51fdd156f4957f7d21f2edd3678de2034984d772a17377afb980507209d07"

RPROVIDES:${PN} += "libdom.so.0 \
libdom0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libhubbub.so.0 \
libparserutils.so.0 \
libwapcaplet.so.0"

inherit rpm
