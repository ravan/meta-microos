SUMMARY = "Widgets for configuration dialogs"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5ConfigWidgets5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "233de262ce4e07cbf467440c1a094e6b74da00db5ebce8d6076718d623d0a69442408ff154717e0c273c208138b9ab7c4f7f7b7b75efe2fe3b5a1b11a3758ffb"

RPROVIDES:${PN} += "libKF5ConfigWidgets.so.5 \
libKF5ConfigWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
