SUMMARY = "Documentation for texlive-ltxcmds"
DESCRIPTION = "This package includes the documentation for texlive-ltxcmds"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.26svn77682"

RPM_NAME = "texlive-ltxcmds-doc-2026.226.1.26svn77682-59.2.noarch.rpm"
RPM_HASH = "4b7e6f35d8ca2f0748971a89f44205ddc92b8638248f80bd3abf2dcbc8c363bc18c29789ea8b15a2ed0a11b854f9928b7f96e735f47207a332632bbe99eef389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
