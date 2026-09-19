SUMMARY = "Library files for xeme"
DESCRIPTION = "Library files for xeme."
LICENSE = "LGPL-2.1-or-later"

PV = "0+64"

RPM_NAME = "libxeme0-0+64-1.5.aarch64.rpm"
RPM_HASH = "426cd4d70f8769629f698b629131dccd53fcc6a4334d1a77c4a5d45167bc5f1d53fe8e831c5f5405edadbc7fc909b0e11e4bb2ac95a5d021c30bf18c9c052da7"

RPROVIDES:${PN} += "libxeme.so.0 \
libxeme0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbirb.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
