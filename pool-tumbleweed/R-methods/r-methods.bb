SUMMARY = "Package providing R-methods"
DESCRIPTION = "This package provides R-methods, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-methods-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "773ee19bcbe35df2eb4afd66ec3e1e7d79d15d53b77e109ae9e36158a30a901822365298d2744298a92240493508cbb9a1c2a7844a92a7e01f1e2d5bc5e80fc9"

RPROVIDES:${PN} += "R-methods"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
