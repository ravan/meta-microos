SUMMARY = "Development files for zlib-ng"
DESCRIPTION = "The zlib-ng-devel package contains header files for \
developing application that use zlib-ng."
LICENSE = "Zlib"

PV = "2.3.3"

RPM_NAME = "zlib-ng-devel-2.3.3-2.3.aarch64.rpm"
RPM_HASH = "c58784e21e943f4b0af2aec118b8d66bd217d7ac88629a885c500bdc2d413bd4363f7f41b43a1c8dc5d7508fc34aaccaf6ae2b291206304b1f3fc259676d222a"

RPROVIDES:${PN} += "cmake-zlib-ng \
pkgconfig-zlib-ng \
zlib-ng-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libz-ng2"

inherit rpm
