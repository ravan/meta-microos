SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich). \
 \
This package provides libraries and header files for developing applications \
that use libphonenumber."
LICENSE = "Apache-2.0"

PV = "9.0.38"

RPM_NAME = "libphonenumber-devel-9.0.38-1.2.aarch64.rpm"
RPM_HASH = "b6a17b7a39896081cd348d5fa6ae3d1f72f3030e93006d036f02be6f558d6afb0e29353b8fac8c4b2f74005af9574ec3a62b1ecba8a8b83bc1fa7dbb45af2e22"

RPROVIDES:${PN} += "cmake-libphonenumber \
libphonenumber-devel"

RDEPENDS:${PN} += "cmake-absl \
libboost-date-time-devel \
libboost-thread-devel \
libphonenumber9 \
pkgconfig-protobuf"

inherit rpm
