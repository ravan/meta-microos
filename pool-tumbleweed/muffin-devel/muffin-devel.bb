SUMMARY = "Muffin development files"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides the development files."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "muffin-devel-6.4.1-2.4.aarch64.rpm"
RPM_HASH = "32ac7f21914afca18d0ea762c040e0f08be78b7af3c173315f334840e2fa334934be002f0270df3a24c25dd3428d1a868a789d15989bf074c1405aeb29554223"

RPROVIDES:${PN} += "muffin-devel \
pkgconfig-libmuffin-0 \
pkgconfig-muffin-clutter-0 \
pkgconfig-muffin-clutter-x11-0 \
pkgconfig-muffin-cogl-0 \
pkgconfig-muffin-cogl-pango-0 \
pkgconfig-muffin-cogl-path-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmuffin0 \
pkgconfig-atk \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cinnamon-desktop \
pkgconfig-egl \
pkgconfig-gio-unix-2.0 \
pkgconfig-gl \
pkgconfig-glesv2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-graphene-gobject-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-muffin-clutter-0 \
pkgconfig-muffin-cogl-0 \
pkgconfig-pango \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-xfixes \
pkgconfig-xi \
typelib-1-0-Muffin-0-0"

inherit rpm
