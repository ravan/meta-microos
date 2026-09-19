SUMMARY = "Documentation for texlive-hideproofs"
DESCRIPTION = "This package includes the documentation for texlive-hideproofs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75712"

RPM_NAME = "texlive-hideproofs-doc-2026.226.1.0svn75712-60.4.noarch.rpm"
RPM_HASH = "171636af2bc67e1ed5084a831ed401662c08fcacbf4a7e59e19f8e2db8a0efd804262e7e4fad32cebd9ddd776ae6e5c9fe61c7d0183cbfd0f1c397e31beaff18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hideproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
