SUMMARY = "Documentation for texlive-nucleardata"
DESCRIPTION = "This package includes the documentation for texlive-nucleardata"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47307"

RPM_NAME = "texlive-nucleardata-doc-2026.226.1.1svn47307-61.2.noarch.rpm"
RPM_HASH = "6139cedf02e735964326cb770cb14e7c04f36903bc3b7b22526e80f3121150c377907479fba725c91dea552c068bdb50f35fce215aa639a94bdf1aa3be38c2d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nucleardata-doc"

RDEPENDS:${PN} += ""

inherit rpm
