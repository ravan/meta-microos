SUMMARY = "Documentation for texlive-pmdraw"
DESCRIPTION = "This package includes the documentation for texlive-pmdraw"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77509"

RPM_NAME = "texlive-pmdraw-doc-2026.226.2.2svn77509-59.2.noarch.rpm"
RPM_HASH = "9f31fb30c1bd9d4e144f9a9dd8f4654a344555b20b7c4910753b40495308c53e73711e399fcef45768fdd463fd8cdb42cd85f5bf931ca0fb832dd62c5829fd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pmdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
