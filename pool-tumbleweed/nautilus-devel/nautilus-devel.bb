SUMMARY = "File Manager for the GNOME Desktop -- Development Files"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains development files for nautilus."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "50.3.1"

RPM_NAME = "nautilus-devel-50.3.1-1.1.aarch64.rpm"
RPM_HASH = "9faf09c26a26923aba713207428c9329427f2edd444061b2d797f95338fa1d0142d003307449efb55ae8a1037da32eb34d4bc0916e571d26ff73920625b72d28"

RPROVIDES:${PN} += "nautilus-devel \
pkgconfig-libnautilus-extension-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnautilus-extension4 \
nautilus \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Nautilus-4-1"

inherit rpm
