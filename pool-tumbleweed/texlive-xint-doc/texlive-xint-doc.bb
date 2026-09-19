SUMMARY = "Documentation for texlive-xint"
DESCRIPTION = "This package includes the documentation for texlive-xint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4osvn76255"

RPM_NAME = "texlive-xint-doc-2026.226.1.4osvn76255-59.4.noarch.rpm"
RPM_HASH = "89fe89d69fffc331d329c8d547ab1053cb7d2e7a639255e54735c61ced7b78c21ed5c08b2c925cfcde2ade0c5dcf0d98a81d7d79c43c7ce3ee398023fc8748da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xint-doc"

RDEPENDS:${PN} += ""

inherit rpm
