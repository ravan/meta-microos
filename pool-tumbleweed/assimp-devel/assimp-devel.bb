SUMMARY = "Headers, docs and command-line utility for assimp"
DESCRIPTION = "Assimp is a library to load and process geometric scenes from various data formats. \
It is tailored at typical game scenarios by supporting a node hierarchy, static or skinned meshes, \
materials, bone animations and potential texture data. The library is not designed for speed, \
it is primarily useful for importing assets from various sources once and storing it in a \
engine-specific format for easy and fast every-day-loading."
LICENSE = "BSD-3-Clause & MIT"

PV = "6.0.5"

RPM_NAME = "assimp-devel-6.0.5-4.3.aarch64.rpm"
RPM_HASH = "ad115aad3bb408acac780f27ab23f5e0b7d5b903e8972925aa34dc856590b71f86e0169781f3a670f813899fecc5cedc6c6838038f7c5fe7bfcae92cd179857f"

RPROVIDES:${PN} += "assimp-devel \
cmake-assimp \
pkgconfig-assimp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1 \
libassimp.so.6 \
libassimp6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++-devel \
libstdc++.so.6 \
pkgconfig-minizip"

inherit rpm
