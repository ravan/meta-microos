SUMMARY = "Additional internal libraries for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds the runtime components with private API."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.9"

RPM_NAME = "libmariadbprivate-3.4.9-2.1.aarch64.rpm"
RPM_HASH = "c28c919fd5f7178d46e33ab5f6681825cd82089eb5aa4b48cd4ba9c8291c969aab2f14aa2bab1a264de8d7e44c018f66818b82982adf4c35427de0776c691a7d"

RPROVIDES:${PN} += "libmariadbprivate \
libmariadbprivate.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
