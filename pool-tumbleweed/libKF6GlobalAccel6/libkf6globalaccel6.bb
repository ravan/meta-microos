SUMMARY = "Global desktop keyboard shortcuts"
DESCRIPTION = "KGlobalAccel allows you to have global accelerators that are independent of \
the focused window.  Unlike regular shortcuts, the application's window does not \
need focus for them to be activated."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6GlobalAccel6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6f4cac8f8ac6325d2f9638795c2052bc16dfef5cb131fff355664874986d93709922c65d05d0b97d26b58b2d50cfe4fab0a01082be4bccb5b9c39c9f70de19ab"

RPROVIDES:${PN} += "libKF6GlobalAccel.so.6 \
libKF6GlobalAccel6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kglobalaccel \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
