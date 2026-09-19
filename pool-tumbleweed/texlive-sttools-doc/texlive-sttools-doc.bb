SUMMARY = "Documentation for texlive-sttools"
DESCRIPTION = "This package includes the documentation for texlive-sttools"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5svn77682"

RPM_NAME = "texlive-sttools-doc-2026.226.3.5svn77682-64.2.noarch.rpm"
RPM_HASH = "4d01bf0b58e9bcacf2c16ba902afcb273e6de77fa37f4c819b878a268207263d067e1444423f94ab8c81741a6d9f7b9703b93978d54d01610dec35ce474a0ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sttools-doc"

RDEPENDS:${PN} += ""

inherit rpm
