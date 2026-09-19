SUMMARY = "Documentation for texlive-beton"
DESCRIPTION = "This package includes the documentation for texlive-beton"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-beton-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "bb4576c81f0eb06ef9579e24e1b273ab55ef2b57193a32999e5b8249f7e6307698afac1ddb297cd91799c1325fc434b9d3e71244907244e7cd0035511161fca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beton-doc"

RDEPENDS:${PN} += ""

inherit rpm
