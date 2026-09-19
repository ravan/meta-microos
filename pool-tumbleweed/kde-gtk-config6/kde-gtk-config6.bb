SUMMARY = "Daemon for GTK2 and GTK3 Applications Appearance Under KDE"
DESCRIPTION = "kde-gtk-config is a KDED module which configures GTK2 and GTK3 applications \
appearance under KDE."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kde-gtk-config6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "4b3314476d966d2841dc2767d1378419e720ce1c05dd8b22b8289a4b558bba4ce6434994f23394dc20e03c8d6d0766db16101355003a326933c20d22a88b6cce"

RPROVIDES:${PN} += "kde-gtk-config \
kde-gtk-config5 \
kde-gtk-config5-gtk2 \
kde-gtk-config6 \
libcolorreload-gtk-module.so \
libwindow-decorations-gtk-module.so"

RDEPENDS:${PN} += "/usr/bin/sh \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6DBusAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkdecorations3.so.6 \
libkdecorations3private.so.2 \
libstdc++.so.6 \
xsettingsd"

inherit rpm
