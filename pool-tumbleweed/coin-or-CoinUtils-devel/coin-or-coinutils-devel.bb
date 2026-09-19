SUMMARY = "Development headers for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects. \
 \
This package contains the development headers for coin-or-CoinUtils."
LICENSE = "EPL-2.0"

PV = "2.11.12"

RPM_NAME = "coin-or-CoinUtils-devel-2.11.12-1.7.aarch64.rpm"
RPM_HASH = "efd00ba85fdc3d212759b47d860e6bbb4c0ce418ce11fee15ed61e0ab8958a7d4bcbc1996644ec766df8c60bfb2be61c3a7accb55bcc39943b47c9b9e2387168"

RPROVIDES:${PN} += "coin-or-CoinUtils-devel \
pkgconfig-coinutils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libCoinUtils3 \
pkgconfig-zlib"

inherit rpm
