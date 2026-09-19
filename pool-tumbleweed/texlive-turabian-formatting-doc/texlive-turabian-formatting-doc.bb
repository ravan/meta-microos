SUMMARY = "Documentation for texlive-turabian-formatting"
DESCRIPTION = "This package includes the documentation for texlive-turabian-formatting"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn58561"

RPM_NAME = "texlive-turabian-formatting-doc-2026.226.svn58561-59.2.noarch.rpm"
RPM_HASH = "887404406a384ad8a9eb771169e11628467046fd24066cda3aed90d614b8a21f92ee5880741757d09266f049eb24e433e20bc0035b419ef611bea80ab2c9b36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turabian-formatting-doc"

RDEPENDS:${PN} += ""

inherit rpm
