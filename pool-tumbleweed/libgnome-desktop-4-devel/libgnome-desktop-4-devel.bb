SUMMARY = "Development files for the GNOME Desktop API library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.5"

RPM_NAME = "libgnome-desktop-4-devel-44.5-1.5.aarch64.rpm"
RPM_HASH = "9bed3750e08e71c59ae12bb420a2e9ccde16a98ae05c2677cfabf654e8529250159f5b5c79af8e12b8c2bc752c0342b0e0234490426b37719e89044e44ecfd3a"

RPROVIDES:${PN} += "libgnome-desktop-4-devel \
pkgconfig-gnome-bg-4 \
pkgconfig-gnome-desktop-4 \
pkgconfig-gnome-rr-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-desktop-4-2 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gnome-desktop-4 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk4 \
pkgconfig-iso-codes \
pkgconfig-libseccomp \
pkgconfig-libsystemd \
pkgconfig-libudev \
pkgconfig-xkbregistry \
pkgconfig-xkeyboard-config \
typelib-1-0-GnomeBG-4-0 \
typelib-1-0-GnomeDesktop-4-0 \
typelib-1-0-GnomeRR-4-0"

inherit rpm
