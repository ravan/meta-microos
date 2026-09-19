SUMMARY = "Development files for libmirage, a CD-ROM image access library"
DESCRIPTION = "A CD-ROM image access library part of the cdemu suite. \
 \
libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains files needed to develop with libmirage."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "libmirage-devel-3.3.2-2.1.aarch64.rpm"
RPM_HASH = "7fbcf9b8036e7f9c660bffb0bb6896229836c216156f3dbdc89cb0f10c20804be6c4b15c5bbc34e6276cb9ce1d3426ef9ef66bea77236f010194618aeca5025d"

RPROVIDES:${PN} += "libmirage-devel \
pkgconfig-libmirage"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libmirage12 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
