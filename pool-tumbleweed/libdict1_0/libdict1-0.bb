SUMMARY = "C library of key-value data structures with an object-oriented interface"
DESCRIPTION = "libdict is a C library that provides the following data structures with \
efficient insert, lookup, and delete routines."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "libdict1_0-1.0.3-1.11.aarch64.rpm"
RPM_HASH = "7eadced94b426deb7ca1d12db3a3dec7898c5b5d9f3e13e4bcae6b9d3b5ca68d9e5c088fae1628b0bef37d406d86cfa2635f9b790ce3e8b3ab510f8b8cdbc644"

RPROVIDES:${PN} += "libdict.so.1.0 \
libdict1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
