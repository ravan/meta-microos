SUMMARY = "Documentation for texlive-babel-kurmanji"
DESCRIPTION = "This package includes the documentation for texlive-babel-kurmanji"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn30279"

RPM_NAME = "texlive-babel-kurmanji-doc-2026.226.1.1svn30279-60.2.noarch.rpm"
RPM_HASH = "7871ccb4fab4d2ff5d861af28af0e46b7d6efcd968ee42f6df966f269f896730e5c930633f79ff9d61c15c6bffd1b4e1285170b8cf1590f2ac1bbfe0f4f14b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-kurmanji-doc"

RDEPENDS:${PN} += ""

inherit rpm
