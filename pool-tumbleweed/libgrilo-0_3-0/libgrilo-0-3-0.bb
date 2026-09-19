SUMMARY = "Framework for browsing and searching media content"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "libgrilo-0_3-0-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "ba1d6bcafcc4d1a51bd4e30c5a0e86d863d168af7e6ba5e67f436fcfb1fd54b2d85ba9976ae07965b685a31ec86c4500b40f5f129f74b64892243e549940c54b"

RPROVIDES:${PN} += "grilo \
libgrilo-0-3-0 \
libgrilo-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
