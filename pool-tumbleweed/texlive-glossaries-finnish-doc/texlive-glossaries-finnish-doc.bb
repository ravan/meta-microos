SUMMARY = "Documentation for texlive-glossaries-finnish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-finnish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-doc-2026.226.1.0svn54080-60.4.noarch.rpm"
RPM_HASH = "c812ff4817407f5e50ee9a0c21486892c5c56296c126eb97b38aabd149b847a1b7dd1b12459fbe6725f681c038768186110348af3e61cf3d68fce92741a7a867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-finnish-doc"

RDEPENDS:${PN} += ""

inherit rpm
