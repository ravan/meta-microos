SUMMARY = "Documentation for texlive-bpchem"
DESCRIPTION = "This package includes the documentation for texlive-bpchem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75878"

RPM_NAME = "texlive-bpchem-doc-2026.226.1.1svn75878-59.2.noarch.rpm"
RPM_HASH = "1fbc4d6843ac59c4b11d8c359c07f9468bc0725947a60c9df86a18bea47774807701a3e4f06ce620570603248d3403f468736dee835f5c48bd47fa20177ae7c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpchem-doc"

RDEPENDS:${PN} += ""

inherit rpm
