SUMMARY = "Development files for open-isns"
DESCRIPTION = "Files to develop an application using the open-isns library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.103+4.60de8b5"

RPM_NAME = "open-isns-devel-0.103+4.60de8b5-1.1.aarch64.rpm"
RPM_HASH = "7af763d2cb7551dffcefb8cb89b3f961d2e2754471f0c274757188e4fad22307c6e0f7647efd235aa3ae30bbffb7f032ee329d34d629ac14307e8f372c5adf2c"

RPROVIDES:${PN} += "open-isns-devel \
pkgconfig-libisns"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
open-isns \
pkgconfig-libcrypto"

inherit rpm
