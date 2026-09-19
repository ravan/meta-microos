SUMMARY = "Documentation for texlive-skmath"
DESCRIPTION = "This package includes the documentation for texlive-skmath"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5asvn52411"

RPM_NAME = "texlive-skmath-doc-2026.226.0.0.5asvn52411-64.2.noarch.rpm"
RPM_HASH = "91a22fff1a6ca637879e4f93abc48234e1926544858901cfbdfb00b20987fa492b39dc5938c54d913a21d8a1d20fc9be31a643f94fcf74144b9ad418cb9c557c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
