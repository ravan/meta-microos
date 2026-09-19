SUMMARY = "Documentation for texlive-pgfplotsthemebeamer"
DESCRIPTION = "This package includes the documentation for texlive-pgfplotsthemebeamer"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn71954"

RPM_NAME = "texlive-pgfplotsthemebeamer-doc-2026.226.0.0.2svn71954-58.2.noarch.rpm"
RPM_HASH = "8e415134614b9b86930da24fa8871dab975d7b25b2f417a053021d209d88c0a5c61ca8a5b19fa8f4b839b9ac62dfd847a6e3bf7a5195e94e6b1ac2ed6e91abff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfplotsthemebeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
