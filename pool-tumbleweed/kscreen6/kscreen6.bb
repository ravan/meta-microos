SUMMARY = "Screen management software by KDE"
DESCRIPTION = "KScreen handles screen management for both X11 and Wayland sessions, including rotation, size, refresh rate, and scaling."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kscreen6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0dd31bfd3d27b27bc870e5c02f5dcb13f0dd556b7f10a2aecab420e889fe14dae5cd02123b0813cb930f98026d0e2aa2127c9c6da3c6c813765f77680027f23e"

RPROVIDES:${PN} += "kscreen6 \
kscreen6-plasmoid"

RDEPENDS:${PN} += "/usr/bin/sh \
kf6-kded \
kf6-kimageformats \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsQuick.so.6 \
libKF6Screen.so.8 \
libKF6WindowSystem.so.6 \
libLayerShellQtInterface.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WaylandClient.so.6 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libkscreen6-plugin \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb.so.1 \
xrdb"

inherit rpm
