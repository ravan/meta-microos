SUMMARY = "Simple string key/value database"
DESCRIPTION = "sdb is a simple string key/value database based on djb's cdb disk \
storage and supports JSON and arrays introspection."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "6.2.2"

RPM_NAME = "libsdb2_5_2-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "9949c9ea4072f99a7a55d3859b51dca3861af8b903c17ff0ad46733bf69e7f4b6c14c4dd8ffdbdf8f7c9602420ff30ef4280b2d45046e29035f10870d581c755"

RPROVIDES:${PN} += "libsdb-2-5-2 \
libsdb.so.2.5.2 \
libsdb2-5-0 \
libsdb2-5-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
