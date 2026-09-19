SUMMARY = "RSS/Atom parsing library - development headers"
DESCRIPTION = "KF6Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. This \
package contains development headers."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-syndication-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "db6c93983ed757735312c7d28aecd1eb337d625ecc8ff31083ffff0263552e61c2fd23878a252ebab9e8353ae0818e7309153884b748f7de7eb78857808e41e1"

RPROVIDES:${PN} += "cmake-KF6Syndication \
kf6-syndication-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
libKF6Syndication6"

inherit rpm
