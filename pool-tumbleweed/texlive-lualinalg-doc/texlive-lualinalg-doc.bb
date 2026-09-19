SUMMARY = "Documentation for texlive-lualinalg"
DESCRIPTION = "This package includes the documentation for texlive-lualinalg"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn76924"

RPM_NAME = "texlive-lualinalg-doc-2026.226.1.9svn76924-59.2.noarch.rpm"
RPM_HASH = "55b29bae8078aab79ef9092b080e7c38d7303ec35a91f24ba79ae5862eca9a82ace986abf2b1ff215ea3eb7130692180a312b02ac18e9af47d1533a9d9c58e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualinalg-doc"

RDEPENDS:${PN} += ""

inherit rpm
