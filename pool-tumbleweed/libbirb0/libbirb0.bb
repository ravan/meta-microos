SUMMARY = "Library files for birb"
DESCRIPTION = "Library files for birb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "libbirb0-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "90443af6c035e8d7f51fbcd99b23a6b970aa35b668fc59dadc598c0c48a47e7a89c411df4997d6f0793583cc23d785c656847c90f1e8eed913142af8022fbfbb"

RPROVIDES:${PN} += "libbirb.so.0 \
libbirb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
