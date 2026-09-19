SUMMARY = "Development files for Brasero, a CD/DVD burning application for GNOME"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
This package contains the development files."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3+43"

RPM_NAME = "brasero-devel-3.12.3+43-3.3.aarch64.rpm"
RPM_HASH = "003a415aa56eeffd2a2bc88f52885513581d2ffb0caf3ea5cd08e6ae0afb1a83afa3ea2df7ba3abffb733e5afe2ce3156506c3ed993ad3a385986e287e979757"

RPROVIDES:${PN} += "brasero-devel \
pkgconfig-libbrasero-burn3 \
pkgconfig-libbrasero-media3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
brasero \
libbrasero-burn3-1 \
libbrasero-media3-1 \
libbrasero-utils3-1 \
pkgconfig-glib-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-BraseroBurn-3-2-0 \
typelib-1-0-BraseroMedia-3-2-0"

inherit rpm
