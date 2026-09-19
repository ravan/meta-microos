SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5GlobalAccelPrivate5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "d8ca53fc42d8059657a295dd6967993f7d1559a3e524c1daf36e39b84fd740fd65c91cd2decba499848c76ee8b27e25faa31215c4a7db2e9b726f0f9e4d08cb2"

RPROVIDES:${PN} += "libKF5GlobalAccelPrivate.so.5 \
libKF5GlobalAccelPrivate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5GlobalAccel.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
