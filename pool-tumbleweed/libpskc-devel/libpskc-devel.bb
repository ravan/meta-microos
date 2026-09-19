SUMMARY = "Development files for the Portable Symmetric Key Container library"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. \
 \
For managing secret key files, the Portable Symmetric Key Container \
(PSKC) format described in RFC6030 is supported. \
 \
This subpackage contains the headers for this library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.14"

RPM_NAME = "libpskc-devel-2.6.14-1.5.aarch64.rpm"
RPM_HASH = "10f135ef4f787c1bb15b70bd27e25673f8d824e624975766a6612a3444a1e2e8162d8d9681372f37c6a07aa28860219b9b681259c947ac4b09011e3f1994be2d"

RPROVIDES:${PN} += "libpskc-devel \
pkgconfig-libpskc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libpskc0"

inherit rpm
