SUMMARY = "Development files for the distributed SQLite"
DESCRIPTION = "dqlite is a C library implementing an embeddable and replicated \
SQL database engine with high-availability and automatic failover. \
 \
This package contains the files necessary for developing and building \
applications using the library."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "1.18.6"

RPM_NAME = "dqlite-devel-1.18.6-1.3.aarch64.rpm"
RPM_HASH = "c99856bfaf5e4907e4dfb1acaedbf4e66524c142657839e34140e9c7a1c4bc803ae917f54dce6e8e367be1c8644212de3c97e0a8733d780f56f8be2d582f4cac"

RPROVIDES:${PN} += "dqlite-devel \
pkgconfig-dqlite"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdqlite0"

inherit rpm
