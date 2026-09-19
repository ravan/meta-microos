SUMMARY = "KDE version of xdialog"
DESCRIPTION = "KDialog can be used to show nice dialog boxes from shell scripts."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdialog-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6815bb43be5421ce910ade7c6a29f50ce83629af799c32ef4dca02a35b33bb473566cab3a762255b01f16e2767b87a479427e4da149d002b17799114df36896d"

RPROVIDES:${PN} += "kdialog"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
