SUMMARY = "MySQL plugin for tntdb"
DESCRIPTION = "MySQL plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-mysql-1.4-1.22.aarch64.rpm"
RPM_HASH = "2f1d68fb1a538b5d12b37c9e52aa47b4a428cde6fb39db98bb3d548fdcbc15f85afa6c7669c59299e3e38db94de43bcb019aeabde8662305872ebcce3c2159dd"

RPROVIDES:${PN} += "tntdb-mysql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libmariadb.so.3 \
libstdc++.so.6 \
libtntdb.so.5"

inherit rpm
