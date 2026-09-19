SUMMARY = "Image handling and conversion library"
DESCRIPTION = "Imlib2 is an advanced replacement library for libraries like libXpm \
that provides many more features with much greater flexibility and \
speed than standard libraries, including font rasterization, rotation, \
RGBA space rendering and blending, dynamic binary filters, scripting, \
and more."
LICENSE = "BSD-3-Clause"

PV = "1.12.7"

RPM_NAME = "libImlib2-1-1.12.7-1.1.aarch64.rpm"
RPM_HASH = "d419e3d238f9bbf1cd407f345f20b6797e4d55c9859c1ac35637bcd351646c935f7695ed2e52501a8882d1330403f9b5f4bfb1ddd8e019838e2c57bbd58ff092"

RPROVIDES:${PN} += "libImlib2-1 \
libImlib2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libfreetype.so.6 \
libm.so.6 \
libxcb-shm.so.0 \
libxcb.so.1"

inherit rpm
