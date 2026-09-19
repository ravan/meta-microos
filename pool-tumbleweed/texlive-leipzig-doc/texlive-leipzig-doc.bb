SUMMARY = "Documentation for texlive-leipzig"
DESCRIPTION = "This package includes the documentation for texlive-leipzig"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn52450"

RPM_NAME = "texlive-leipzig-doc-2026.226.2.3svn52450-61.2.noarch.rpm"
RPM_HASH = "7bca4bb2bd2b826a98d041b2dd53187305b3880e281bd20325497149a0a75c10186581d2b8140f5ddbf5df5068053f66d2d3433b6969eba04d49f47a24f956de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leipzig-doc"

RDEPENDS:${PN} += ""

inherit rpm
