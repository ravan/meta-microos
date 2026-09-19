SUMMARY = "Documentation for texlive-engpron"
DESCRIPTION = "This package includes the documentation for texlive-engpron"
LICENSE = "LPPL-1.0"

PV = "2026.226.2svn16558"

RPM_NAME = "texlive-engpron-doc-2026.226.2svn16558-61.4.noarch.rpm"
RPM_HASH = "e1c167164372d0295014e830063a79fde53238bc06ce65c34ebae7c6e49b25846cdd29b87861f395e51cb994488d1da8881eb105cff3380c77113acdb8dce424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engpron-doc-fr;en \
texlive-engpron-doc"

RDEPENDS:${PN} += ""

inherit rpm
