SUMMARY = "Development files for ryokucha"
DESCRIPTION = "Development files for ryokucha."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "ryokucha-devel-0.4.0-1.2.aarch64.rpm"
RPM_HASH = "2f29f1b237e296608cd36a32cec198694e0e110a8ad25bd117605b057235b6eb683c82060636548d614d0795b3c92e572f2d07763ae3bf6bcc50b1da7e0d756e"

RPROVIDES:${PN} += "pkgconfig-ryokucha \
ryokucha-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libryokucha0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-pango"

inherit rpm
