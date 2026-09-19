SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "libmsiecf1-20260525-1.11.aarch64.rpm"
RPM_HASH = "3238c9fe6bfc1f8cc8704f596696f9a055ec5dc4e650cfc4e685fd77e97c945f74694b1e0bd0bdd7ab963aca6da1f3095cfd4c843c425fa89066e68de92dfa33"

RPROVIDES:${PN} += "libmsiecf.so.1 \
libmsiecf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfvalue.so.1"

inherit rpm
