SUMMARY = "Documentation for texlive-bibbreeze"
DESCRIPTION = "This package includes the documentation for texlive-bibbreeze"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-bibbreeze-doc-2026.226.1.1svn76924-61.2.noarch.rpm"
RPM_HASH = "d41f8300573a87790d47d4066cd69668ee8122245ad50fb1180582dfda4e9215ebe3b98e39d1897a4d9988cc93065ee8a91aa1253435a462b885094ec926dd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibbreeze-doc"

RDEPENDS:${PN} += ""

inherit rpm
