SUMMARY = "RSS/Atom parsing library"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. \
This package contains the base library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Syndication5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "8854ea0e2205982e5d00ac8c9ded1a6b78a33f84bbc2ae3bd5dc5e66a920804bdd7592ce8c0a2da1cbfb082b7a16abc397d0d15e991a86c2eb83fdab53d3d74e"

RPROVIDES:${PN} += "libKF5Syndication.so.5 \
libKF5Syndication5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libQt5Core.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
