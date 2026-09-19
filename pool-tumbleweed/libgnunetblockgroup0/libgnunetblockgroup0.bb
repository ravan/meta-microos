SUMMARY = "GNUnet library libgnunetblockgroup"
DESCRIPTION = "This package contains the libgnunetblockgroup library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetblockgroup0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "0f3f698730d7b6fa99e74e59714147e9018815b3b4371fd42a1763d344e45af9abc3bc0fc8f974e0d4935296624acbe09c4961ae30a0a235343d96ce1e62c78f"

RPROVIDES:${PN} += "libgnunetblockgroup.so.0 \
libgnunetblockgroup0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetblock.so.0 \
libgnunetutil.so.20"

inherit rpm
