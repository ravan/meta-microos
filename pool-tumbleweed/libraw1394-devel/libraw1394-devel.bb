SUMMARY = "Development files for libraw1394"
DESCRIPTION = "libraw1394 provides direct access to the connected 1394 buses to \
userspace. Through this library, applications can directly send to \
and receive from other nodes without requiring a kernel driver for \
the protocol in question. \
 \
This subpackage contains the library links and headers for \
libraw1394."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-devel-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "35d638a2ad9a36933509321bb7534a52020990eb4221de606acd823c02d6ef05a7c1424a0ca170e2936b034bee333a61d48a568cfa4272c19642652d50aa0b8c"

RPROVIDES:${PN} += "libraw1394-devel \
pkgconfig-libraw1394"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libraw1394-11"

inherit rpm
