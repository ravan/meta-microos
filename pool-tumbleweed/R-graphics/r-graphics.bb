SUMMARY = "Package providing R-core graphics in R-graphics"
DESCRIPTION = "This package provides R-graphics, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-graphics-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "23f3c5e2eed0f4022fefcf8fc56821e53fc41cbfd06f41aa7f0be1bdfa9bd27b91e7da3409e7475cc10bfaaba9d99d9d1eb6a3a2f7c304fa9e6a97b202dada2f"

RPROVIDES:${PN} += "R-graphics"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
