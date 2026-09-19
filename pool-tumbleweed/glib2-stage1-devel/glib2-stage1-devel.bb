SUMMARY = "General-Purpose Utility Library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "glib2-stage1-devel-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "174d74369be7ac850b576869e827fcaab97930fbcab64547e71904155de2fb9b03418179d6155660ed57caa5f4be079dd3ab6ba487c2812ffa3b59c8e36a71b5"

RPROVIDES:${PN} += "glib2-stage1-devel \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-girepository-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gmodule-export-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/env \
/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libelf.so.1 \
libffi.so.8 \
libm.so.6 \
libmount.so.1 \
libpcre2-8.so.0 \
libz.so.1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libffi \
pkgconfig-libpcre2-8 \
pkgconfig-mount \
pkgconfig-zlib \
this-is-only-for-build-envs"

inherit rpm
