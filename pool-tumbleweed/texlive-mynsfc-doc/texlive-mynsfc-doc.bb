SUMMARY = "Documentation for texlive-mynsfc"
DESCRIPTION = "This package includes the documentation for texlive-mynsfc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77520"

RPM_NAME = "texlive-mynsfc-doc-2026.226.2.00svn77520-61.2.noarch.rpm"
RPM_HASH = "42f94350559f758ebd131f596e32980f47d3445aa0482b78d5729b8b836baed8c4e902658bba705120ae8e871cb6ce6ec03a50749c89dd71a0708db229ab2aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mynsfc-doc-zh \
texlive-mynsfc-doc"

RDEPENDS:${PN} += ""

inherit rpm
