SUMMARY = "Documentation for texlive-orientation"
DESCRIPTION = "This package includes the documentation for texlive-orientation"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn57390"

RPM_NAME = "texlive-orientation-doc-2026.226.1.0svn57390-61.2.noarch.rpm"
RPM_HASH = "355b4ab1ee0e43e092c5d6d1120c4d511f27cc89ed85b15ea8716dab03b1a33c7001412344170e7488e192cb08678258cd436897abc5140247467b92b392bf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orientation-doc"

RDEPENDS:${PN} += ""

inherit rpm
