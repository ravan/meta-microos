SUMMARY = "Web Viewer plugin for Orthanc"
DESCRIPTION = "Webviewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "2.10"

RPM_NAME = "orthanc-webviewer-2.10-3.10.aarch64.rpm"
RPM_HASH = "80b5a4a4881b92ee6923dcd56b66281ca3a7732036c26ad2ea64deddac90a1fa7bc57e52e0853df74a4d83c07346b650e047d832dffdd166e74559ded6878102"

RPROVIDES:${PN} += "libOrthancWebViewer.so.2.10 \
orthanc-webviewer"

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
libuuid.so.1 \
orthanc"

inherit rpm
