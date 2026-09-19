SUMMARY = "Examples for the qt6-declarative module"
DESCRIPTION = "Examples for the qt6-declarative module."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-declarative-examples-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "00f81f8c6f8db2b0d5b0d45427ccd6d3a30c0adf4490dfd6a0082a9b768959663eae6436097424c1bbcdd2d64cef4fd729b65ded43a02833dd3cda3ca5ec7003"

RPROVIDES:${PN} += "libMyStyle.so \
libMyStyleplugin.so \
libchartsplugin.so \
libqmlimageproviderplugin.so \
libqmlimageresponseproviderplugin.so \
libqmltextballoon.so \
libwearable.so \
libwearablesettings.so \
libwearablestyle.so \
qt6-declarative-examples \
qt6-quickcontrols2-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
