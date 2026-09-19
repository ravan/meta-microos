SUMMARY = "Documentation for texlive-alfaslabone"
DESCRIPTION = "This package includes the documentation for texlive-alfaslabone"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.0.1svn77682"

RPM_NAME = "texlive-alfaslabone-doc-2026.226.0.0.0.1svn77682-61.2.noarch.rpm"
RPM_HASH = "f2b64e86a6746ba79f65df3f88ae5970782db68f1d3b2d541071bc472b714cd0872a5d6705cacb0c31870bceddb4ee4bdd9a5a5288319e32fec95d84aab89e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alfaslabone-doc"

RDEPENDS:${PN} += ""

inherit rpm
