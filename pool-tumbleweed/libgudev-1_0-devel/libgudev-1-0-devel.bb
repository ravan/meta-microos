SUMMARY = "Devel package for libgudev"
DESCRIPTION = "This is the devel package for the GObject library libgudev, which \
provides GObject access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "238"

RPM_NAME = "libgudev-1_0-devel-238-1.13.aarch64.rpm"
RPM_HASH = "507efca09d182b61f3dbefb884b9deb2cda6c5a205495a265217cb8a156c413754ba78b1ac83f1e2fcd8d4b4d7fac3dbbe6484242b3eafa09421e2a8be4018fe"

RPROVIDES:${PN} += "libgudev-1-0-devel \
pkgconfig-gudev-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgudev-1-0-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libudev \
typelib-1-0-GUdev-1-0"

inherit rpm
