SUMMARY = "Plugins for the gwenhywfar multi-platform helper library"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "libgwenhywfar79-plugins-5.14.1-1.3.aarch64.rpm"
RPM_HASH = "5a2d6d9d3bc262c3554d28866ca8783428ef3a225aba525bf04e89e8a5f5722abc493cef55e5ee26a852946449467a976e489545bed918139346a4892125c5b4"

RPROVIDES:${PN} += "libgwenhywfar79-plugins"

RDEPENDS:${PN} += "gwenhywfar \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgwenhywfar.so.79"

inherit rpm
