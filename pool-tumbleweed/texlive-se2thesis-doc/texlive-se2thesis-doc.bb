SUMMARY = "Documentation for texlive-se2thesis"
DESCRIPTION = "This package includes the documentation for texlive-se2thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.4.0svn76924"

RPM_NAME = "texlive-se2thesis-doc-2026.226.4.4.0svn76924-60.2.noarch.rpm"
RPM_HASH = "b610c06e5401349e9acc0ebdd30d0df50be043a65c6311fe527ce99645a3d613e6e3e7e1c6491060b59d996559fb0477748ecc84f3bba26f0f4eba2da355e3ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-se2thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
