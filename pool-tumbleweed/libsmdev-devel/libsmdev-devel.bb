SUMMARY = "Development files for libsmdev, a storage media access library"
DESCRIPTION = "libsmdev is a library to access and read storage media devices. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmdev."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libsmdev-devel-20260902-1.1.aarch64.rpm"
RPM_HASH = "cdd40ec30689b2eac3faef9d2cceb4e8a2c2eace03dd130c66c6ae8b9327a0cbc754777a81ddb155c0dff1a5c5f318962b331c98624ecc9d9c2b9a71ab270d54"

RPROVIDES:${PN} += "libsmdev-devel \
pkgconfig-libsmdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsmdev1"

inherit rpm
