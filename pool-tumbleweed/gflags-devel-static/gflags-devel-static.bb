SUMMARY = "Development files for the static gflags library"
DESCRIPTION = "This package contains all necessary include files and the static libraries \
needed for developing applications."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "gflags-devel-static-2.2.2-4.10.aarch64.rpm"
RPM_HASH = "6717e166b614f6c3eb7ba2eba4977e3a55f51be50266b49047d49e1426707569c51837d471c2287b61264a235f5e380a1acf85517b59984e19e1e05760b02e50"

RPROVIDES:${PN} += "cmake-gflags \
gflags-devel-static \
pkgconfig-gflags-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
