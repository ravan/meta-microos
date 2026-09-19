SUMMARY = "Header files and libraries for hiredis"
DESCRIPTION = "The hiredis-devel package contains the header files and \
libraries for Redis database."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "hiredis-devel-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "3f6ad3fc2897e814315427165b6a578cf669857fe697229356c4d4f5de0d2ae2e055a852831028cb84387065583bdf123c910fda17f56b263b9c0f160df753b0"

RPROVIDES:${PN} += "hiredis-devel \
pkgconfig-hiredis \
pkgconfig-hiredis-ssl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhiredis1-3-0 \
pkgconfig-hiredis"

inherit rpm
