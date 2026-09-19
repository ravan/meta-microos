SUMMARY = "Documentation for texlive-thubeamer"
DESCRIPTION = "This package includes the documentation for texlive-thubeamer"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.1.0svn61071"

RPM_NAME = "texlive-thubeamer-doc-2026.227.1.1.0svn61071-62.2.noarch.rpm"
RPM_HASH = "a264fc4d2e12b26a1534c9837bdbe99d974925c45e0db4f48c00f753ec186934a9f82ff327aa58cb6b8c29387495d6f699e9d4922f3241c12d62ddd2c27302a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thubeamer-doc-zh \
texlive-thubeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
