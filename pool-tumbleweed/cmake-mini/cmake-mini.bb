SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "4.4.3"

RPM_NAME = "cmake-mini-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "41580618f6d8f9fe36ec7b07275f863ad51c4491e367555224b81ba53419200e19caa9cedbaddb49d4a2a63557297e2b2515244dbd19f0a7d91abacd6abbf340"

RPROVIDES:${PN} += "cmake-implementation \
cmake-mini \
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
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libform.so.6 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libncurses.so.6 \
librhash.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libuv.so.1 \
libuv1 \
libz.so.1 \
libzstd.so.1 \
make \
python3-base \
this-is-only-for-build-envs"

inherit rpm
