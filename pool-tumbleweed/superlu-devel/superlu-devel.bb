SUMMARY = "Headers and development library for libsuperlu7"
DESCRIPTION = "SuperLU headers and libraries files needed for development"
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "superlu-devel-7.0.1-1.5.aarch64.rpm"
RPM_HASH = "cfa6f28a632bd66c7b8d43f4c2911cd70661bab1f019e6cd2b35474403c8d36b8f664dcaad61709aa998e6e42cbc7bfc4102c1f0f3ca6ea695542274cfea1ca9"

RPROVIDES:${PN} += "cmake-superlu \
pkgconfig-superlu \
superlu-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsuperlu7"

inherit rpm
