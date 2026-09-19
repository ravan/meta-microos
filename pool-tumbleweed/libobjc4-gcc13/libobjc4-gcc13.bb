SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libobjc4-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "39f8da0ece074ee8c341e2f4a434716af23b43f16d633c8e0b94536c4c4aea5bf10f8d7013b608d29c88b95c19fc4e3ac49ad532110b5674e5c9256e33999228"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4 \
libobjc4-gcc13"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
