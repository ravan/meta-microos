SUMMARY = "Documentation for texlive-fvextra"
DESCRIPTION = "This package includes the documentation for texlive-fvextra"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.14.0svn78167"

RPM_NAME = "texlive-fvextra-doc-2026.226.1.14.0svn78167-60.2.noarch.rpm"
RPM_HASH = "dc27d80df0b3dce360ab0c5248f2b366387fbe78d2e882052ff89596a44ff54f2f0855bfc3644c56d90bd50451a38656f7e8ade93486a48edfe3eb03f4b236e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fvextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
