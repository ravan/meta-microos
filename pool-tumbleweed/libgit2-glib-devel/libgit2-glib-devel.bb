SUMMARY = "Development files for libgit2-glib, a GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.1"

RPM_NAME = "libgit2-glib-devel-1.2.1-2.4.aarch64.rpm"
RPM_HASH = "a931ee4f2a64fad53f1d57d3f9b45eed23b0ef1e0f21d822a31a945ac33c1a2de6f70f1133fdd51edacd5c9b9c2a9938f67aff7b07bb6f2636c829a25536ecb7"

RPROVIDES:${PN} += "libgit2-glib-devel \
pkgconfig-libgit2-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-glib-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libgit2 \
typelib-1-0-Ggit-1-0"

inherit rpm
