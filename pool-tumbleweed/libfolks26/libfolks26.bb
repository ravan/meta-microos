SUMMARY = "Library to create metacontacts from multiple sources"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "libfolks26-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "b31107646d382d621102bca105b1cfa77fbb7e095cab0dc165ed77fe564a0fe2617db3f98c66b40898b5e566ad64ae829c5fb0668e6c81ffa7009807fd2ff2f0"

RPROVIDES:${PN} += "folks \
libfolks-dummy.so.26 \
libfolks.so.26 \
libfolks26"

RDEPENDS:${PN} += "/sbin/ldconfig \
folks-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebook-contacts-1.2.so.5 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
