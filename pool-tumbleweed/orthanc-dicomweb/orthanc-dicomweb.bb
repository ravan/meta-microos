SUMMARY = "WebViewer plugin for Orthanc"
DESCRIPTION = "WebViewer plugin for Orthanc"
LICENSE = "AGPL-3.0-or-later"

PV = "1.24"

RPM_NAME = "orthanc-dicomweb-1.24-1.1.aarch64.rpm"
RPM_HASH = "fb7005bcc783a52f9ef5c908a38fe23a334517b493c4fa35ca8ee203d2748030f25a54a3ac7d4d176d9bdd2f21e1c5b6cf0c2e3a1d27d3157583ac770371c467"

RPROVIDES:${PN} += "libOrthancDicomWeb.so.1.24 \
orthanc-dicomweb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-iostreams.so.1.91.0 \
libboost-locale.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6 \
libz.so.1 \
orthanc"

inherit rpm
