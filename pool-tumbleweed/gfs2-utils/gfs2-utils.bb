SUMMARY = "Utilities for managing the global file system (GFS2)"
DESCRIPTION = "The gfs2-utils package contains a number of utilities for creating, \
checking, modifying, and correcting any inconsistencies in GFS2 \
file systems."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "gfs2-utils-3.5.1-5.7.aarch64.rpm"
RPM_HASH = "578e3c9a40147ec4baab26f80f00dec9d7497a4f9288bc71c6c2c9fa696083effab4251b9ea0607c86f9b1e19091b83d29ffd4c6b65764075df31c2c804f084d"

RPROVIDES:${PN} += "gfs2-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6 \
libuuid.so.1 \
libz.so.1"

inherit rpm
