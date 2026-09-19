SUMMARY = "Library files for seagull"
DESCRIPTION = "Library files for seagull."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "libseagull0-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "7156adbf0e22c5944be05488c72f8702f200e48b5bcb5ec67cd0e089c310168aa277e93a751807bb4f38d0bb2e87979c7960ed8e6d6a0cb65aea9cc9f8381ccf"

RPROVIDES:${PN} += "libseagull.so.0 \
libseagull0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
