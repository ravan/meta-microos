SUMMARY = "Documentation for texlive-listparskip"
DESCRIPTION = "This package includes the documentation for texlive-listparskip"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn73155"

RPM_NAME = "texlive-listparskip-doc-2026.226.1.0svn73155-61.2.noarch.rpm"
RPM_HASH = "154b641e930d0e32967164059c130c2f159e91511eff712b4c403124b397b610b89df2afa05129f2e0787897796153c6cbe37234cca752f4221dc9410942f7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listparskip-doc"

RDEPENDS:${PN} += ""

inherit rpm
