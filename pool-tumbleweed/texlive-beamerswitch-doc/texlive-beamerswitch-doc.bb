SUMMARY = "Documentation for texlive-beamerswitch"
DESCRIPTION = "This package includes the documentation for texlive-beamerswitch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn64182"

RPM_NAME = "texlive-beamerswitch-doc-2026.226.1.9svn64182-61.2.noarch.rpm"
RPM_HASH = "1c725f42bfe58e2d09fc5d5cd0c8598cf90c0285e763f23911269082a74451692badcd68040fdbd3df8e47ca43aaec57a1372b73403d399f50afc6aae3e67574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerswitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
