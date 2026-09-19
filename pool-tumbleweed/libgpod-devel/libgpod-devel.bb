SUMMARY = "Development files for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package provides the development files to use libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-devel-0.8.3-16.5.aarch64.rpm"
RPM_HASH = "84bae353e42b4d5c662e911ec516e4b3bef57efaf1aed27bf6098f061a66fbaf88f5a62a32b48fec65c97829e747bcf13b98d76ccba6a2689fe517b497a52d74"

RPROVIDES:${PN} += "libgpod-devel \
pkgconfig-libgpod-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
glibc-devel \
libgpod4 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libimobiledevice-1.0"

inherit rpm
