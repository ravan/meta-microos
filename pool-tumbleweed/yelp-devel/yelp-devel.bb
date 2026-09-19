SUMMARY = "Development files for libyelp"
DESCRIPTION = "Yelp is the help viewer in GNOME (it's what happens when you press F1). With \
gnome-doc-utils, Yelp serves as a DocBook viewer, a man page viewer and an \
info page viewer. \
 \
This package provides Yelp's development files."
LICENSE = "GPL-2.0-or-later"

PV = "49.2"

RPM_NAME = "yelp-devel-49.2-1.1.aarch64.rpm"
RPM_HASH = "7139797c3be9868940229a0bb044121fd13c30ddc3069a798406e5d80a2b0c8b6bd6c7a02cd235eb6885b0444088c430cd3fcf7cce4fc2c57713a944246a822e"

RPROVIDES:${PN} += "pkgconfig-libyelp-1 \
yelp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyelp-1-0 \
pkgconfig-bzip2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
pkgconfig-libexslt \
pkgconfig-liblzma \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-sqlite3 \
pkgconfig-webkitgtk-6.0 \
pkgconfig-yelp-xsl \
yelp"

inherit rpm
