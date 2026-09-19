SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "A library to allow applications to add an icon into the \
StatusNotifier-compatible notification area. If none are available, \
it also provides an XEmbed-tray fallback."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.93"

RPM_NAME = "libayatana-appindicator3-1-0.5.93-3.4.aarch64.rpm"
RPM_HASH = "a602a2f7f6d23473ea84b04a8bccc5c507c88ca8ec46ec9c5b5a86c3d004f36364c3fd1809f77eb9028c052052f9bfe64850d97c1516f5352797ef3fc2cabf49"

RPROVIDES:${PN} += "libayatana-appindicator3 \
libayatana-appindicator3-1 \
libayatana-appindicator3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libayatana-indicator3.so.7 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
