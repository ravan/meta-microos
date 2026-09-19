SUMMARY = "Documentation for texlive-omgtudoc-asoiu"
DESCRIPTION = "This package includes the documentation for texlive-omgtudoc-asoiu"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn74183"

RPM_NAME = "texlive-omgtudoc-asoiu-doc-2026.226.1.1bsvn74183-61.2.noarch.rpm"
RPM_HASH = "38a7ede22bcc8b1f3b163ac54c3e2513a988c484f7c8fd8a9c94a4dce81641dad5555a10c46c00e1191326ce7db1de9001dfb057835295e0d57585ca317b2c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-omgtudoc-asoiu-doc-ru \
texlive-omgtudoc-asoiu-doc"

RDEPENDS:${PN} += ""

inherit rpm
