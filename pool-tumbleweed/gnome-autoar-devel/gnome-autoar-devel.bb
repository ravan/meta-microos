SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet. \
 \
This package brings files required to develop against gnome-autoar"
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "gnome-autoar-devel-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "d147af45a91ae04b763736568d152ec78a6a45741b77317c686f139c6af7d4acda4c13c71e4acd47552d36f58d0839abb6869c51c848381226c5548c106f4adc"

RPROVIDES:${PN} += "gnome-autoar-devel \
pkgconfig-gnome-autoar-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-autoar-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-libarchive \
typelib-1-0-GnomeAutoar-0-1"

inherit rpm
