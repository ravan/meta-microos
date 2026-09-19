SUMMARY = "GtkD devel and header files"
DESCRIPTION = "This package contains the header files for GtkD a D binding and OO wrapper of GTK+"
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "gtkd-devel-3.9.0-3.10.aarch64.rpm"
RPM_HASH = "2f9b1c693c5bf342dce9db9c3291619995e3a679c1f9b14f217e097b365cbe96392323cf2e603d9926d8579f6d60f7ee17ccf370b3ed84ab574de3a027300f00"

RPROVIDES:${PN} += "gtkd-devel \
pkgconfig-gstreamerd-3 \
pkgconfig-gtkd-3 \
pkgconfig-gtkdgl-3 \
pkgconfig-gtkdsv-3 \
pkgconfig-peasd-3 \
pkgconfig-vted-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgstreamerd-3-0 \
libgtkd-3-0 \
libgtkdgl-3-0 \
libgtkdsv-3-0 \
libpeasd-3-0 \
libvted-3-0 \
pkgconfig-atk \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-gdk-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtkd-3 \
pkgconfig-gtkglext-1.0 \
pkgconfig-gtksourceview-3.0 \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pkgconfig-librsvg-2.0 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-vte-2.91"

inherit rpm
