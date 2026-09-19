SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the server-side component."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "libkdsoap-server-qt6-2-2.3.0-1.4.aarch64.rpm"
RPM_HASH = "36ba44dc84cd457d98a0151d923b4ece7eec083c7299e108ca2e729de6a0daead77359acb066e54f9938cb48573779208134ffc650ee6164bd4eb07fad864107"

RPROVIDES:${PN} += "libkdsoap-server-qt6-2 \
libkdsoap-server-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap-qt6.so.2 \
libstdc++.so.6"

inherit rpm
