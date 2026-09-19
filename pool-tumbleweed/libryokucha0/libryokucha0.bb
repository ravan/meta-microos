SUMMARY = "Library files for ryokucha"
DESCRIPTION = "Library files for ryokucha."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "libryokucha0-0.4.0-1.2.aarch64.rpm"
RPM_HASH = "13232afe3bcbd15b15eca71bfd2bf8e133aeb153b3fe94f5d8392527dbf8e2d47d2f46fe67a3267e6f72329720188d4552d9c53d8594f36cdf800fa1394d3196"

RPROVIDES:${PN} += "libryokucha.so.0 \
libryokucha0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
