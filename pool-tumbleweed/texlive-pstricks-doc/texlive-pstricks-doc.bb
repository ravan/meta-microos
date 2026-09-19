SUMMARY = "Documentation for texlive-pstricks"
DESCRIPTION = "This package includes the documentation for texlive-pstricks"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.22asvn78101"

RPM_NAME = "texlive-pstricks-doc-2026.226.3.22asvn78101-60.4.noarch.rpm"
RPM_HASH = "0987545584a7231710c5a34bad6ea4c786939ad0bc5c6bb9d7589849e1a9b540f10ace617f84e8609fd861686fa630c20ed8bdc92d752e9f9ef5a31e33aa7d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
