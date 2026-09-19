SUMMARY = "Development files for the valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code. \
 \
This package contains the libvaladoc development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "libvaladoc-0_56-devel-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "383afedf9b0b141a66cd9c5b5f0bfacd4a4a91c298af3f13b52b3af428b09d206318985370a089eba11527201a2a3888bedd845b87766d1ad7ff73d0a8b46622"

RPROVIDES:${PN} += "libvaladoc-0-56-devel \
libvaladoc-devel \
pkgconfig-valadoc-0.56"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvaladoc-0-56-0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libgvc \
pkgconfig-libvala-0.56"

inherit rpm
