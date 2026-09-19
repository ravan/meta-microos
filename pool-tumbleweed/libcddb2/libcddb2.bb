SUMMARY = "CDDB Access Library"
DESCRIPTION = "Libcddb is a library that implements the different protocols (CDDBP, \
HTTP, and SMTP) to access data on a CDDB server (http://freedb.org). It \
tries to be as cross-platform as possible."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libcddb2-1.3.2-30.5.aarch64.rpm"
RPM_HASH = "623d06acb92701ea207fd17bc96c03b5bc58d8f10d08a15794f01ea035b526b9b5c0743374f8f9f5b907ff670efbcf440b413a70b340abb029f80eb432719114"

RPROVIDES:${PN} += "libcddb \
libcddb.so.2 \
libcddb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
