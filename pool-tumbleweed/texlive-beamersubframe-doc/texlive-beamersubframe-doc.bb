SUMMARY = "Documentation for texlive-beamersubframe"
DESCRIPTION = "This package includes the documentation for texlive-beamersubframe"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn23510"

RPM_NAME = "texlive-beamersubframe-doc-2026.226.0.0.2svn23510-61.2.noarch.rpm"
RPM_HASH = "480fc5143c80bcbbe508d2bc391c78d49313d11f0112371503f9fdd39ea890f715c2f6812504a6f14d232a96360150cb438002785020e11310fc1210d6a548b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamersubframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
