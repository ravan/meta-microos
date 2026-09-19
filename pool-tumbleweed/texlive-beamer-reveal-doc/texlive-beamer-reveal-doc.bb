SUMMARY = "Documentation for texlive-beamer-reveal"
DESCRIPTION = "This package includes the documentation for texlive-beamer-reveal"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.09svn77675"

RPM_NAME = "texlive-beamer-reveal-doc-2026.226.1.09svn77675-61.2.noarch.rpm"
RPM_HASH = "8ccd7b1fc4c037c2b8ca45f5707dffa78aa5d5562796c13049e4a5730b965fb6b433d8149ca08631955bf9a2e31310709fd745b381c32103d44127921f354a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamer-reveal-doc"

RDEPENDS:${PN} += ""

inherit rpm
