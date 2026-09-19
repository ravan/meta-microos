SUMMARY = "Documentation for texlive-accessibility"
DESCRIPTION = "This package includes the documentation for texlive-accessibility"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.3svn55777"

RPM_NAME = "texlive-accessibility-doc-2026.226.2.0.3svn55777-61.2.noarch.rpm"
RPM_HASH = "450366c9966c153d34aee0a0d5c17e5b5cedde8a486a6ce049e54c9718839a7094cc81ddfdbc8c8b54ce4d7a22fcdaef18f5d6aa090e37ffad1d8a9b99b54bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-accessibility-doc-de;en \
texlive-accessibility-doc"

RDEPENDS:${PN} += ""

inherit rpm
