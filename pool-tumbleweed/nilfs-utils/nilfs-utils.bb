SUMMARY = "Utilities for NILFS"
DESCRIPTION = "This package contains utility programs for NILFS v2."
LICENSE = "GPL-2.0-only"

PV = "2.3.1"

RPM_NAME = "nilfs-utils-2.3.1-2.3.aarch64.rpm"
RPM_HASH = "4b3f541c7fc1c9dbf40e0dbf7274e0a6f21430504a2d15ff3dc68b35dd665a038145bf1fc9378f653733597c9f42fd72bb5c83757676d55cd83f1737954f8296"

RPROVIDES:${PN} += "config-nilfs-utils \
nilfs-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libmount.so.1 \
libnilfs.so.3 \
libnilfsgc.so.3 \
libuuid.so.1"

inherit rpm
