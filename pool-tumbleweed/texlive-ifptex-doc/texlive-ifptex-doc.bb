SUMMARY = "Documentation for texlive-ifptex"
DESCRIPTION = "This package includes the documentation for texlive-ifptex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2csvn77682"

RPM_NAME = "texlive-ifptex-doc-2026.226.2.2csvn77682-60.2.noarch.rpm"
RPM_HASH = "74d95ae10368083e2a552461f53f02ad42c0ee487bc5b4ff9c3b82d0ee8b677c1eb885e5f640b7d44b262d06c2e119c3b629c68015a06162557267960f94af80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ifptex-doc-ja \
texlive-ifptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
