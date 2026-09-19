SUMMARY = "GLib integration of PackageKit"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.6"

RPM_NAME = "libpackagekit-glib2-devel-1.3.6-2.1.aarch64.rpm"
RPM_HASH = "f6f09549995b15742666897f8de4d42fa5095da723e39873a31c9d93f34c0a53873aaaf0f196b1275746da11b06ab21f0e9b7a7b3e8e28a6ecc4f1363069a72e"

RPROVIDES:${PN} += "libpackagekit-glib12-devel \
libpackagekit-glib2-devel \
pkgconfig-packagekit-glib2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpackagekit-glib2-18 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-PackageKitGlib-1-0"

inherit rpm
