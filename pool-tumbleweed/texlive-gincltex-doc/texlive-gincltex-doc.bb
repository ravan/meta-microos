SUMMARY = "Documentation for texlive-gincltex"
DESCRIPTION = "This package includes the documentation for texlive-gincltex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-gincltex-doc-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "cf5bf7c74af10435c44b4d6ca02cc564f54c61b9be2a6962c230c0996c823086fae93b34b14096202757e1e8928ba2a2d7148c7abfc7f1ca1318fb776c77c34e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gincltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
