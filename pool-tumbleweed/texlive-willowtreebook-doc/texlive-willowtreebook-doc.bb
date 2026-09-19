SUMMARY = "Documentation for texlive-willowtreebook"
DESCRIPTION = "This package includes the documentation for texlive-willowtreebook"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn60638"

RPM_NAME = "texlive-willowtreebook-doc-2026.226.1.03svn60638-60.2.noarch.rpm"
RPM_HASH = "37a7245df6d78c7fa98e3fe7582208936242fa029e0db53abdd7a30b8b651e1340e4d12a91ad747431b31dc202955de94afd4527a6116a28c240578be9c8e29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-willowtreebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
