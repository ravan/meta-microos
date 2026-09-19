SUMMARY = "Documentation for texlive-lecturenotes"
DESCRIPTION = "This package includes the documentation for texlive-lecturenotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn74699"

RPM_NAME = "texlive-lecturenotes-doc-2026.226.3.2svn74699-61.2.noarch.rpm"
RPM_HASH = "668db2d6aeaa5c9d5e7a654343993b3bf628bf02e2362a0116a1f20e97c6567432ea68f3e696dcd568c6c795e188c8e0ee43eeeb31a45c9e067f948713a10395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lecturenotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
