SUMMARY = "Development files for the Qt 5 Charts Library"
DESCRIPTION = "This package provides header files and shared libraries for development with \
Qt Charts."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Charts5-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "a66e99c012986928b493dae7a76b070e08d5fca344d372d368b70c67f522c167a437bf1ddcc0497ddd92f642bd70578fd7669070df29f688bafa547cfa826c06"

RPROVIDES:${PN} += "cmake-Qt5Charts \
libQt5Charts5-devel \
pkgconfig-Qt5Charts"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Charts5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets"

inherit rpm
