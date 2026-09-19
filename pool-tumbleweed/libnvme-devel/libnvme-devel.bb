SUMMARY = "Development files for libnvme"
DESCRIPTION = "The libnvme-devel package contains libraries and header files for \
developing applications that use libnvme."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.2"

RPM_NAME = "libnvme-devel-1.16.2-1.3.aarch64.rpm"
RPM_HASH = "8c9bee118d3d4e754650c74b25d0c57c9402199c2e9f39f10c147b693dad5f742083e273988243a1387601a0f6a6c77e950259e5f9763d4c8a240383231dc613"

RPROVIDES:${PN} += "libnvme-devel \
pkgconfig-libnvme \
pkgconfig-libnvme-mi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvme-mi1 \
libnvme1 \
pkgconfig-dbus-1 \
pkgconfig-json-c \
pkgconfig-libkeyutils \
pkgconfig-openssl"

inherit rpm
