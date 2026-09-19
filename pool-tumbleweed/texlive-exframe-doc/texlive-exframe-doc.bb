SUMMARY = "Documentation for texlive-exframe"
DESCRIPTION = "This package includes the documentation for texlive-exframe"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5.2svn77449"

RPM_NAME = "texlive-exframe-doc-2026.226.3.5.2svn77449-59.2.noarch.rpm"
RPM_HASH = "da38327d70b53e2d7b25e9794423de0ebb5067c111617def0c46451e4c565ec70bd7dffe558b3135ced13872efee4a52a98c01571f87858ad1780b855b0829d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
