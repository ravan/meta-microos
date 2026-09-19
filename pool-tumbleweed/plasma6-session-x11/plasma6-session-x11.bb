SUMMARY = "KDE Plasma 6 Session on X11"
DESCRIPTION = "This package contains the startup scripts and programs necessary to \
start a KDE Plasma 6 session on X11."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-session-x11-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "d8062c4130e82ac1b599b544a4b19aa25405b0e1190dc74a3f09c8e5c5c1dc082c33c1cc098500678643d4c159276c48a15b1e7d2bb04735cc0ddb90a3b8e7c4"

RPROVIDES:${PN} += "plasma6-session-x11"

RDEPENDS:${PN} += "/usr/bin/sh \
kwin6-x11 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6DBusAddons.so.6 \
libKF6Package.so.6 \
libKNightTime.so.0 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libX11.so.6 \
libc.so.6 \
libklookandfeel.so.6 \
libkworkspace6.so.6 \
libstdc++.so.6 \
plasma6-session \
update-alternatives \
xf86-input-libinput \
xorg-x11-server"

inherit rpm
