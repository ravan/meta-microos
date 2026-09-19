SUMMARY = "QTermWidget devel package"
DESCRIPTION = "Development environment for qtermwidget library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "qtermwidget-qt5-devel-1.4.0-2.7.aarch64.rpm"
RPM_HASH = "d87ff112e0e2eb8600023ba458d6d9e76f43ad71e5b52e4114a437f83777cb0c1765cb0d32fc16439ad5c67b20f98b2c411ee2a0802ff0d589945a7f0791eca0"

RPROVIDES:${PN} += "cmake-qtermwidget5 \
pkgconfig-qtermwidget5 \
qtermwidget-qt5-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqtermwidget5-1 \
pkgconfig-Qt5Widgets \
pkgconfig-libutf8proc"

inherit rpm
