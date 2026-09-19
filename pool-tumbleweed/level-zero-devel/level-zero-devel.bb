SUMMARY = "The oneAPI Level Zero Specification Headers and Loader development package"
DESCRIPTION = "The level-zero-devel package contains library and header files for developing \
applications that use level-zero."
LICENSE = "MIT"

PV = "1.33.1"

RPM_NAME = "level-zero-devel-1.33.1-1.1.aarch64.rpm"
RPM_HASH = "9d2d34ad31ca05d23b3fb5c8e79aaab029d23dd8e8c606272985719a39f02766d986897deaf1e1db83542e5959e95feced9f5fd21a5581d772720887bc906543"

RPROVIDES:${PN} += "level-zero-devel \
pkgconfig-level-zero \
pkgconfig-libze-loader"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
level-zero \
pkgconfig-libze-loader"

inherit rpm
