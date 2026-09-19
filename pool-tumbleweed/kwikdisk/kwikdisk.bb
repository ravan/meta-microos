SUMMARY = "Removable Media Utility"
DESCRIPTION = "This utility allows you to manage removable media."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kwikdisk-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "29e27db25142eb0941a8eff4a94782868db268e3d483a00c2b2abd43e39e4533d5e954fb8833a246b887f92c36b7fda75e4554a416299445c6fd0ed0c15848eb"

RPROVIDES:${PN} += "kwikdisk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkdfprivate.so.26 \
libstdc++.so.6"

inherit rpm
