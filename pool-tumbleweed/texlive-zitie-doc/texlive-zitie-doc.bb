SUMMARY = "Documentation for texlive-zitie"
DESCRIPTION = "This package includes the documentation for texlive-zitie"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77682"

RPM_NAME = "texlive-zitie-doc-2026.226.1.4.0svn77682-59.4.noarch.rpm"
RPM_HASH = "420adea9e954ae8127c15f7bdbbeee9556bfa08bb72da47960e691cf5d72392d131a38b377e40dfbe1e5cd5e964e4856777dfcb2d52a72ca45f1b3255e9d846f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zitie-doc-zh \
texlive-zitie-doc"

RDEPENDS:${PN} += ""

inherit rpm
