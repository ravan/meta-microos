SUMMARY = "Documentation for texlive-foliono"
DESCRIPTION = "This package includes the documentation for texlive-foliono"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.000svn58877"

RPM_NAME = "texlive-foliono-doc-2026.226.1.000svn58877-60.2.noarch.rpm"
RPM_HASH = "8fe6d24d4b44faf1d168fd3954781464a63cc189b43dd4b1d0e36f910405268e54168433d9a55a9ea7d57105c4e030d4370296117c28ea2e5ad426f2ec6c8d0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foliono-doc"

RDEPENDS:${PN} += ""

inherit rpm
