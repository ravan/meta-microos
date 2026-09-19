SUMMARY = "Development files for the gedit text editor"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME \
environment. \
 \
This subpackage contains the header files for creating gedit plugins."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gedit-devel-50.0-1.3.aarch64.rpm"
RPM_HASH = "6a8cddfe642407cc806c2eafb0fe81f05dbd212f4e38a6909529cfe3753bc4631afd53e4b968706bc3d000c65d6de601aa3fa449993379692a849c558752ccc5"

RPROVIDES:${PN} += "gedit-devel \
gedit-doc \
gedit2-devel \
pkgconfig-gedit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gedit \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgedit-tepl-6 \
pkgconfig-libpeas-gtk-1.0"

inherit rpm
