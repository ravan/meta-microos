SUMMARY = "RSS/Atom parsing library - development headers"
DESCRIPTION = "KF5Syndication is an RSS/Atom parsing library, which \
also provides an API to fetch feeds from the network. This \
package contains development headers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "syndication-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "09aecaa51ea3c058c13e74b177f6d98c1869992d450e6e7ca5aff50569b6540059f4b347e2135efc1eab1e074aa1ede310e40d20433e799254996d86ce1cff80"

RPROVIDES:${PN} += "cmake-KF5Syndication \
syndication-devel"

RDEPENDS:${PN} += "libKF5Syndication5"

inherit rpm
