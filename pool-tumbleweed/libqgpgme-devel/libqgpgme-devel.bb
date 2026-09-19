SUMMARY = "Development files for qgpgme (Qt5)"
DESCRIPTION = "QGpgme provides a very high level Qt API around GpgMEpp. \
 \
This package contains the files needed to build using qgpgme and Qt5."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "libqgpgme-devel-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "628393f74c92d9cf83e0c2c6a356674ed6f60fc07fb4be278f418d2dd7317a39dde50d3e43c77b8ac5eb3d32176d579c0cfe919694131a097aa9602e63842c46"

RPROVIDES:${PN} += "cmake-QGpgme \
libqgpgme-devel"

RDEPENDS:${PN} += "cmake-Gpgmepp \
libqgpgme15"

inherit rpm
