SUMMARY = "Documentation for texlive-schola-otf"
DESCRIPTION = "This package includes the documentation for texlive-schola-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn77682"

RPM_NAME = "texlive-schola-otf-doc-2026.226.0.0.01svn77682-60.2.noarch.rpm"
RPM_HASH = "d8cd4caac2dcf0fe00aa68c648b35485803244579f08de562d20d7104cddc5e900ac1e69619ee485b5601fd87e83daa5b8a5984f2ffb0fe8639bb72cc8c07b3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schola-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
