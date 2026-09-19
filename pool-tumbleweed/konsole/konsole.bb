SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konsole-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9c77d074dc2618045d0621fef5502606e57ef0e959d9c79458e111a117c4e8e9d98c14582644c341b4a75d661654aa4ac60ecc8ca840238d0161a9959253a5f2"

RPROVIDES:${PN} += "konsole \
konsole-zsh-completion \
konsole5 \
libkonsoleapp.so.26.08.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
konsole-part \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NotifyConfig.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libkonsoleprivate.so.26.08.1 \
libstdc++.so.6"

inherit rpm
