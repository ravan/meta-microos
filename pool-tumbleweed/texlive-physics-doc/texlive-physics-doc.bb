SUMMARY = "Documentation for texlive-physics"
DESCRIPTION = "This package includes the documentation for texlive-physics"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn74247"

RPM_NAME = "texlive-physics-doc-2026.226.1.3svn74247-58.2.noarch.rpm"
RPM_HASH = "8288af0f34f9cb41f365378fcef7a0647df30fbce0d939a20ab0c6554ab310228425c81ebe007c57309ea5bd5c15f512dd1f3e7c5e76b4bd3ce5aa31c6dc7bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physics-doc"

RDEPENDS:${PN} += ""

inherit rpm
