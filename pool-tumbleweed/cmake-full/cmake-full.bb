SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "4.4.3"

RPM_NAME = "cmake-full-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "9e75ea7463e80c3fe786a6a3a5801d47d0d72c1bae2c79bfa1eb3aa315cf58421ece0cff8224117fac4b9f9dd49193581802323332963e8d81f140ce744c8413"

RPROVIDES:${PN} += "cmake-full \
cmake-implementation \
rpm-macro-buildsystem-cmake-build \
rpm-macro-buildsystem-cmake-check \
rpm-macro-buildsystem-cmake-conf \
rpm-macro-buildsystem-cmake-install \
rpm-macro-cmake \
rpm-macro-cmake-build \
rpm-macro-cmake-install \
rpm-macro-ctest \
rpm-macro-make-jobs"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libform.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
libncurses.so.6 \
librhash.so.1 \
libstdc++.so.6 \
libtinfo.so.6 \
libuv.so.1 \
libuv1 \
libz.so.1 \
make \
python3-base"

inherit rpm
