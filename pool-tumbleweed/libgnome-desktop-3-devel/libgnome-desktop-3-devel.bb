SUMMARY = "Development files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "libgnome-desktop-3-devel-44.5-1.5.aarch64.rpm"
RPM_HASH = "540d8413984548fd0410164f08325fad4b7ee67156b00af8464ee983773e9f1bce80de81b22753f9579a0faa25f21c2e21c7ecf67e731403c202373bdd9091b8"

RPROVIDES:${PN} += "gnome-desktop-devel \
gnome-desktop-doc \
libgnome-desktop-3-devel \
pkgconfig-gnome-desktop-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-desktop-3-20 \
libxkbfile-devel \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-iso-codes \
pkgconfig-libseccomp \
pkgconfig-libsystemd \
pkgconfig-libudev \
pkgconfig-xkbregistry \
pkgconfig-xkeyboard-config \
typelib-1-0-GnomeDesktop-3-0"

inherit rpm
