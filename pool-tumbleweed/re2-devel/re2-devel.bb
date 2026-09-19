SUMMARY = "C++ header files and library symbolic links for re2"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for re2. If you would like to develop programs using re2, \
you will need to install re2-devel."
LICENSE = "BSD-3-Clause"

PV = "20251105"

RPM_NAME = "re2-devel-20251105-69.7.aarch64.rpm"
RPM_HASH = "082cbb192423611d4f20b21be05ba73d6a97a799cf97044c36c9ecb4473cde91f71a4cf7feb9b51ec29a7cd1f3d9bc2f0b845efde091d1755c70a526748a1c52"

RPROVIDES:${PN} += "cmake-re2 \
pkgconfig-re2 \
re2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre2-11 \
pkgconfig-absl-absl-check \
pkgconfig-absl-absl-log \
pkgconfig-absl-base \
pkgconfig-absl-core-headers \
pkgconfig-absl-fixed-array \
pkgconfig-absl-flags \
pkgconfig-absl-flat-hash-map \
pkgconfig-absl-flat-hash-set \
pkgconfig-absl-hash \
pkgconfig-absl-inlined-vector \
pkgconfig-absl-optional \
pkgconfig-absl-span \
pkgconfig-absl-str-format \
pkgconfig-absl-strings \
pkgconfig-absl-synchronization \
pkgconfig-icu-uc"

inherit rpm
