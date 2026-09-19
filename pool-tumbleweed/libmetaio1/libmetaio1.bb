SUMMARY = "Shared library for libmetaio - LIGO Light-Weight XML library"
DESCRIPTION = "This package contains the shared libraries needed for running libmetaio \
applications."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "libmetaio1-8.5.1-1.19.aarch64.rpm"
RPM_HASH = "58f8d594770b99fdc5f54ffa5555eedb536ec5ce45e00f237bde27b4ec01c47053857a6256b2ca8d531d8361f638e354c9a05ed84450ee4edaffe7e8bd116d98"

RPROVIDES:${PN} += "libmetaio.so.1 \
libmetaio1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
