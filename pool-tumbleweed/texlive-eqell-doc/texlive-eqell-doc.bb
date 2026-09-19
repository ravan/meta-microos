SUMMARY = "Documentation for texlive-eqell"
DESCRIPTION = "This package includes the documentation for texlive-eqell"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn22931"

RPM_NAME = "texlive-eqell-doc-2026.226.svn22931-61.4.noarch.rpm"
RPM_HASH = "440a23db7887c09a6bb3f806a28e16cffb86b0afcb74bc04a2d8b8966b54d5da64b4efc95abb2bb44171e83974de506d343b252dcb564b68f0e7a8756454f2e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqell-doc"

RDEPENDS:${PN} += ""

inherit rpm
