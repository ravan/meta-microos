SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5NewStuffCore5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "bc9aff71c49d8d8351e9dbc2d2ab5be81f4442fbe338553e95ca0909f2e85b950bea2065abb5da0e20bdaf2320bd4dc0eb7caa4fea3a083467eef965942d13dd"

RPROVIDES:${PN} += "libKF5NewStuffCore.so.5 \
libKF5NewStuffCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Attica.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Package.so.5 \
libKF5Syndication.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
