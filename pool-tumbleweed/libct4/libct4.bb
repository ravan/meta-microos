SUMMARY = "FreeTDS standalone driver with modern API"
DESCRIPTION = "ct-lib refers to Sybase's second-generation API, which fixes a number \
of implementation and conceptual gaps in db-lib (libsybdb). libct is \
not the most complete implementation yet."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.27"

RPM_NAME = "libct4-1.4.27-2.1.aarch64.rpm"
RPM_HASH = "2b57f696592de750fbded72507ff293471a302b53a178343f6be05c30cb7488319d0cb2841509963286217f401a177e43b8b36ee0b95e36dbf9c9970004ade5b"

RPROVIDES:${PN} += "libct.so.4 \
libct4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgnutls.so.30 \
libgssapi-krb5.so.2 \
libhogweed.so.6 \
libnettle.so.8"

inherit rpm
