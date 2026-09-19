SUMMARY = "Development files for the Google C++ Testing Framework"
DESCRIPTION = "Google's framework for writing C++ tests on a variety of platforms \
(Linux, Mac OS X, Windows, Cygwin, Windows CE, and Symbian). \
Based on the xUnit architecture. Supports automatic test discovery, \
a rich set of assertions, user-defined assertions, death tests, \
fatal and non-fatal failures, value- and type-parameterized tests, \
various options for running the tests, and XML test report generation. \
 \
This package provides shared libraries and header files for development \
with googletest."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "gtest-1.17.0-1.5.aarch64.rpm"
RPM_HASH = "cb6f449aa68d1c8a4d4c8f36f74f5eb433aec464aa4cf1f99b44433ad7a20400ba2c67b8bf1cee5e230c56fd54a19e1f8bd17cda0be864c16300d772c10a5f4a"

RPROVIDES:${PN} += "googletest-devel \
gtest \
libgtest-main.so.1.17.0 \
libgtest.so.1.17.0 \
pkgconfig-gtest \
pkgconfig-gtest-main"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
