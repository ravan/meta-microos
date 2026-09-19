SUMMARY = "Documentation for texlive-ibycus-babel"
DESCRIPTION = "This package includes the documentation for texlive-ibycus-babel"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn15878"

RPM_NAME = "texlive-ibycus-babel-doc-2026.226.3.0svn15878-60.2.noarch.rpm"
RPM_HASH = "a277dea65f9bf9d2fdbc11b677a5d16447f2d94693f052c3afc5a382b519d3b958c1e47637d2f6062f5b0cd2b8a8cc06a058d8b4ad258c69217546041fb01088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibycus-babel-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
