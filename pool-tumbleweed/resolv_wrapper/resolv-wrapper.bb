SUMMARY = "A wrapper for DNS name resolving or DNS faking"
DESCRIPTION = "resolv_wrapper makes it possible to contact your own DNS \
implmentation in your test environment. It requires socket_wrapper to be able \
to contact it. If it does not work on a special platform, the wrapper is able to \
fake DNS queries and return valid responses to your application. \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "resolv_wrapper-1.1.8-2.13.aarch64.rpm"
RPM_HASH = "cf6627ca60d05a30ae0dd645da0d5109bf4f7e62c83a1d5d62f3173bc1478c9f908ffb2539ff3e710f6c6b1cc3bcc903a412d3e418ee77c560d82029a6256f7a"

RPROVIDES:${PN} += "cmake-resolv-wrapper \
libresolv-wrapper.so.0 \
pkgconfig-resolv-wrapper \
resolv-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
cmake \
ld-linux-aarch64.so.1 \
libc.so.6 \
pkg-config"

inherit rpm
