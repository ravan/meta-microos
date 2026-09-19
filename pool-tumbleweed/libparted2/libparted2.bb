SUMMARY = "Library for manipulating partitions"
DESCRIPTION = "Libparted is a library for creating, destroying, resizing, checking \
and copying partitions and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.7"

RPM_NAME = "libparted2-3.7-1.3.aarch64.rpm"
RPM_HASH = "f33c74c368780435437a5b43b15fa49eb1c1e7463c279b5ceb31d72fbd1c0ccc33992521b189be649002b5f5e637ac4b551c6992984cd8d1c4879f4b53d05c12"

RPROVIDES:${PN} += "libparted.so.2 \
libparted2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libuuid.so.1"

inherit rpm
