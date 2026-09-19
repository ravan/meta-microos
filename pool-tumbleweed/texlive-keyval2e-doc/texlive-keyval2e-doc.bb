SUMMARY = "Documentation for texlive-keyval2e"
DESCRIPTION = "This package includes the documentation for texlive-keyval2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.2svn23698"

RPM_NAME = "texlive-keyval2e-doc-2026.226.0.0.0.2svn23698-63.2.noarch.rpm"
RPM_HASH = "a2650f4a43f1ac2923b809e66366795b9bab85b95143a97a613018a4514ccc1ee1c125a968db15d6a1fa56e8cbdb355b1209e551d0fb61e2bac0d780de967639"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyval2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
