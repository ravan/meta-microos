SUMMARY = "Documentation for texlive-dantelogo"
DESCRIPTION = "This package includes the documentation for texlive-dantelogo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-doc-2026.226.0.0.03svn38599-61.2.noarch.rpm"
RPM_HASH = "533a9a07cc20e5bcc905b412883671c36921e5f44d3cc8e39ca512449f3ea68455f348ec753df9679a8116470f94be28e732e201496975019028aadea87429d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dantelogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
