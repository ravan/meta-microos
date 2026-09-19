SUMMARY = "Documentation for texlive-fistrum"
DESCRIPTION = "This package includes the documentation for texlive-fistrum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-fistrum-doc-2026.226.0.0.1svn76924-59.2.noarch.rpm"
RPM_HASH = "e8db85bd166979b4a3ef343011217a1761b075f5ce0e3afd10728e34a33147b72fca4e718f4f4619454492277fb9a28b5e0371e23938c1bc86a0756e66353bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fistrum-doc"

RDEPENDS:${PN} += ""

inherit rpm
