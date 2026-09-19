SUMMARY = "Development files for wiiuse"
DESCRIPTION = "The wiiuse-devel package contains libraries and header files for \
developing applications that use wiiuse."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.15.7"

RPM_NAME = "libwiiuse0-0.15.7-1.3.aarch64.rpm"
RPM_HASH = "77cb81633e2dd7b68944cbea40ccabf2da49f44455b7a66416f54d06ec9b40ce3d629bc4fc5312c957e5ab59216a62bc4cbc3b7c637920587af1b23c3f9b729c"

RPROVIDES:${PN} += "libwiiuse.so.0 \
libwiiuse0 \
pkgconfig-wiiuse"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
