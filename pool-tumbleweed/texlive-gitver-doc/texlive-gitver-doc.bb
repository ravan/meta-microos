SUMMARY = "Documentation for texlive-gitver"
DESCRIPTION = "This package includes the documentation for texlive-gitver"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76924"

RPM_NAME = "texlive-gitver-doc-2026.226.1.4svn76924-60.4.noarch.rpm"
RPM_HASH = "4dac0be0b4bdd49f8b0d6159cc41661168b8b4b5188e3a6a7fb271f60b40e21602e895f9bf1fbb87146c09817fda9458390048579e741e2be6aa74e573e74de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitver-doc"

RDEPENDS:${PN} += ""

inherit rpm
