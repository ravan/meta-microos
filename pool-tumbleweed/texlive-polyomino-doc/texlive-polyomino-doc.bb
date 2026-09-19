SUMMARY = "Documentation for texlive-polyomino"
DESCRIPTION = "This package includes the documentation for texlive-polyomino"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-polyomino-doc-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "e527757f968b3d51e6809db5a631ba82eb94ad63b280ffe1c768c5ca14a16071bbadf7b629e82d6e3589a88caee3072f66734280089a364639cccd2c0de7f618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polyomino-doc"

RDEPENDS:${PN} += ""

inherit rpm
