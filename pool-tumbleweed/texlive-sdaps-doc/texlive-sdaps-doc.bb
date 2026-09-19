SUMMARY = "Documentation for texlive-sdaps"
DESCRIPTION = "This package includes the documentation for texlive-sdaps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.10svn76924"

RPM_NAME = "texlive-sdaps-doc-2026.226.1.9.10svn76924-60.2.noarch.rpm"
RPM_HASH = "2efd0321deb957bed5391fdc3cc1f70529d86a183201c70fc10047ac7850c7044a9e57f4f2bc714f597c04a736f049eb60e2cc27020e1846a778860e23dbf2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sdaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
