SUMMARY = "Development files for the Kafka C/C++ library"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support. \
 \
This package contains development headers and examples."
LICENSE = "BSD-2-Clause"

PV = "2.15.0"

RPM_NAME = "librdkafka-devel-2.15.0-1.1.aarch64.rpm"
RPM_HASH = "9bc26df46c69a268c3230f341c691d69ecf9d0e164cd68a04c7f0e7baf8c7ae04d63ecd391e9ebc457e0aea9b92ad3d3c00645f1ec1da965eba87e2a8db89525"

RPROVIDES:${PN} += "librdkafka-devel \
pkgconfig-rdkafka \
pkgconfig-rdkafka++ \
pkgconfig-rdkafka++-static \
pkgconfig-rdkafka-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librdkafka1 \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-liblz4 \
pkgconfig-libsasl2 \
pkgconfig-libssl \
pkgconfig-libzstd \
pkgconfig-rdkafka \
pkgconfig-rdkafka-static \
pkgconfig-zlib"

inherit rpm
