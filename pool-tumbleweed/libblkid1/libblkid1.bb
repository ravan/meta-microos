SUMMARY = "Filesystem detection library"
DESCRIPTION = "Library for filesystem detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.2"

RPM_NAME = "libblkid1-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "51f25461fd77a51b5ba06f32d048bb07f889e131ce22c05faf117bd6a1e1e67fa678e020b205513723e730f74466d66360963bc92f867da6d2719d7b94d1ea01"

RPROVIDES:${PN} += "libblkid.so.1 \
libblkid1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeconf.so.0"

inherit rpm
