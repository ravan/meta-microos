SUMMARY = "Program to set debug verbosity for KDE applications"
DESCRIPTION = "This program allows to tune the debug output of KDE applications, ranging \
from verbose to completely silent."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdebugsettings-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "23a1ed8a1fc0e949065d7fbe2eeea44c44d3749549139ea8f4ae3fa24af3f524018e7c7ac8d1abed6e3a6789c359c68c24cf3f8a285cb24721e7dc6c5e801da3"

RPROVIDES:${PN} += "kdebugsettings \
kdebugsettings5 \
libkdebugsettings.so.6 \
libkdebugsettingscore.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
