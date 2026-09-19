SUMMARY = "Documentation for texlive-akshar"
DESCRIPTION = "This package includes the documentation for texlive-akshar"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn76924"

RPM_NAME = "texlive-akshar-doc-2026.226.0.0.2svn76924-61.2.noarch.rpm"
RPM_HASH = "a611b3bf27488d32eaf7868bc995d39d5a91f0069c2cc34b102373b994d94ab4c0412398866169b3da6ac9979355707d71527f3e470e5f8b81185136177c84f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-akshar-doc"

RDEPENDS:${PN} += ""

inherit rpm
