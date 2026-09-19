SUMMARY = "System Daemon for Managing Color Devices -- GTK Integration Development Files"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "libcolord-gtk-devel-0.3.1-1.6.aarch64.rpm"
RPM_HASH = "dc0e399975284f422c0ccd53de4ebe11345b9f18e8e69769891866cf53d67f368ad6dd0c3c21d91c2d50edd969c5b64c92c490e8a9e8d449a33640ce3f645cab"

RPROVIDES:${PN} += "libcolord-gtk-devel \
pkgconfig-colord-gtk \
pkgconfig-colord-gtk4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcolord-gtk1 \
libcolord-gtk4-1 \
pkgconfig-colord \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk4 \
typelib-1-0-ColordGtk-1-0"

inherit rpm
