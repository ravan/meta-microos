SUMMARY = "Binary files of uplatex"
DESCRIPTION = "Binary files of uplatex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn52800"

RPM_NAME = "texlive-uplatex-bin-2026.20260301.svn52800-120.4.aarch64.rpm"
RPM_HASH = "8a2ff9983d1c6f95e325477f50a571fe895aafab06620cc5dedb4061d5a68a94ee6d18edceaa8116206293fd7d817126870abb03540a51cf85eb09694a488330"

RPROVIDES:${PN} += "texlive-uplatex-bin"

RDEPENDS:${PN} += "texlive-uplatex"

inherit rpm
