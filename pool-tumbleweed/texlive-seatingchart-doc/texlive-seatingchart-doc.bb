SUMMARY = "Documentation for texlive-seatingchart"
DESCRIPTION = "This package includes the documentation for texlive-seatingchart"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn76924"

RPM_NAME = "texlive-seatingchart-doc-2026.226.0.0.5.0svn76924-60.2.noarch.rpm"
RPM_HASH = "92de012b95fc2658c85bb415561705ea4bfd7b630f4e5b6ae2b0888ab930e7703f4425643056cb07f1e4a4bb1a6b842d7a8f52fe7130d7464bc7f64aa7a07334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-seatingchart-doc-de \
texlive-seatingchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
