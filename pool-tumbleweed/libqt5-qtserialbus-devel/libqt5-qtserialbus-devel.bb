SUMMARY = "Development files for the Qt5 SerialBus library"
DESCRIPTION = "You need this package if you want to compile programs with qtserialbus."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtserialbus-devel-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "a5b388a26901450b0e47b025b574ae39e87b57d470e7eefc03ffe779f12ed9247588421e72f85a6c1d68c0c28b948201e8849bd75b661d136b1a8b84df2c28fa"

RPROVIDES:${PN} += "cmake-Qt5SerialBus \
libqt5-qtserialbus-devel \
pkgconfig-Qt5SerialBus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5SerialBus5 \
pkgconfig-Qt5Core"

inherit rpm
