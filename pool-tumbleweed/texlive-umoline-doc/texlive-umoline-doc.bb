SUMMARY = "Documentation for texlive-umoline"
DESCRIPTION = "This package includes the documentation for texlive-umoline"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19085"

RPM_NAME = "texlive-umoline-doc-2026.226.svn19085-60.2.noarch.rpm"
RPM_HASH = "4b4b44c6b9f711a91650f7f1eab8b64e0c5e1a69e061a4c7accbca5b1c0b0be42497a0f22e97ac01cf1e7465f85b47b2006aeea425ff067a7b5dbb1682be48c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umoline-doc"

RDEPENDS:${PN} += ""

inherit rpm
