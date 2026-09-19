SUMMARY = "Plugins for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds MariaDB library plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.9"

RPM_NAME = "libmariadb_plugins-3.4.9-2.1.aarch64.rpm"
RPM_HASH = "d746331c30322d621794110d6d6156f457cb9752984c8b439025e676aca5695a30992915f4729d45f4b4d7ecc217aad4cb5f22ee4532f69aa82ad847c69b3b75"

RPROVIDES:${PN} += "libmariadb-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgssapi-krb5.so.2 \
libzstd.so.1"

inherit rpm
