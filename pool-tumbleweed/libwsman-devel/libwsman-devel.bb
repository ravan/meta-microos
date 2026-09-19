SUMMARY = "Development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
This subpackage provides the header files for its libraries."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "libwsman-devel-2.8.1-5.1.aarch64.rpm"
RPM_HASH = "ec52975911ab64617d4a1cbb7cce8da79bd3619156717ee613b0b8e3fd579364ca513d903a951477996e71378e29703d4a2d5b68a1e5f806dcfd8679af2f01bf"

RPROVIDES:${PN} += "libwsman-devel \
openwsman-devel \
pkgconfig-openwsman \
pkgconfig-openwsman++ \
pkgconfig-openwsman-server"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwsman-client5 \
libwsman1 \
libxml2-devel \
openwsman-server \
pam-devel \
sblim-sfcc-devel"

inherit rpm
