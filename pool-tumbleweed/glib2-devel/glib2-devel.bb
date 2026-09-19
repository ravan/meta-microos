SUMMARY = "Development files for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains the development files for GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "2.88.3"

RPM_NAME = "glib2-devel-2.88.3-1.1.aarch64.rpm"
RPM_HASH = "fde459369fa16485141a1f4dde1055f458d0cc5a0c01170f1d7c043b5b881afdb6b253757884959203e056e1e92aacdb164f2db7813daf23ec4fed8c26891a80"

RPROVIDES:${PN} += "glib2-devel \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-girepository-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gmodule-export-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
rpm-macro-glib2-gio-module-post \
rpm-macro-glib2-gio-module-postun \
rpm-macro-glib2-gio-module-requires \
rpm-macro-glib2-gsettings-schema-post \
rpm-macro-glib2-gsettings-schema-postun \
rpm-macro-glib2-gsettings-schema-requires"

RDEPENDS:${PN} += "/usr/bin/dbus-daemon \
/usr/bin/pkg-config \
/usr/bin/python3.13 \
/usr/bin/sh \
glib2-tools \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgio-2-0-0 \
libgio-2.0.so.0 \
libgirepository-2-0-0 \
libgirepository-2.0.so.0 \
libglib-2-0-0 \
libglib-2.0.so.0 \
libgmodule-2-0-0 \
libgobject-2-0-0 \
libgobject-2.0.so.0 \
libgthread-2-0-0 \
libm.so.6 \
pkgconfig \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libffi \
pkgconfig-libpcre2-8 \
pkgconfig-libselinux \
pkgconfig-mount \
pkgconfig-zlib \
python3-xml \
typelib-1-0-GIRepository-3-0 \
typelib-1-0-GLib-2-0 \
typelib-1-0-GLibUnix-2-0 \
typelib-1-0-GModule-2-0 \
typelib-1-0-GObject-2-0 \
typelib-1-0-Gio-2-0"

inherit rpm
