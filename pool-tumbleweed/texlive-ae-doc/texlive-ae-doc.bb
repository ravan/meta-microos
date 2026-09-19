SUMMARY = "Documentation for texlive-ae"
DESCRIPTION = "This package includes the documentation for texlive-ae"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn15878"

RPM_NAME = "texlive-ae-doc-2026.226.1.4svn15878-61.2.noarch.rpm"
RPM_HASH = "22df2d88ef256a4f4d81ec1b5a8d05b84b1883ea9b7801e0a09024b666eb41c36722523f58346988cca4629078a2ca14506bb2110743b8ff5a41069348784f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ae-doc"

RDEPENDS:${PN} += ""

inherit rpm
