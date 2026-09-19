SUMMARY = "Granite is a development library"
DESCRIPTION = "This package ships the library parts of granite."
LICENSE = "LGPL-3.0-or-later"

PV = "7.8.1"

RPM_NAME = "libgranite-7-7-7.8.1-1.3.aarch64.rpm"
RPM_HASH = "575329953dceb884b316e707b4c5e7b6e1ec8a00e296eece6ae6e669a148833cc5c680a52c10bd3fbdd3c5d6a92f753e92efa0f7ffeccd2de7625017a1402e25"

RPROVIDES:${PN} += "granite \
libgranite-7-7 \
libgranite-7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
granite-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
