SUMMARY = "Folder plugin indexer for Orthanc"
DESCRIPTION = "Folder Indexer Plugin for Orthanc: It synchronizes automatically the \
content of Orthanc with some filesystem."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "orthanc-indexer-1.0-3.10.aarch64.rpm"
RPM_HASH = "e4fc838f0327c58f3c999b03c12d1010d551f00f4e653e89260398cd30a31873f2a9fb1f8bf6bcc2308a06315695676bae9267ed6a047c3df8e485df787ff4c8"

RPROVIDES:${PN} += "libOrthancIndexer.so.1.0 \
orthanc-indexer"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libsqlite3.so.0 \
libstdc++.so.6 \
orthanc"

inherit rpm
