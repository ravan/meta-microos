SUMMARY = "ATSC A/52 stream decoder library"
DESCRIPTION = "liba52 is a library for decoding ATSC A/52 streams. \
Shared library part of a52dec."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "liba52-0-0.8.0-1.12.aarch64.rpm"
RPM_HASH = "7314624239ccd3c20e50efd69a78f603b3c4217acd5c41db60cf9e83140d51ee0790c4f8d92c5473c27cd8076c194dfe84a3862e882f3b02378841fee3e754f9"

RPROVIDES:${PN} += "liba52 \
liba52-0 \
liba52.so.0 \
liba52dec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
