SUMMARY = "Simple snake duel game"
DESCRIPTION = "KSnakeDuel is a simple snake duel game"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ksnakeduel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7a8db8ce37078ef641422969bfc351350f0a27f3af3c5d22f2b24b8e9b11ec41a00557c6966f1411bab31ca8b0fa86d886698871236716d9cb38dcddfc390ea3"

RPROVIDES:${PN} += "ksnakeduel \
ksnakeduel5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDEGames6.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
