SUMMARY = "GAP: Small Order Type group construction and identification"
DESCRIPTION = "This package for the GAP computer algebra system is complementary to an MPhil \
thesis 'Groups of small order type' and the joint paper 'Groups whose order \
factorise into at most four primes' (Dietrich, Eick, & Pan, 2020) from \
<https://doi.org/10.1016/j.jsc.2021.04.005>."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "gap-sotgrps-1.4-1.1.aarch64.rpm"
RPM_HASH = "cee7ef76b1480097c56b2b1ef06c69a4528546efca2b52eea6cdaa2c18e9bd889e44fdbc075934e0e32f415cef436d5d0a055ca7e044771848f0d6a46ebf5c1c"

RPROVIDES:${PN} += "gap-sotgrps"

RDEPENDS:${PN} += "gap-core \
gap-smallgrp"

inherit rpm
