SUMMARY = "Documentation for texlive-rub-kunstgeschichte"
DESCRIPTION = "This package includes the documentation for texlive-rub-kunstgeschichte"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn73739"

RPM_NAME = "texlive-rub-kunstgeschichte-doc-2026.226.0.0.5.0svn73739-60.2.noarch.rpm"
RPM_HASH = "179a5e08b38f480a33c9c37e5801295d85be6bb6847a5427fb3fbd864e7c3c89331de53959ab970472a6addcec334b146b17dc1bb438695ea1e3d53154fc028f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rub-kunstgeschichte-doc"

RDEPENDS:${PN} += ""

inherit rpm
