SUMMARY = "Library for working with ISO 9660 filesystems"
DESCRIPTION = "A library for working with ISO 9660 filesystems, which are mainly used on CDs."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "libiso9660-12-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "0723e28a1f25f155ed8c0094f3696a24a8295ee55d528b488a07545a42118b902b404bdb5691a94159a1dc64f293f5efe4a076a70fb91d7e91a98dbfe29d5a4b"

RPROVIDES:${PN} += "libiso9660-12 \
libiso9660.so.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19"

inherit rpm
