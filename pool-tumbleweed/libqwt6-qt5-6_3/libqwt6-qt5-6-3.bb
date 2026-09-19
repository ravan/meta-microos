SUMMARY = "Shared library for Qt5 Widgets for Technical Applications"
DESCRIPTION = "This package contains the shared library to run Technical Applications \
developed with/for Qwt(Qt5)."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "libqwt6-qt5-6_3-6.3.0-1.9.aarch64.rpm"
RPM_HASH = "50ffe04052a2a313a2cef97bb0fd4b375ac30ec77d5831e2124cd012913ea1940cd9bf5c4c45fb7b4ccb20a1295cd41aef6f74dcb428f0826c782183bada0bda"

RPROVIDES:${PN} += "libqwt-qt5.so.6.3 \
libqwt6-qt5-6-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
