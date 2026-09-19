SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "A library to allow applications to add an icon into the \
StatusNotifier-compatible notification area. If none are available, \
it also provides an XEmbed-tray fallback."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.93"

RPM_NAME = "libayatana-appindicator1-0.5.93-3.4.aarch64.rpm"
RPM_HASH = "9df42b9342d912562cc623b8cd7435a6faf693485da61321456604e181d14fcab1fc4729e62b409120f418e253831155819f0c9ac38684b63ad09a18804baa1c"

RPROVIDES:${PN} += "libayatana-appindicator \
libayatana-appindicator.so.1 \
libayatana-appindicator1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libayatana-indicator.so.7 \
libc.so.6 \
libdbusmenu-glib.so.4 \
libdbusmenu-gtk.so.4 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
