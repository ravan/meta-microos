SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "libgpaste-2-0-50.9-1.1.aarch64.rpm"
RPM_HASH = "2a640e7422140c22b1b3bf1bfaedc353b162f0e0fe36eae9a1b23368f28823cf9098c14faef38cebde13335805cf5a507b43801491b33914d21704e0e2b811d0"

RPROVIDES:${PN} += "libgpaste-2-0 \
libgpaste-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
