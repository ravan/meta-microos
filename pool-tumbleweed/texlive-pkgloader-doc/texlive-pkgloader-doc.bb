SUMMARY = "Documentation for texlive-pkgloader"
DESCRIPTION = "This package includes the documentation for texlive-pkgloader"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn76924"

RPM_NAME = "texlive-pkgloader-doc-2026.226.0.0.7.0svn76924-58.2.noarch.rpm"
RPM_HASH = "0fe72fd25a03f2fbf44c1aa2d2d1a9ad3174b7508e3abf22439bb9b30def6f7893aa2810dd00839489a934173d7d9e5dff3d9ad5d84759f55991e66b3715393c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkgloader-doc"

RDEPENDS:${PN} += ""

inherit rpm
