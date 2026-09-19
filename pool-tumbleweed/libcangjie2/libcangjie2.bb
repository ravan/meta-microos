SUMMARY = "A C library implementing the Cangjie input method"
DESCRIPTION = "libcangjie is a C library implementing the Cangjie input method, \
which is mainly used on Traditional Chinese inputing. \
 \
This package provides runtime library for libcangjie."
LICENSE = "LGPL-3.0+"

PV = "1.3"

RPM_NAME = "libcangjie2-1.3-1.33.aarch64.rpm"
RPM_HASH = "d34178c4d2321be8e6851168e331c58906f232a5d0249fa3dbc57efbb37530b411bdaee823412540bfeec901189fd49573c25029c56ff957ddf218205048ca0e"

RPROVIDES:${PN} += "libcangjie.so.2 \
libcangjie2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
