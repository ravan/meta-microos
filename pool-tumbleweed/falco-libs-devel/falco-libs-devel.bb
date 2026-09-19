SUMMARY = "Development files for the falcosecurity libs"
DESCRIPTION = "Headers, shared-library symlinks, pkg-config and CMake files for \
building against the falcosecurity libs (libscap and libsinsp)."
LICENSE = "Apache-2.0"

PV = "0.25.4"

RPM_NAME = "falco-libs-devel-0.25.4-2.3.aarch64.rpm"
RPM_HASH = "4637b835377a5935d101972b88427ffdbd4e167b7e4aa702b7aac89a10fca827f1ddbdd378322e2050cbfc00341b82f50d70745fe247b26886cf4b468f5353a9"

RPROVIDES:${PN} += "falco-libs-devel \
pkgconfig-libpman \
pkgconfig-libscap \
pkgconfig-libsinsp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libscap0 \
libsinsp0 \
pkgconfig-jsoncpp \
pkgconfig-libbpf \
pkgconfig-libpman \
pkgconfig-libscap \
pkgconfig-re2 \
pkgconfig-tbb \
pkgconfig-zlib"

inherit rpm
