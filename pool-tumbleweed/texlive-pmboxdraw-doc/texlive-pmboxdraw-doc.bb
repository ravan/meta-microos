SUMMARY = "Documentation for texlive-pmboxdraw"
DESCRIPTION = "This package includes the documentation for texlive-pmboxdraw"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-pmboxdraw-doc-2026.226.1.4svn77682-59.2.noarch.rpm"
RPM_HASH = "fd098726fbc56a981c4130055b09a79e985c8edc7dd3723e1693158280f6d8d0f693da58188936eb22857b5ce0c7e01ec9697b96747a6bd8d56eed278b4e84ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pmboxdraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
