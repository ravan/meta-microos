SUMMARY = "Documentation for texlive-signchart"
DESCRIPTION = "This package includes the documentation for texlive-signchart"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn39707"

RPM_NAME = "texlive-signchart-doc-2026.226.1.01svn39707-60.2.noarch.rpm"
RPM_HASH = "4f799afca77edc3154bd28e511a77d2087b48467e092e3a7806f234d00eaea003ed3ffd66cb7e22b121f7ab65efa7eb39e07545aa3310c44af69f5a5553a9298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-signchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
