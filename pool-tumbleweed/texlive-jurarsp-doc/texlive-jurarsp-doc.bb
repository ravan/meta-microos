SUMMARY = "Documentation for texlive-jurarsp"
DESCRIPTION = "This package includes the documentation for texlive-jurarsp"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.52svn15878"

RPM_NAME = "texlive-jurarsp-doc-2026.226.0.0.52svn15878-63.2.noarch.rpm"
RPM_HASH = "c5fd77ebe235b33a1354089e57ffecdcaef19a38dadf228c577e965de6b25fcf30b2993b4d6340a12c79c5f35938a210d8ead0744c2fd3c88dc99d6c54c3b07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jurarsp-doc-de \
texlive-jurarsp-doc"

RDEPENDS:${PN} += ""

inherit rpm
