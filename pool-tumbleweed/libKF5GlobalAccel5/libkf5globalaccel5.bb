SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5GlobalAccel5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "9288b19daf5879dd12c4b6e81e70ae669b4425316e038d3b734b27fba4b342c7a7c0de87bf9dfde6ee77bfbbcdb148d4b817a25ef94033958d400d97b7b15949"

RPROVIDES:${PN} += "libKF5GlobalAccel.so.5 \
libKF5GlobalAccel5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
