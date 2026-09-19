SUMMARY = "Documentation for texlive-wnri-latex"
DESCRIPTION = "This package includes the documentation for texlive-wnri-latex"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0bsvn22338"

RPM_NAME = "texlive-wnri-latex-doc-2026.226.1.0bsvn22338-60.2.noarch.rpm"
RPM_HASH = "dda12d32b6cdda9f101c224c13bce4c344a6f9a787f5485b6141b53d4235b18a25dcd14bd12b60162cfe50b8ae1b0f97e619a7a968d2ba5e020e2beb7300bca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wnri-latex-doc"

RDEPENDS:${PN} += ""

inherit rpm
