SUMMARY = "Development files for libteam"
DESCRIPTION = "A library which is the user-space counterpart for the team network \
driver, and provides an API to control them. \
 \
This package contains the development headers for the libteam and \
libteamdctl libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.32"

RPM_NAME = "libteam-devel-1.32-2.10.aarch64.rpm"
RPM_HASH = "41b5fb74388007b8c59cada7321c1e386d0265b5f44c0bd71df224608f7788fa35429c8d319d6b44f478fec87695608fac49561d3d137950367adeb55ea6a086"

RPROVIDES:${PN} += "libteam-devel \
pkgconfig-libteam \
pkgconfig-libteamdctl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libteam5 \
libteamdctl0 \
pkgconfig-libnl-3.0"

inherit rpm
