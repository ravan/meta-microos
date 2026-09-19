SUMMARY = "GAP: Database of groups of prime-power order for some prime powers"
DESCRIPTION = "SglPPow is an extension to the GAP Small Groups Library; this package \
gives access to the groups of order p^7 for primes p > 11, and to the \
groups of order 3^8."
LICENSE = "Artistic-2.0"

PV = "2.6"

RPM_NAME = "gap-sglppow-2.6-1.1.noarch.rpm"
RPM_HASH = "9d5a9bf6297bc286c4274885e520ed8a0d6248530bdaec005999fcf6422f1051072973a4d5798c4a58b70020c5f9cf7676514f4c7375369df3d65fce887d7e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-sglppow"

RDEPENDS:${PN} += "gap-core \
gap-smallgrp"

inherit rpm
