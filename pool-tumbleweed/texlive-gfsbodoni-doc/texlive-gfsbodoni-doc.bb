SUMMARY = "Documentation for texlive-gfsbodoni"
DESCRIPTION = "This package includes the documentation for texlive-gfsbodoni"
LICENSE = "OFL-1.1"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gfsbodoni-doc-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "6f973c9c47a4f9e6d706ff7728ba7e34281424f0e5d500374430d6d2ac2c6e85e51002818e94823737b09ea712060776e4ee605521b6f8cca95fee85ed0aa4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsbodoni-doc"

RDEPENDS:${PN} += ""

inherit rpm
