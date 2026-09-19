SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "MySQL/mariadb Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "5.2"

RPM_NAME = "orthanc-mysql-5.2-4.7.aarch64.rpm"
RPM_HASH = "ca020bdcd40a67c8d3498b5c37f121d44f0761456e7a70bb16daccb0d0be379a4ff97a55e19b7dd3d757279bffb77711dcbb1a6aea411078e197e305e39dfa4e"

RPROVIDES:${PN} += "libOrthancMySQLIndex.so.5.2 \
libOrthancMySQLStorage.so.5.2 \
orthanc-mysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libmariadb.so.3 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
mariadb \
orthanc"

inherit rpm
