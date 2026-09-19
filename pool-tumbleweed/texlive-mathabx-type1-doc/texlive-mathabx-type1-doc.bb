SUMMARY = "Documentation for texlive-mathabx-type1"
DESCRIPTION = "This package includes the documentation for texlive-mathabx-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21129"

RPM_NAME = "texlive-mathabx-type1-doc-2026.226.svn21129-59.2.noarch.rpm"
RPM_HASH = "336e36eaacba60adf0ac76727220decc9ea54c5e3fb7b54c9290ceb68d83ae078e755bfef7a3c80746069e12d4ea228cee982ddc16fb1ab95a2962964475c5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathabx-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
