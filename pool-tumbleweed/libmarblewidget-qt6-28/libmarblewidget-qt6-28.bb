SUMMARY = "Generic map viewer: Shared Library"
DESCRIPTION = "The shared library for the MarbleWidget shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libmarblewidget-qt6-28-26.08.1-1.2.aarch64.rpm"
RPM_HASH = "09ab3e162b8d266a6e20b445bb0f82e22d5b8117c20845694f4c9b70f752b81ffa3a4d67569524e2863c6126ed40aafc70c71e032eaa5f41c38d4f1cbc470b93"

RPROVIDES:${PN} += "libmarblewidget-qt6-28 \
libmarblewidget-qt6.so.28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libastro.so.1 \
libc.so.6 \
libm.so.6 \
libphonon4qt6.so.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
