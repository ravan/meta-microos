SUMMARY = "Documentation for texlive-hduthesis"
DESCRIPTION = "This package includes the documentation for texlive-hduthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn76924"

RPM_NAME = "texlive-hduthesis-doc-2026.226.1.1.1svn76924-60.4.noarch.rpm"
RPM_HASH = "6ede07e0310836ed70444e55d819652f4bd8e0107ba803446042e4a8e6bf2e3a43bdcc2d2395731ec93dc671bb73aa2713c495ece144d9513efe6ef3a2cdd746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hduthesis-doc-zh \
texlive-hduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
