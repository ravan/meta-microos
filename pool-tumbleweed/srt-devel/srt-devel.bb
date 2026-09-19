SUMMARY = "Development files for the Secure Reliable Transport (SRT) library"
DESCRIPTION = "This package contains all necessary include files and libraries \
needed to develop applications with Secure Reliable Transport \
(SRT) support."
LICENSE = "MPL-2.0"

PV = "1.5.7"

RPM_NAME = "srt-devel-1.5.7-1.1.aarch64.rpm"
RPM_HASH = "d42c6e58cf0f6bb3b29a708c400883c9f7c070da8d4c340ad1bdb438f97a0910ffa7fda96f20a737dfa5514c921d887967a3aa2f687d6ca572861b7b4dc99d40"

RPROVIDES:${PN} += "pkgconfig-haisrt \
pkgconfig-srt \
srt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrt1-5 \
pkgconfig-libcrypto \
pkgconfig-openssl \
srt"

inherit rpm
