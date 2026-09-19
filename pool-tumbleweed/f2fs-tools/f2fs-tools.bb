SUMMARY = "Utilities for the Flash-friendly Filesystem (F2FS)"
DESCRIPTION = "Utilities needed to create and maintain so-called Flash-Friendly (F2) \
filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.16.0"

RPM_NAME = "f2fs-tools-1.16.0-2.6.aarch64.rpm"
RPM_HASH = "92ed8341a231e0d28298c456b78485f9d50d99fc232cc4b6ba08d78560b3a49da27b72d6d0f315a9f7e89c990de60892604b5f19fe87e11c56cdd60baa7f3d46"

RPROVIDES:${PN} += "f2fs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libf2fs.so.10 \
libselinux.so.1 \
libuuid.so.1"

inherit rpm
