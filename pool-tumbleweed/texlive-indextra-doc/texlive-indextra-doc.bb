SUMMARY = "Documentation for texlive-indextra"
DESCRIPTION = "This package includes the documentation for texlive-indextra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21.6svn76924"

RPM_NAME = "texlive-indextra-doc-2026.226.0.0.21.6svn76924-60.2.noarch.rpm"
RPM_HASH = "5a38e0fa4f8773e8711eddbb414a25caa11bbd425c568bd04bf1c9d082c7b889f6f06e2c97e0b64fd3edf9d2fcb9b5aa77513f812c9ff36c292d6e2c7a5b7a24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-indextra-doc"

RDEPENDS:${PN} += ""

inherit rpm
