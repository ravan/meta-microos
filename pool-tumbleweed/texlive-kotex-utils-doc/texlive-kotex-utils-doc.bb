SUMMARY = "Documentation for texlive-kotex-utils"
DESCRIPTION = "This package includes the documentation for texlive-kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn38727"

RPM_NAME = "texlive-kotex-utils-doc-2026.226.2.1.0svn38727-63.2.noarch.rpm"
RPM_HASH = "d1b9e59de10bf8b790e3b375a3fa191d2c6a6bb1d187185611eaa03a54ee9e2e091678968f60f2bd165e10b2b00833c2ff3fad32012f6fb06801a898c01b0b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
