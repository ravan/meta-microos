SUMMARY = "Scientific Calculator"
DESCRIPTION = "KCalc is the KDE calculator tool."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kcalc-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "da46685e0403d529fc5d2cec6ccb4c25ab1b4a3507e2e34d0d037156f27ee4f792a071f6a6fde3d8fd55ee266bdc157a362d39001f1fab664726a4a8ef8286ca"

RPROVIDES:${PN} += "kcalc \
kcalc5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6Notifications.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
