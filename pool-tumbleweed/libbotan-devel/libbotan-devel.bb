SUMMARY = "Development files for Botan"
DESCRIPTION = "This package contains the header files and libraries needed to develop \
programs that use the Botan library."
LICENSE = "BSD-2-Clause"

PV = "3.13.0"

RPM_NAME = "libbotan-devel-3.13.0-1.1.aarch64.rpm"
RPM_HASH = "9042049b7d045c616deeb3a9d1839bb8392bb2dc97eec37898ee8fae1c5f943e14efd3c9c6bf434a3208ea4894acee66c98875568113b73e1e56bf8e1aafd133"

RPROVIDES:${PN} += "Botan-devel \
libbotan-devel \
pkgconfig-botan-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbotan-3-13 \
libbz2-devel \
pkgconfig-liblzma \
pkgconfig-sqlite3 \
trousers-devel"

inherit rpm
