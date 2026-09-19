SUMMARY = "Network information for QNetworkInformation"
DESCRIPTION = "Plugin used to get network information such as the reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-networkinformation-connman-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "ddede77fa8323e49a9b71f573d912207da26d25ac9c24de35a8294e7189ca110b89443cb77595d2d1e29a747e00b1fd8a86ab7186938ef4bad800e6b330c627d"

RPROVIDES:${PN} += "libqconnman.so \
qt6-networkinformation-connman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
