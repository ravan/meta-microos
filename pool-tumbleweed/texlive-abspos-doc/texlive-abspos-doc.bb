SUMMARY = "Documentation for texlive-abspos"
DESCRIPTION = "This package includes the documentation for texlive-abspos"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-abspos-doc-2026.226.0.0.1svn76924-61.2.noarch.rpm"
RPM_HASH = "156ec23a4ff0c198e8aa34a6368adb195b43bb2df6bbf6b43d904955bdb64e2250bb3ab2823fe24b1327495ee2a7d069aed25ee2bcc36c87ec8ef69d450db8da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abspos-doc"

RDEPENDS:${PN} += ""

inherit rpm
