SUMMARY = "Documentation for texlive-bithesis"
DESCRIPTION = "This package includes the documentation for texlive-bithesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.8.7svn77337"

RPM_NAME = "texlive-bithesis-doc-2026.226.3.8.7svn77337-59.2.noarch.rpm"
RPM_HASH = "234c60f56c5b128981c6659c54886df9f17b0659db0db865e0fcc91c06c5336c504f6afef2d6c76026ad04dd66e8734cf5b06982e9b46e95543f884b66240e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bithesis-doc-zh \
texlive-bithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
