SUMMARY = "Documentation for texlive-hologo"
DESCRIPTION = "This package includes the documentation for texlive-hologo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.16svn77682"

RPM_NAME = "texlive-hologo-doc-2026.226.1.16svn77682-60.4.noarch.rpm"
RPM_HASH = "89bbfddc598cd3f9c46864c875a2ecc59a52d51b8f21706e145dfa29975067daeb1e0165ee4bdff8d7d714a402bfce096e6069bf20c100fe086613a7149a2d58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hologo-doc"

RDEPENDS:${PN} += ""

inherit rpm
