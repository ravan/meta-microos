SUMMARY = "Library for parsing the Adobe/Macromedia drawings"
DESCRIPTION = "Libfreehand is library providing ability to interpret and import Adobe/Macromedia \
drawings into various applications. You can find it being used in libreoffice."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-0_1-1-0.1.2-2.29.aarch64.rpm"
RPM_HASH = "f260bf5b96d01785472f455014f24a1e6e4c39806912183953e66930230914cda2f9a023f222518bed14e89d558bd590dca0e9a9fd47bcd52522cb12e6b5bff8"

RPROVIDES:${PN} += "libfreehand-0-1-1 \
libfreehand-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblcms2.so.2 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
