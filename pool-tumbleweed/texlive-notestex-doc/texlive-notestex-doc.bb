SUMMARY = "Documentation for texlive-notestex"
DESCRIPTION = "This package includes the documentation for texlive-notestex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn45396"

RPM_NAME = "texlive-notestex-doc-2026.226.1.0svn45396-61.2.noarch.rpm"
RPM_HASH = "4acc5c6a86ad6eb32e4743422c169238d068077a2616639e55f8c417063b62f5ea9049a4cddfa00a50f23d2630575857b4425889e3933a4929c2acb2e685eb07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notestex-doc"

RDEPENDS:${PN} += ""

inherit rpm
