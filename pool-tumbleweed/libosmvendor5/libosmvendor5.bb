SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libosmvendor5-3.3.24-5.4.aarch64.rpm"
RPM_HASH = "2ef7798de5f1f378a52eea8983293a96b1685d0dc7c0d9c67aac254e7453ee80fc6e9a9516b3457c8d268042b972d01d9171077f930bb07bde36a5145abec4c6"

RPROVIDES:${PN} += "libosmvendor.so.5 \
libosmvendor5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibumad.so.3 \
libopensm.so.9 \
libosmcomp.so.5"

inherit rpm
