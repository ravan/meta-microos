SUMMARY = "Development files for libvsapm"
DESCRIPTION = "libvsapm is a library to access the Apple Partition Map (APM) volume \
system format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvsapm."
LICENSE = "LGPL-3.0-or-later"

PV = "20260713"

RPM_NAME = "libvsapm-devel-20260713-1.2.aarch64.rpm"
RPM_HASH = "9b71e2c04013ead59efd2c7ba9a2e1eb8ecf147cc5634bd37b7c53b7ce57e61259bfbac8683770e2b9dfff2bf26219f13d2f7e97ac5433a1b37d73f65184af00"

RPROVIDES:${PN} += "libvsapm-devel \
pkgconfig-libvsapm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvsapm1"

inherit rpm
