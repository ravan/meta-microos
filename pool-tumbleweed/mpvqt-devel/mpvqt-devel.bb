SUMMARY = "Development files for mpvqt"
DESCRIPTION = "This package provides development files needed to use mpvqt in your applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "mpvqt-devel-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "f723eba2c4e712a21af8c2021592992b4cb60d5099c3c98c14e1ba4a56b5ba8efe293b1e3ad87c06485de3be6e492c020fa2c94fa4cf76cc072db43fe6636e4c"

RPROVIDES:${PN} += "cmake-MpvQt \
mpvqt-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
libMpvQt3 \
pkgconfig-mpv"

inherit rpm
