SUMMARY = "Documentation for texlive-calxxxx-yyyy"
DESCRIPTION = "This package includes the documentation for texlive-calxxxx-yyyy"
LICENSE = "LPPL-1.0"

PV = "2026.226.20.26asvn77222"

RPM_NAME = "texlive-calxxxx-yyyy-doc-2026.226.20.26asvn77222-59.2.noarch.rpm"
RPM_HASH = "4a77d00ce6bd0f4cae46fcc0a88b6144cd28b43688498405cda6fa6bdfd1939986a23c1eae72d4191d8d7e46ae7539ba7f0e3df58a4be1b18dadfda128daac80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calxxxx-yyyy-doc"

RDEPENDS:${PN} += ""

inherit rpm
