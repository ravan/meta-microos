SUMMARY = "Dolphin overlay icons"
DESCRIPTION = "This package provides the necessary plugin libraries for the \
Dolphin filemanager to display overlay icons."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "nextcloud-desktop-dolphin-34.0.3-1.1.aarch64.rpm"
RPM_HASH = "ae83c787667c6b8529c7a5e81a879da513649d55b9daf29129fe36fa29b7f5e8198b512f422f976ef8ea6027be3b75eacb14a3befc5d2b27b2aa00b2a182990e"

RPROVIDES:${PN} += "libnextclouddolphinpluginhelper.so \
nextcloud-desktop-dolphin"

RDEPENDS:${PN} += "dolphin \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOWidgets.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
nextcloud-desktop"

inherit rpm
