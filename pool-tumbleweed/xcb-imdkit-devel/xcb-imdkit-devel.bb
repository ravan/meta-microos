SUMMARY = "Development files for xcb-imdkit"
DESCRIPTION = "This package provides development files for xcb-imdkit."
LICENSE = "LGPL-2.1-only"

PV = "1.0.9"

RPM_NAME = "xcb-imdkit-devel-1.0.9-1.9.aarch64.rpm"
RPM_HASH = "1fce086378e40069051bfc0d6ef48ece05815009015fcad1d6e68b731d77bf290f193ced03f76e0776223411b54e6488bd198f663c15f84a569530907595d4d5"

RPROVIDES:${PN} += "cmake-XCBImdkit \
pkgconfig-xcb-imdkit \
xcb-imdkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-imdkit1 \
pkgconfig-xcb \
pkgconfig-xcb-util"

inherit rpm
