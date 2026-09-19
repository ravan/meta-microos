SUMMARY = "Source code editing widget development headers"
DESCRIPTION = "Development files related to libgedit-gtksourceview."
LICENSE = "LGPL-2.1-or-later"

PV = "299.7.1"

RPM_NAME = "libgedit-gtksourceview-devel-299.7.1-1.1.aarch64.rpm"
RPM_HASH = "290ea51263674e850d232d69e277bf64028c7b13f85f274fc43cb1fb8708693c40c8cf126b937be0f528e024ddd8bd31a41149eadc202ae1fa76a9fa36addf99"

RPROVIDES:${PN} += "libgedit-gtksourceview-devel \
pkgconfig-libgedit-gtksourceview-300"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgedit-gtksourceview-300-5 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgedit-amtk-5 \
pkgconfig-libgedit-gfls-1 \
pkgconfig-libxml-2.0 \
typelib-1-0-GtkSource-300"

inherit rpm
