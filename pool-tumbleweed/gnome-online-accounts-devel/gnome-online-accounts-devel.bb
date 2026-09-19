SUMMARY = "GNOME service to access online accounts -- Development Files"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.58.1"

RPM_NAME = "gnome-online-accounts-devel-3.58.1-1.3.aarch64.rpm"
RPM_HASH = "9ebb7ef8abfe22bbbbaf6552bb05d7c53edf82102cf5ea4baebf47a5e3e87710bfb6db6a2066bd95e271eb97a078b53bdbf9c74a1ad4c853105f60e1cb6025e0"

RPROVIDES:${PN} += "gnome-online-accounts-devel \
pkgconfig-goa-1.0 \
pkgconfig-goa-backend-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoa-1-0-0 \
libgoa-backend-1-0-2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-goa-1.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
typelib-1-0-Goa-1-0"

inherit rpm
