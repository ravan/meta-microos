SUMMARY = "Documentation for texlive-biblatex-claves"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-claves"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn76924"

RPM_NAME = "texlive-biblatex-claves-doc-2026.226.1.2.1svn76924-61.2.noarch.rpm"
RPM_HASH = "41c858c65442db9ea6ace91ce45b2a902ea24b3ba561d9730dbabdfd476e5fc66125c4134c1b522502273d43161abe405195b71a726a092f09afcb58a188938d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-claves-doc"

RDEPENDS:${PN} += ""

inherit rpm
