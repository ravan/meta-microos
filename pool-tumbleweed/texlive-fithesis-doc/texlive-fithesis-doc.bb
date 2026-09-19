SUMMARY = "Documentation for texlive-fithesis"
DESCRIPTION = "This package includes the documentation for texlive-fithesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn76028"

RPM_NAME = "texlive-fithesis-doc-2026.226.1.1.2svn76028-59.2.noarch.rpm"
RPM_HASH = "f5278050ed53ae44f5dcc8a60996e0e696daf668daae38f08589d99d537acb13481a023f131445d390b91169e62c9ca974fad1e1e6419ccafcdf1652f69698f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
