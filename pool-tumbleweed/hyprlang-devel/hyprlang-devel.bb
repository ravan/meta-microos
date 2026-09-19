SUMMARY = "Development files for Hyprlang"
DESCRIPTION = "The hypr configuration language is a configuration language for Linux \
applications. \
 \
This subpackeg contains headers for hyprlang."
LICENSE = "LGPL-3.0-only"

PV = "0.6.7"

RPM_NAME = "hyprlang-devel-0.6.7-1.6.aarch64.rpm"
RPM_HASH = "a0040b3ff9faf3b2e27f03095218ff994c457ca2a03ad15a01af1355d1a4ec9551f46ef7e742d5e70bd7b47c6b7380e9e3845a7a2c56306241dba53ef29ddcc8"

RPROVIDES:${PN} += "hyprlang-devel \
pkgconfig-hyprlang"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhyprlang2"

inherit rpm
