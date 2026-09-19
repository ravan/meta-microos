SUMMARY = "Qt5 SVG examples"
DESCRIPTION = "Examples for the libqt5-qtsvg modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde5"

RPM_NAME = "libqt5-qtsvg-examples-5.15.19+kde5-1.3.aarch64.rpm"
RPM_HASH = "932fc561e23b14b896e8ba5099f9758d3d204a664ca626fe4dc0d5f9056a76f0f1a75c19ea6f9af748c90702c3153f7af39d56dd01665f8615343da12686107f"

RPROVIDES:${PN} += "libqt5-qtsvg-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
