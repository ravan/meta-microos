SUMMARY = "A modern, C++-native, header-only, test framework for unit-tests, TDD and BDD"
DESCRIPTION = "Catch2 stands for C++ Automated Test Cases in a Header and is a multi-paradigm \
test framework for C++. which also supports Objective-C (and maybe C). \
It is primarily distributed as a single header file, although certain \
extensions may require additional headers. \
 \
This package provides version 2.x of Catch2."
LICENSE = "BSL-1.0"

PV = "2.13.10"

RPM_NAME = "Catch2-2-devel-2.13.10-2.5.aarch64.rpm"
RPM_HASH = "b2ce1eb9b1b32d7dbb3307ef5128158996f57dc6a5c26029583a77036a9ef188e7f55addbaaae421bc22051c8dd8190d1adf626e2bda7d793bfb991f8b95bb47"

RPROVIDES:${PN} += "Catch2-2-devel \
Catch2-devel \
cmake-Catch2 \
pkgconfig-catch2"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
