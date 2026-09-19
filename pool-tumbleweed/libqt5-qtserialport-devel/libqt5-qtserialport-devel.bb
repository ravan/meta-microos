SUMMARY = "Development files for the Qt5 SerialPort library"
DESCRIPTION = "You need this package if you want to compile programs with qtserialport."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtserialport-devel-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "bf7cc3f85ee005094fe5e528a234a3d8fee87123468a0b5bd27518fb4d9b0c4faa3184c3775edb096cdac5f1d3123e9f31908905d3a73d98a07f90af4f7e124b"

RPROVIDES:${PN} += "cmake-Qt5SerialPort \
libQt5SerialPort-devel \
libqt5-qtserialport-devel \
pkgconfig-Qt5SerialPort"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5SerialPort5 \
pkgconfig-Qt5Core"

inherit rpm
