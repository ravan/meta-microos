SUMMARY = "GALPOL polynomial database for the PARI CAS"
DESCRIPTION = "PARI package of the GALPOL database of polynomials defining Galois \
extensions of the rationals, accessed by the 'galoisgetpol' function."
LICENSE = "GPL-2.0-or-later"

PV = "20180625"

RPM_NAME = "pari-galpol-20180625-3.11.noarch.rpm"
RPM_HASH = "804343810abd028f28b900ea0eb74c25281c2197f45b96d045731cd6d776c83ade71ba408dc944e8e9938a9a95d26956b8b3c6834a8ce8d40c4ec612df507e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-galpol"

RDEPENDS:${PN} += ""

inherit rpm
