SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC multiple-precision complex library development files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "mpc-devel-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "658dd041cc6aff64a0c81dd55dec7fa3ec231508052ed1bc8b40be8c7e59b10bab41cb804ddadb261274f96a2a6294b8d1e5b92d57d202e7d37c2bf6ac829ef8"

RPROVIDES:${PN} += "mpc-devel \
pkgconfig-mpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpc3 \
pkgconfig-gmp \
pkgconfig-mpfr"

inherit rpm
