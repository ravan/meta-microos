SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the client-side component."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "libkdsoap-qt6-2-2.3.0-1.4.aarch64.rpm"
RPM_HASH = "6fa5f05441beabd559c1cc09e2713666f5abb153141d02664fea0c96840a102dbc9c7e638deedf1fd916ad635fae74cc3dee8ba576648c04a425f533e82ee153"

RPROVIDES:${PN} += "libkdsoap-qt6-2 \
libkdsoap-qt6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
