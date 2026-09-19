SUMMARY = "Documentation for texlive-ppmcheckpdf"
DESCRIPTION = "This package includes the documentation for texlive-ppmcheckpdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025asvn74165"

RPM_NAME = "texlive-ppmcheckpdf-doc-2026.226.2025asvn74165-59.2.noarch.rpm"
RPM_HASH = "84155397dcbda87c92271e9c0d9c2d02d5d6ddbd47788437734c72d749391a95c23b7831be19a8f0dd2dd0a22a14638d55ea1ddbe9433944539789373ef8f805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ppmcheckpdf.1 \
texlive-ppmcheckpdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
