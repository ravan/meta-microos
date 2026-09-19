SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF6Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. \
This package contains the base library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Syndication6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "4dd1dd5758d49833ebd14c66004e574b5c1abe92681205b208e6cfb9b3935cd1bcb5012adfdd13f9a4d6dc1dd9ffaaabf82cde738403d6d86d74c35fb4d4cc0e"

RPROVIDES:${PN} += "libKF6Syndication.so.6 \
libKF6Syndication6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-syndication \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libQt6Core.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
