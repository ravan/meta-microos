SUMMARY = "Evolution Data Server backend for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.12"

RPM_NAME = "libfolks-eds26-0.15.12-2.4.aarch64.rpm"
RPM_HASH = "db6fe699ffd0149da0e2157a6411cbf5dde656891e4dd8b30e76627b34e47c1fee6c03e267c42bc816376c3d5588bee72abb401ac3d3d9ab66e66446383c99b2"

RPROVIDES:${PN} += "libfolks-eds.so.26 \
libfolks-eds26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.5 \
libedataserver-1.2.so.27 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
