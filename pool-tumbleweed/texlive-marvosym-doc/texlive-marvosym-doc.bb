SUMMARY = "Documentation for texlive-marvosym"
DESCRIPTION = "This package includes the documentation for texlive-marvosym"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2asvn77682"

RPM_NAME = "texlive-marvosym-doc-2026.226.2.2asvn77682-59.2.noarch.rpm"
RPM_HASH = "594441dc7baa2b0d234127bd0ed1e2b05cee7ccc1d0f3685b613406fbc1dc53273d0ac64100391c6ce9a3ed7138bfda44dc7870f76cba85d029af5feb58f156b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marvosym-doc"

RDEPENDS:${PN} += ""

inherit rpm
