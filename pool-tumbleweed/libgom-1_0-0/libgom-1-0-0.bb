SUMMARY = "GObject Data Mapper"
DESCRIPTION = "This is a DataMapper for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.6"

RPM_NAME = "libgom-1_0-0-0.5.6-1.3.aarch64.rpm"
RPM_HASH = "21495bc7c07527d5f76f058a10704b93721eb6174ab7138b9b38aba4fe65487e05561811791a8b2900f7317f0974c212f30ae4372ed2ad8b6fd1095b001c428c"

RPROVIDES:${PN} += "libgom-1-0-0 \
libgom-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
