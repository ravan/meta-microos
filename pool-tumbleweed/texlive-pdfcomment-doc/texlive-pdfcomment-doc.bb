SUMMARY = "Documentation for texlive-pdfcomment"
DESCRIPTION = "This package includes the documentation for texlive-pdfcomment"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4asvn77682"

RPM_NAME = "texlive-pdfcomment-doc-2026.226.2.4asvn77682-58.2.noarch.rpm"
RPM_HASH = "514f41cb68438e687131ac87a5ca5155cc7263213c9a51cc3ef3664b72403ba516222f4918fd53ebbb6de7bacffa047512759d76bf19107c8c1e119045f89d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pdfcomment-doc-en;de \
texlive-pdfcomment-doc"

RDEPENDS:${PN} += ""

inherit rpm
