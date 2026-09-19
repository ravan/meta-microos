SUMMARY = "Development files for libproxy, a library to do PAC/WPAD"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This subpackage contains header files for developing applications \
that want to make use of libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.5.12"

RPM_NAME = "libproxy-devel-0.5.12-2.4.aarch64.rpm"
RPM_HASH = "27bf9675161f42745be3f952ac9820492eb4dc74ecfc498a60a1a36d5415a328e7851a221418cfa23d092ae97ad7a89c244529e0dfb78c22d3f924dc59d3b2fa"

RPROVIDES:${PN} += "libproxy-devel \
pkgconfig-libproxy-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libproxy1 \
pkgconfig-gobject-2.0"

inherit rpm
