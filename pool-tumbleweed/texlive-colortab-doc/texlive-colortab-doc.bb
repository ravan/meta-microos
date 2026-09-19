SUMMARY = "Documentation for texlive-colortab"
DESCRIPTION = "This package includes the documentation for texlive-colortab"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn22155"

RPM_NAME = "texlive-colortab-doc-2026.226.1.0svn22155-60.2.noarch.rpm"
RPM_HASH = "87b141163cf9744db816adf7141f9f73bf8524eba3408304f76bb0a0fa1e804ec8f3066f463614e27ad1cb80537a939d9b03baa4ce9aa75e37d2f92440573e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colortab-doc"

RDEPENDS:${PN} += ""

inherit rpm
