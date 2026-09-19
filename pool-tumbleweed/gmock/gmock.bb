SUMMARY = "Development files for the Google C++ Mocking Framework"
DESCRIPTION = "Inspired by jMock, EasyMock, and Hamcrest, and designed with C++'s specifics in \
mind, Google C++ Mocking Framework (or Google Mock for short) is a library for \
writing and using C++ mock classes. \
 \
This package provides shared libraries and header files for development \
with googlemock."
LICENSE = "BSD-3-Clause"

PV = "1.17.0"

RPM_NAME = "gmock-1.17.0-1.5.aarch64.rpm"
RPM_HASH = "6be78ddf7bc0bc69aba68e87491ac837cdb4aceb7b5a87228b8d0d5985672e85f4338ede29f299c246b31aa6765d95023e2e25ccd718ad622c1c48a78eb03e45"

RPROVIDES:${PN} += "cmake-GTest \
gmock \
googlemock-devel \
libgmock-main.so.1.17.0 \
libgmock.so.1.17.0 \
pkgconfig-gmock \
pkgconfig-gmock-main"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgtest.so.1.17.0 \
libstdc++.so.6 \
pkgconfig-gtest"

inherit rpm
