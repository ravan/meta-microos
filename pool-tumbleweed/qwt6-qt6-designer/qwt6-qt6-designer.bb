SUMMARY = "Plugin for the Qt6 Interface designer"
DESCRIPTION = "The qwt6-qt6-designer package contains the plugin for the Qt5 User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "6.3.0"

RPM_NAME = "qwt6-qt6-designer-6.3.0-1.10.aarch64.rpm"
RPM_HASH = "6dd2f43e27901a32c6e2d2d5799e6e1bd0d6c185dc6369e3b7b1b89755b0d077a2ded1606edcd483e8ca6c0bef270dbc27b48addca4f2b8abcba8bd7949ebbf0"

RPROVIDES:${PN} += "libqwt-designer-plugin.so \
qwt6-qt6-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libqwt-qt6.so.6.3 \
libstdc++.so.6 \
qwt6-qt6-devel"

inherit rpm
