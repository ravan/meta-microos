SUMMARY = "Development files for the Qt5 widgets library"
DESCRIPTION = "Development files for the Qt5 widgets library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Widgets-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "910d0f929d1741decdfaab3f0b5121bb482a9f261308e702718971c0bbacfb5d75bbd13141db6e7c8797b2a451687541b36acd98b94dc85927030f38e22bc0c8"

RPROVIDES:${PN} += "cmake-Qt5Widgets \
libQt5Widgets-devel \
pkgconfig-Qt5Widgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Gui-devel \
libQt5Widgets5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
