SUMMARY = "Documentation for texlive-kalendarium"
DESCRIPTION = "This package includes the documentation for texlive-kalendarium"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn48744"

RPM_NAME = "texlive-kalendarium-doc-2026.226.1.0svn48744-63.2.noarch.rpm"
RPM_HASH = "eda764c8b7bc122231a95555e021ad70620fbd1a5df9d36b3337204fef77f2c85379bb35406baec85c1e46b30ff58b7ee58b3b0a0397e2ae5fb4208f3c23119a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kalendarium-doc"

RDEPENDS:${PN} += ""

inherit rpm
