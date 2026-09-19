SUMMARY = "Documentation for texlive-nwejm"
DESCRIPTION = "This package includes the documentation for texlive-nwejm"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77980"

RPM_NAME = "texlive-nwejm-doc-2026.226.2.1svn77980-61.2.noarch.rpm"
RPM_HASH = "732bf608d2291ee38793ca1e43a941e14e20130db3a93cd41b31dcb7423e1f90faa1bc510ef1406d743846c700601a0ea1cc43fc833f19c8a6d3af6fd81c9b4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nwejm-doc-fr \
texlive-nwejm-doc"

RDEPENDS:${PN} += ""

inherit rpm
