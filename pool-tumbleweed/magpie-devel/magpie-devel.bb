SUMMARY = "Development files for magpie, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the magpie library."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.4+0"

RPM_NAME = "magpie-devel-0.9.4+0-1.9.aarch64.rpm"
RPM_HASH = "543a9022cbb3d54b4d2abbb2a4da717e2d1fea9f56dbc62a2fe74ae0e4ea5de7de23f17aaa968a9679e0069d1100280318efe806e95b49a874c8397ad1be5505"

RPROVIDES:${PN} += "magpie-devel \
pkgconfig-libmagpie-0 \
pkgconfig-magpie-clutter-0 \
pkgconfig-magpie-cogl-0 \
pkgconfig-magpie-cogl-pango-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
magpie \
pkgconfig-atk \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-egl \
pkgconfig-gio-unix-2.0 \
pkgconfig-gl \
pkgconfig-glesv2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-graphene-gobject-1.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-magpie-clutter-0 \
pkgconfig-magpie-cogl-0 \
pkgconfig-pango \
pkgconfig-x11 \
pkgconfig-xfixes \
pkgconfig-xi"

inherit rpm
