SUMMARY = "Development files for kdsoap, a Qt-based client and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides development headers to use KD Soap in Qt based \
applications."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kdsoap-qt6-devel-2.3.0-1.4.aarch64.rpm"
RPM_HASH = "d7346a7f86ae5b802e0d9abf63e2b92b4c64c225f001acf8491e1e0d6f73a92f10b2ccd3e88fa6e7853e9ce456d94097719ad09bf8bdc662350babfc316084ba"

RPROVIDES:${PN} += "cmake-KDSoap-qt6 \
kdsoap-qt6-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap-qt6-2 \
libkdsoap-server-qt6-2 \
libstdc++.so.6"

inherit rpm
