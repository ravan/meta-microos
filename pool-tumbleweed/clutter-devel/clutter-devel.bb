SUMMARY = "Development files for the Clutter library"
DESCRIPTION = "Clutter is a library for creating fast, visually rich and animated \
graphical user interfaces. \
This package contains the files for development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "clutter-devel-1.26.4-4.23.aarch64.rpm"
RPM_HASH = "d5f95c5cd7ad24e76e6d393f339284979d4bb38128f50df227bea1901de844447a4034dd2ef8d8698e5e78d4f0bbf18e7c4806498603e491c6f30596e5f8af5e"

RPROVIDES:${PN} += "clutter-devel \
clutter-doc \
pkgconfig-cally-1.0 \
pkgconfig-clutter-1.0 \
pkgconfig-clutter-cogl-1.0 \
pkgconfig-clutter-egl-1.0 \
pkgconfig-clutter-gdk-1.0 \
pkgconfig-clutter-glx-1.0 \
pkgconfig-clutter-wayland-1.0 \
pkgconfig-clutter-wayland-compositor-1.0 \
pkgconfig-clutter-x11-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclutter-1-0-0 \
pkgconfig-atk \
pkgconfig-cairo-gobject \
pkgconfig-clutter-1.0 \
pkgconfig-cogl-1.0 \
pkgconfig-cogl-pango-1.0 \
pkgconfig-cogl-path-1.0 \
pkgconfig-gdk-3.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libinput \
pkgconfig-libudev \
pkgconfig-pangocairo \
pkgconfig-pangoft2 \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-xcomposite \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xi \
pkgconfig-xkbcommon \
typelib-1-0-Clutter-1-0"

inherit rpm
