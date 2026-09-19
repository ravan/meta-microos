SUMMARY = "I/O library for dealing with structured file formats"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.58"

RPM_NAME = "libgsf-1-114-1.14.58-1.3.aarch64.rpm"
RPM_HASH = "54caae1676cb441cdda9a9510dc2cfb537c926ccdc363e9b331fbf099fbc18fe5278743daa0a9cb315ba00c3ea104cc36d0b9a9c1fa5626ead088bf69a8568e1"

RPROVIDES:${PN} += "libgsf \
libgsf-1-114 \
libgsf-1.so.114"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
