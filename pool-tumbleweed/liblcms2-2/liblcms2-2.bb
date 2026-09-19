SUMMARY = "Libraries for the Little CMS Engine"
DESCRIPTION = "Little CMS Engine - A color management library and tools."
LICENSE = "MIT"

PV = "2.19.1"

RPM_NAME = "liblcms2-2-2.19.1-1.3.aarch64.rpm"
RPM_HASH = "6de5d1b3d51fd3920e50e7b182e0934ba08b4a50efd4ff13e11de18e4abc439b67a1d0e14fd279be1bdee9e8b817293d6ea2ac0b7951a1b799ccd140995c1ce1"

RPROVIDES:${PN} += "liblcms2-2 \
liblcms2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
