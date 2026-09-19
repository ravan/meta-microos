SUMMARY = "Qt 6 DataVisualizationQml library"
DESCRIPTION = "The Qt 6 DataVisualizationQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6DataVisualizationQml6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "8531bcd541d10e7797ae6aa68cd47284052dc9ed80ad56e5f16fdfb1471cf7fc85d2a16d5a83f50234fd14978c57ce42d36e25cea93451aa0a71b337d1f0ebc9"

RPROVIDES:${PN} += "libQt6DataVisualizationQml.so.6 \
libQt6DataVisualizationQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DataVisualization.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
