SUMMARY = "Development files for the USB gadget configuration library"
DESCRIPTION = "libusbgx is a C library encapsulating the kernel USB gadget-configfs \
userspace API functionality. \
 \
It provides routines for creating and parsing USB gadget devices \
using the configfs API. Currently, all USB gadget configfs functions \
that can be enabled in kernel release 3.11 are supported. \
 \
This subpackage contains the development headers for the libusbgx \
headers and libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "libusbgx-devel-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "70f0c3948aa5ea4755ca357f1c1bc9f2480ea371f474bd21750826b6ea9b2c204214f8fa3a63348815e4e19d1ef2c0a6960b9d0d75e902da926f1e28e45d02c9"

RPROVIDES:${PN} += "libusbgx-devel \
pkgconfig-libusbgx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libusbgx3 \
pkgconfig-libconfig"

inherit rpm
