SUMMARY = "GNUnet library libgnunetgnsrecord"
DESCRIPTION = "This package contains the libgnunetgnsrecord library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetgnsrecord0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "15bc86525396db3f5eb0325e3bbd3faf8926efdc7941c69ac24f6888160b67e92032c624ab73b3356cf9b5983c495ed64fb4c27c4ca855bc06a27f3299aa95e9"

RPROVIDES:${PN} += "libgnunetgnsrecord.so.0 \
libgnunetgnsrecord0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnunetutil.so.20 \
libsodium.so.26"

inherit rpm
