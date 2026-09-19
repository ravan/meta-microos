SUMMARY = "Documentation for texlive-umlaute"
DESCRIPTION = "This package includes the documentation for texlive-umlaute"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-umlaute-doc-2026.226.2.1svn15878-60.2.noarch.rpm"
RPM_HASH = "1378f9d58b14b8f7a049875790d8122340fdb0e41bf7a22e0b68f40d424df096579af8c3118d7625cf44ae41895875cbf37e4b8c6429a9492bca4dc45541c827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umlaute-doc"

RDEPENDS:${PN} += ""

inherit rpm
