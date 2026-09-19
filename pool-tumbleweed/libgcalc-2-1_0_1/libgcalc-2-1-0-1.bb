SUMMARY = "Shared library for gnome-calculator"
DESCRIPTION = "This package contains a shared library for gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+16"

RPM_NAME = "libgcalc-2-1_0_1-50.0+16-1.3.aarch64.rpm"
RPM_HASH = "5195881bbe345c201ec7f51565e7c4a561f4050a554ae095bdb4f5367b5a30457615be47a351ee8c22149d61710c53ded8fcb5e7f00bff54c28184aa6bdcc054"

RPROVIDES:${PN} += "libgcalc-2-1-0-1 \
libgcalc-2.so.1.0.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmpc.so.3 \
libmpfr.so.6"

inherit rpm
