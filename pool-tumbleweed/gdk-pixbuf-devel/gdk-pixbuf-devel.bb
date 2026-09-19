SUMMARY = "Development files for gdk-pixbuf, an image loading library"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the development files for gdk-pixbuf."
LICENSE = "LGPL-2.1-or-later"

PV = "2.44.7"

RPM_NAME = "gdk-pixbuf-devel-2.44.7-1.2.aarch64.rpm"
RPM_HASH = "aa74cd7ad7a8fb13f5907768412b7c14f1044ca0c69bfb8619d0c61cf18387aca12b15b91a472067a7df3ec7117d6765875de8c920d25e4f1358de06bbedbc91"

RPROVIDES:${PN} += "gdk-pixbuf-devel \
pkgconfig-gdk-pixbuf-2.0 \
rpm-macro-gdk-pixbuf-loader-post \
rpm-macro-gdk-pixbuf-loader-postun \
rpm-macro-gdk-pixbuf-loader-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2-0-0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-glycin-2 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-shared-mime-info \
typelib-1-0-GdkPixbuf-2-0 \
typelib-1-0-GdkPixdata-2-0"

inherit rpm
