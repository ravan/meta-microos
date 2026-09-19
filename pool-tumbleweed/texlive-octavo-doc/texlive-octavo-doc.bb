SUMMARY = "Documentation for texlive-octavo"
DESCRIPTION = "This package includes the documentation for texlive-octavo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-octavo-doc-2026.226.1.2svn15878-61.2.noarch.rpm"
RPM_HASH = "59cb39d3e3ebbb120680e6fcfb4af58152dbfec9b42c19b712561353f11aa661ddb538b6f02ad86fee1cd86f5eb1cf18b98958b254b53a86d42e874835ef382b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-octavo-doc"

RDEPENDS:${PN} += ""

inherit rpm
