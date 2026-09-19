SUMMARY = "Accessibility inspector"
DESCRIPTION = "Accessibility Inspector is an inspector for your application accessibility tree. \
It lets you check all the items exposed via At-SPI."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "accessibility-inspector-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f38d196d459480c0ba0711a8e921a7d9ff7c172987cf34dc40fddd58def499944786e9879dd759c23d16f42383f97845d787efe3c8911c7338ba460021e670f1"

RPROVIDES:${PN} += "accessibility-inspector \
libaccessibilityinspector.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqaccessibilityclient-qt6.so.0 \
libstdc++.so.6"

inherit rpm
