SUMMARY = "Helper library for the Huge Translation Lookaside Buffer Filesystem"
DESCRIPTION = "The libhugetlbfs package interacts with the Linux hugetlbfs to \
make large pages available to applications in a transparent manner."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.9.ga83fbb2"

RPM_NAME = "libhugetlbfs-2.24.9.ga83fbb2-1.3.aarch64.rpm"
RPM_HASH = "1ae3e146046967d31b687f162c584482cad434a07b337ab6efd16c9ed5f8a7a9f797634af59447e4244904d4cdea71b7fdfa2d88f4f72be3114d6c3dadee9368"

RPROVIDES:${PN} += "libhugetlbfs \
libhugetlbfs-privutils.so \
libhugetlbfs.so"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
