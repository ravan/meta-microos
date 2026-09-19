SUMMARY = "Galois Groups 8-11 for the PARI CAS"
DESCRIPTION = "This package is needed by the 'polgalois' function in the PARI CAS to \
compute Galois group in degrees 8 through 11."
LICENSE = "GPL-2.0-or-later"

PV = "20080411"

RPM_NAME = "pari-galdata-20080411-10.11.noarch.rpm"
RPM_HASH = "80260bedfe0a6cd2c9a2f802368df70e982f61df39bcaf7f42d6f6c82c16cd4996da2b5f0c531b11f51e961d8ce050454abbd62eda3bcd2b00a8bd0dd67cd258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-galdata"

RDEPENDS:${PN} += ""

inherit rpm
