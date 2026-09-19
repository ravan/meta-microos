SUMMARY = "Documentation for texlive-francais-bst"
DESCRIPTION = "This package includes the documentation for texlive-francais-bst"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0asvn76790"

RPM_NAME = "texlive-francais-bst-doc-2026.226.2.0asvn76790-60.2.noarch.rpm"
RPM_HASH = "05391580ecd04f8ae3311ff959e09c7078f915c28e98d0335472ca98479348cb9c2d8fed5bbb91f6d3b444a97bfa7cc372fc8b13bc480151a9cdc8093598c173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fr;fr-ca) \
locale(texlive-francais-bst-doc-en \
texlive-francais-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
