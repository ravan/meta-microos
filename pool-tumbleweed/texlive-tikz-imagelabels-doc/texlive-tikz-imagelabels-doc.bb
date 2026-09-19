SUMMARY = "Documentation for texlive-tikz-imagelabels"
DESCRIPTION = "This package includes the documentation for texlive-tikz-imagelabels"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn51490"

RPM_NAME = "texlive-tikz-imagelabels-doc-2026.226.0.0.2svn51490-59.2.noarch.rpm"
RPM_HASH = "e29e2f2ac7c3de95a379ac81f23513fadcda4d435f017ca480417580f18404740da2893e868793f3f8b8252c4f08df58609edc15fe984c99f8259b9d48bb5e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-imagelabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
