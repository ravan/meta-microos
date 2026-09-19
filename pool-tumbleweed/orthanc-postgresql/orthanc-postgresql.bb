SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "PostgreSQL Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "10.3"

RPM_NAME = "orthanc-postgresql-10.3-1.2.aarch64.rpm"
RPM_HASH = "a60ae4352cccb125b530b3c1e6ac52ddefa7868060d5aa3f2dfc13c1e8efffd5f1c739ccbda99b49fa883b9a1dd17fdc36f7b120174154ed2f4e5751eed9e5a6"

RPROVIDES:${PN} += "libOrthancPostgreSQLIndex.so.10.3 \
libOrthancPostgreSQLStorage.so.10.3 \
orthanc-postgresql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libpq.so.5 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libuuid.so.1 \
orthanc \
postgresql-server"

inherit rpm
