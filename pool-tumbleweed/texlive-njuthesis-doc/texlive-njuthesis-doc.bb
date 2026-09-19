SUMMARY = "Documentation for texlive-njuthesis"
DESCRIPTION = "This package includes the documentation for texlive-njuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.3svn76924"

RPM_NAME = "texlive-njuthesis-doc-2026.226.1.4.3svn76924-61.2.noarch.rpm"
RPM_HASH = "4db96a291d4b65004d42b935ff3a3120ad5c894ed6316bdccf5af1895356332cf7521a5b6b8f3290c61dc227f81c59a8230bb69488a269f63e1e489c535755c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-njuthesis-doc-zh \
texlive-njuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
