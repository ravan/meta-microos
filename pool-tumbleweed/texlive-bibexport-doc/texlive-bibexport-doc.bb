SUMMARY = "Documentation for texlive-bibexport"
DESCRIPTION = "This package includes the documentation for texlive-bibexport"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.03svn50677"

RPM_NAME = "texlive-bibexport-doc-2026.226.3.03svn50677-61.2.noarch.rpm"
RPM_HASH = "938c2ba702b7b2704a0b2d8f402811c8e252737c07ca930c62d8a20e222f9f99c5c5b9baa129da38350952fe4718af5ef3de1476170e7ca719fe315c510a45f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibexport-doc"

RDEPENDS:${PN} += ""

inherit rpm
