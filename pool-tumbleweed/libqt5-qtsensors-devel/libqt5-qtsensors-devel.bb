SUMMARY = "Development files for the Qt 5 Sensors library"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5Sensors5."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtsensors-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "e88f99fdab867a209c6b17eda8e5f3edb0efb99f446dda345ad788702d2e9ca396e9b8210fe3bd34ab6f86e955d5aaeb47c4f4550120b7ebaa29f54c5935708f"

RPROVIDES:${PN} += "cmake-Qt5Sensors \
libQt5Sensors-devel \
libqt5-qtsensors-devel \
pkgconfig-Qt5Sensors"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Sensors5 \
pkgconfig-Qt5Core"

inherit rpm
