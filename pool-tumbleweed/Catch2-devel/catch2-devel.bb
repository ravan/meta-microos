SUMMARY = "A modern, C++-native, header-only, test framework for unit-tests, TDD and BDD"
DESCRIPTION = "Catch2 stands for C++ Automated Test Cases in a Header and is a multi-paradigm \
test framework for modern C++14 and newer. \
It also provides basic micro-benchmarking features, and simple BDD macros."
LICENSE = "BSL-1.0"

PV = "3.15.0"

RPM_NAME = "Catch2-devel-3.15.0-1.3.aarch64.rpm"
RPM_HASH = "1f9d0f4feb3e0bf1d16bc5248d5a9735f87cf17f42a2a82c2394776c9bab8a8e10b61ef62d4ab729ba6c23f3c2a8a36edb31bf889308f81fa497ada6a2345f80"

RPROVIDES:${PN} += "Catch2-devel \
cmake-Catch2 \
pkgconfig-catch2 \
pkgconfig-catch2-with-main"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
