SUMMARY = "Documentation for texlive-gchords"
DESCRIPTION = "This package includes the documentation for texlive-gchords"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.20svn29803"

RPM_NAME = "texlive-gchords-doc-2026.226.1.20svn29803-60.2.noarch.rpm"
RPM_HASH = "bf97734aa0474ae976fdde01e2ce2d240e8a171f3b3b1c7a04fb8db6d351581ccc8e377b96f6ade3dcbc14326f83c87fc67674c8312fc82bdf1cd79c278900e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gchords-doc"

RDEPENDS:${PN} += ""

inherit rpm
