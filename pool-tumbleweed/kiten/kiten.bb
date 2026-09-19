SUMMARY = "Japanese Reference/Study Tool"
DESCRIPTION = "Kiten is a tool to learn Japanese."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & CC-BY-SA-4.0"

PV = "26.08.1"

RPM_NAME = "kiten-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "528cac6122f4a082197fc119530fea8204e91afdbee00e526c40a775b60b48fefffb5c9f7875d2660682e018446fa0823af603d692f1ffcd4b508d17f177988d"

RPROVIDES:${PN} += "kiten \
kiten5 \
libkiten.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
edict-eucjp \
fonts-KanjiStrokeOrders \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
