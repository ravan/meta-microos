SUMMARY = "Development files for non-ntk"
DESCRIPTION = "This package contains development files for non-ntk."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1001"

RPM_NAME = "non-ntk-devel-1.3.1001-5.7.aarch64.rpm"
RPM_HASH = "bbc5348dfae598da14abb4847f7f336f12ef4d0f0f827c8f7dacb7f0ef630c5dafe62dff133fe4d672f0cd1d7aac495db1ed3b242dd4ca4edcbb0d27789d230a"

RPROVIDES:${PN} += "non-ntk-devel \
pkgconfig-ntk \
pkgconfig-ntk-gl \
pkgconfig-ntk-images"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libntk1 \
pkgconfig-cairo \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xft"

inherit rpm
