SUMMARY = "Documentation for texlive-attachfile"
DESCRIPTION = "This package includes the documentation for texlive-attachfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn77682"

RPM_NAME = "texlive-attachfile-doc-2026.226.1.9svn77682-60.2.noarch.rpm"
RPM_HASH = "3a46864f8a43d17258572da61c436ec826cf9e7b66f4dbc793ce6d094b35d30e9d19593ba33069f0452dc73ed8f1a8ae4246a3d904ddda080c9fbbfcf955cd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-attachfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
