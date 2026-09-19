SUMMARY = "Plugin for the Qt Interface designer"
DESCRIPTION = "The qwt-designer package contains the plugin for the Qt User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-designer-5.2.3_qt5+git20181129.2819734-4.8.aarch64.rpm"
RPM_HASH = "a576a54c481dea7ce94c508cb6d98601f7f48482288f9f31b1079e6ad25dd2d02dab830d64cac5173f97f8cc0687cc408f11d7a22a3d24526fa7f08c061e1185"

RPROVIDES:${PN} += "libqwt5-designer-plugin.so \
qwt-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqwt5-qt5.so.5 \
libstdc++.so.6 \
qwt-devel"

inherit rpm
