SUMMARY = "A GObject-based Exiv2 wrapper -- Development Files"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.6"

RPM_NAME = "libgexiv2-devel-0.14.6-2.4.aarch64.rpm"
RPM_HASH = "135c258f0af81b4bed48722c9aff8c00a409de46240a74facb8547c88161ff692f70c8043fb6c371f24ebc47c12ff08e3a5ec47a919dbdfb0ea700c810945d10"

RPROVIDES:${PN} += "libgexiv2-devel \
pkgconfig-gexiv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgexiv2-2 \
pkgconfig-exiv2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
