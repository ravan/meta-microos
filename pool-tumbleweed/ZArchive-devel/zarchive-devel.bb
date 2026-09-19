SUMMARY = "Devel package for ZArchive"
DESCRIPTION = "This subpackage contains the devel files for ZArchive"
LICENSE = "MIT-0"

PV = "0.1.2+git20240721.b467f7a"

RPM_NAME = "ZArchive-devel-0.1.2+git20240721.b467f7a-1.8.aarch64.rpm"
RPM_HASH = "d80ddbbd3ec11683ce0e61025facf11d58ac2f6cb4c4c8c8407cab7df06bb1bb483890cac1e0deccd5dd7535118d347f502fb95fa8ce7e093af1aa8f68a991ac"

RPROVIDES:${PN} += "ZArchive-devel \
pkgconfig-zarchive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzarchive0-1 \
pkgconfig-libzstd"

inherit rpm
