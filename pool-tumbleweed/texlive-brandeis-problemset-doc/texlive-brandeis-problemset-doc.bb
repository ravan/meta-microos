SUMMARY = "Documentation for texlive-brandeis-problemset"
DESCRIPTION = "This package includes the documentation for texlive-brandeis-problemset"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.5svn50991"

RPM_NAME = "texlive-brandeis-problemset-doc-2026.226.0.0.5.5svn50991-59.2.noarch.rpm"
RPM_HASH = "cee5863a3ec21dedf4326390b181d102dfbbcad6dbb3ec5b025028b289d9dbb023322f8f6e7b3b50912ef52688d6de9710be34730b3e090727915c92270979da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brandeis-problemset-doc"

RDEPENDS:${PN} += ""

inherit rpm
