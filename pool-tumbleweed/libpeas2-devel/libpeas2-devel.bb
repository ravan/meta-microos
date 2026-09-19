SUMMARY = "Development files for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.1"

RPM_NAME = "libpeas2-devel-2.2.1-2.4.aarch64.rpm"
RPM_HASH = "ff4f0a583a144e12d0c69b05d06c9693122f6263a280937068faac27e674cdd2a233a887d4de273cb1ffbc89561c2cbafbd231975994fc5cf1e5081f00e5f67e"

RPROVIDES:${PN} += "libpeas2-devel \
pkgconfig-libpeas-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpeas-2-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Peas-2"

inherit rpm
