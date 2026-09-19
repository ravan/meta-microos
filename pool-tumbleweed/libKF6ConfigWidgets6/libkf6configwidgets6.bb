SUMMARY = "Widgets for configuration dialogs"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ConfigWidgets6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f5fa0da7021a63c13ad8ab1a01612bab73618ecd904ff61ca29fcd21b8f53d6b276ba14febf6a0a01db933a7838637f2a0fb044ff89dad6315334f7d40aff753"

RPROVIDES:${PN} += "libKF6ConfigWidgets.so.6 \
libKF6ConfigWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kconfigwidgets \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
