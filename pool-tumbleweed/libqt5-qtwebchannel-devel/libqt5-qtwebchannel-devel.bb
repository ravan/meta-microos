SUMMARY = "Development files for the Qt5 WebChannel library"
DESCRIPTION = "You need this package if you want to compile programs with qtwebchannel."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qtwebchannel-devel-5.15.19+kde3-1.2.aarch64.rpm"
RPM_HASH = "f907d8c7c1c293117be6ba5b18ba74537f2687d528630955b039ed949b32c62470173bd011b2c026650338fda0d17ca9826eca14c21e9d9e99418a898e87a8aa"

RPROVIDES:${PN} += "cmake-Qt5WebChannel \
libqt5-qtwebchannel-devel \
pkgconfig-Qt5WebChannel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5WebChannel5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Qml"

inherit rpm
