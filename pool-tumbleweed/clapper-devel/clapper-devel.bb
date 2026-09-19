SUMMARY = "Development files for clapper"
DESCRIPTION = "A modern media player powered by GStreamer and built for the GNOME desktop environment. \
 \
This subpackage holds the required files to compile against \
libclapper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-devel-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "1cacbd61deb5e31b389197e4912fed4e4d8813866a8b29d63cda29a9bde91f5276b5c27f90630263a85ea90f6945ae8d1127237998441ed2528d9f966c774e5e"

RPROVIDES:${PN} += "clapper-devel \
pkgconfig-clapper-0.0 \
pkgconfig-clapper-gtk-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclapper-0-0-0 \
libclapper-gtk-0-0-0 \
pkgconfig-clapper-0.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-tag-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-gtk4 \
pkgconfig-libpeas-2 \
pkgconfig-libsoup-3.0 \
pkgconfig-microdns \
typelib-1-0-Clapper-0-0 \
typelib-1-0-ClapperGtk-0-0"

inherit rpm
