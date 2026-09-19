SUMMARY = "Package providing R-tcltk"
DESCRIPTION = "This package provides R-tcltk, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-tcltk-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "ed8e2e8a96c9b309e7f5065230d7492cbd01a2947e9b33cd7c680c8843fb1dc100a689a07ddaa95e2185eef2f73dc2515dc82da7ef7469b71f36f78554a6ed96"

RPROVIDES:${PN} += "R-tcltk"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
