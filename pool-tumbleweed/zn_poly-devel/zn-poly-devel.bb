SUMMARY = "Development files for the zn_poly library"
DESCRIPTION = "zn_poly is a C library for polynomial arithmetic in Z/nZ[x], where n \
is any modulus that fits into an unsigned long."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "zn_poly-devel-0.9.2-2.21.aarch64.rpm"
RPM_HASH = "34b16bd0382943365800f77447adc6c1c9da8ce539fe292fb6e52870c3c17361bc3cf61f57d611b1684b2e45e9700dfcc0ccac5096037e866486c8648eb9f1b9"

RPROVIDES:${PN} += "zn-poly-devel"

RDEPENDS:${PN} += "libzn-poly-0-9"

inherit rpm
