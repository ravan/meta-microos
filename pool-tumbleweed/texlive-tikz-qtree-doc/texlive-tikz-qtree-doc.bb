SUMMARY = "Documentation for texlive-tikz-qtree"
DESCRIPTION = "This package includes the documentation for texlive-tikz-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn26108"

RPM_NAME = "texlive-tikz-qtree-doc-2026.226.1.2svn26108-59.2.noarch.rpm"
RPM_HASH = "3dfd9ada1cd4a410757cc0e47dccd7fb1d8580aad9a666ae1e45291646d60502f32844bfbbc39bb8dc9c1c57bc88f186cec8fb0c468e697c6755748c2d469f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
