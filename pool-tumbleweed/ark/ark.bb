SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ark-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "91da00a21b2ec4bdc9e980a21eb9fa93e9c97cef2bf1821128d5b8089fbeb4f39511343594c278f6288aec5ed0bab7341427747d289415f100e768f6ac2cb496"

RPROVIDES:${PN} += "ark"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libkerfuffle.so.26 \
libstdc++.so.6 \
libz.so.1 \
libzip.so.5"

inherit rpm
