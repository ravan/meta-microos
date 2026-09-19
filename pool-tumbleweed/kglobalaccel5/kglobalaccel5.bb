SUMMARY = "Configurable global shortcut support"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent \
of the focused window. Unlike regular shortcuts, the application's window \
does not need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kglobalaccel5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "a2eb7a930f9da0a1b4bd36dde4b6ecbd0e753cdaa28882b28c24686bad1784a7782f33a4113fc3e65dd41d1b708e5ba57f5f4f6019c24507fb4789c0c3c4fc9c"

RPROVIDES:${PN} += "kglobalaccel5"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GlobalAccelPrivate.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libstdc++.so.6 \
libxcb-keysyms.so.1 \
libxcb-record.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1"

inherit rpm
