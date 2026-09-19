SUMMARY = "Documentation for texlive-ifthenx"
DESCRIPTION = "This package includes the documentation for texlive-ifthenx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-doc-2026.226.0.0.1asvn25819-60.2.noarch.rpm"
RPM_HASH = "459a62b36f1970fff2510c39b20524e8198dc6230b5263900237941eda1d43921a1c6cc46b3dbece8d413e1458399fd8bae255fd7f8688baf17e29ede7681871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifthenx-doc"

RDEPENDS:${PN} += ""

inherit rpm
