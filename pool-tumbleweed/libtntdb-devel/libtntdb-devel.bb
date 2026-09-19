SUMMARY = "Development files for tntdb"
DESCRIPTION = "Headers and so links for tntdb library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libtntdb-devel-1.4-1.22.aarch64.rpm"
RPM_HASH = "e1bbdb1d0b56c469d0eda7e139f5cf5c238b8fd9a4c02689ca5c813500c0dc0bd4182e19958868d932f4c172c127238088bce7a5c464e5a66eb2d78ac350b3d1"

RPROVIDES:${PN} += "libtntdb-devel \
pkgconfig-tntdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtntdb5 \
pkgconfig-cxxtools"

inherit rpm
