SUMMARY = "Documentation for texlive-topletter"
DESCRIPTION = "This package includes the documentation for texlive-topletter"
LICENSE = "Apache-1.0"

PV = "2026.226.0.0.3.0svn48182"

RPM_NAME = "texlive-topletter-doc-2026.226.0.0.3.0svn48182-59.2.noarch.rpm"
RPM_HASH = "0782888b71bae327375fa7725b2cc96108cb1cccd36abddc2756767036e5c109d467b1e4c6a0af5016ff1a725141a707f6221c9489bcb38e32f8d9e484fab3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-topletter-doc-it \
texlive-topletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
