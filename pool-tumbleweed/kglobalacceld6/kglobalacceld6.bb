SUMMARY = "Global keyboard shortcut daemon"
DESCRIPTION = "Daemon providing Global Keyboard Shortcut (Accelerator) functionality."
LICENSE = "LGPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kglobalacceld6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "263edea9ca3c8c56a711f8eed63e3beb88db2a62b780ee5158913528bc9e663f310f12d880158fb3c6fc9d27d8d100421b5185ecefb3b55b8f7090c3f32196e4"

RPROVIDES:${PN} += "kglobalaccel5 \
kglobalacceld6"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6WindowSystem.so.6 \
libKGlobalAccelD.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb-record.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1"

inherit rpm
