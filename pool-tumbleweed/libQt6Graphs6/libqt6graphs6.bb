SUMMARY = "Qt 6 Graphs library"
DESCRIPTION = "The Qt Graphs module enables you to visualize data in 3D as bar, scatter, and \
surface graphs. \
It's especially useful for visualizing depth maps and large quantities of \
rapidly changing data, such as data received from multiple sensors. \
The look and feel of graphs can be customized by using themes or by adding \
custom items and labels"
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Graphs6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "71b5a07e6d0be2dac88b8c78e9700d5c9499dc17dce46fc5167e9e993b6abd4252bc7e4bf1f4c4ba58c57fdc67c21f5fb62e641781bb0d4110c0e7a993b72636"

RPROVIDES:${PN} += "libQt6Graphs.so.6 \
libQt6Graphs6 \
libQt6GraphsWidgets.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3D.so.6 \
libQt6QuickShapes.so.6 \
libQt6QuickWidgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
