SUMMARY = "Development files for xsimd"
DESCRIPTION = "SIMD (Single Instruction, Multiple Data) is a feature of microprocessors that \
has been available for many years. SIMD instructions perform a single operation \
on a batch of values at once, and thus provide a way to significantly accelerate \
code execution. However, these instructions differ between microprocessor \
vendors and compilers. \
 \
xsimd provides a unified means for using these features for library authors. \
Namely, it enables manipulation of batches of numbers with the same arithmetic \
operators as for single values. It also provides accelerated implementation of \
common mathematical functions operating on batches. \
 \
This package contains the developments files needed to use xsimd"
LICENSE = "BSD-3-Clause"

PV = "14.3.0"

RPM_NAME = "xsimd-devel-14.3.0-1.1.noarch.rpm"
RPM_HASH = "0bc601ea9c5060d7747767fed2557164046e83be1d2171a5c8ed85b5727eba5043b02368b5f6a45e1d4c26bb753246de741fe6d4077ff7241ef0ad62a61eb45a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-xsimd \
pkgconfig-xsimd \
xsimd-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
