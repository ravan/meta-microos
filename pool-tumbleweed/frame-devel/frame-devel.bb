SUMMARY = "Touch frame library development files"
DESCRIPTION = "This package provides the tree that handles the buildup and \
synchronisation of a set of simultaneous touches. \
 \
This package includes the development files for frame."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.5.0+bzr20160809"

RPM_NAME = "frame-devel-2.5.0+bzr20160809-4.8.aarch64.rpm"
RPM_HASH = "27fce2557b5dc84cef3bd5bbd0efd9ae7f5a286674b81054010e1edcd50c425499c9243b8630576810368a82302ba4014482d1903515bdba295902bf4bae350a"

RPROVIDES:${PN} += "frame-devel \
pkgconfig-frame \
pkgconfig-frame-x11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
frame \
libframe6"

inherit rpm
