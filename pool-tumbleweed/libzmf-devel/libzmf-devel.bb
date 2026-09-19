SUMMARY = "Development files for libzmf"
DESCRIPTION = "libzmf is a library for generating Zoner documents. It is directly \
pluggable into import filters based on librevenge. \
 \
This package contains the libzmf development files."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-devel-0.0.2-2.8.aarch64.rpm"
RPM_HASH = "680ab764fb328a5ce20cacf160b5454ea7ddf6b8c3c46793ef384eed09a7b4eefbc79a56fb6cc5f70674e032fb006c80f2c384b1050b16ef23a0d59c7787f082"

RPROVIDES:${PN} += "libzmf-devel \
pkgconfig-libzmf-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzmf-0-0-0 \
pkgconfig-librevenge-0.0"

inherit rpm
