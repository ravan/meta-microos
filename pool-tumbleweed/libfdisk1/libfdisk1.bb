SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libfdisk1-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "ebb991e85e0d09cbed66e9dc375ca8cbd7f85ff382132e9489d2a58264c8d2f49a8713e5c0fc7936f485deda126bfa341d2d8e08b9a62f02e0c26a28669274f4"

RPROVIDES:${PN} += "libfdisk.so.1 \
libfdisk1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
