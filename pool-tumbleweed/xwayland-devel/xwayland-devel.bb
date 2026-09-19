SUMMARY = "Development files for Xwayland"
DESCRIPTION = "This package contains the Xwayland Server development files."
LICENSE = "MIT"

PV = "24.1.13"

RPM_NAME = "xwayland-devel-24.1.13-1.2.aarch64.rpm"
RPM_HASH = "dc863ac3be6a83e71ac96a3aea6ac02a7b5f107e65ccf604ebf7dbbb80db95faf1dd59a8ba16341c81e76b383ffbad43f27ae99d8727c87aafbee4c30dfcc533"

RPROVIDES:${PN} += "pkgconfig-xwayland \
xwayland-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c-compiler \
meson \
pkgconfig-libdrm \
pkgconfig-xau \
pkgconfig-xdmcp \
pkgconfig-xkbfile \
pkgconfig-xtrans \
pkgconfig-xv \
xwayland"

inherit rpm
