SUMMARY = "Documentation for texlive-frege"
DESCRIPTION = "This package includes the documentation for texlive-frege"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn27417"

RPM_NAME = "texlive-frege-doc-2026.226.1.3svn27417-60.2.noarch.rpm"
RPM_HASH = "db785eafb88369ad282131d6ab74d017b11914fe154df012e411ed8804ebaa06ee5365a5aec5d959b5e66ce40163c78d27c6f42837003a120b22fcc405e16efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frege-doc"

RDEPENDS:${PN} += ""

inherit rpm
