SUMMARY = "Documentation for texlive-tikz-shields"
DESCRIPTION = "This package includes the documentation for texlive-tikz-shields"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn76593"

RPM_NAME = "texlive-tikz-shields-doc-2026.226.1.0svn76593-59.2.noarch.rpm"
RPM_HASH = "41bed0c26f1bf5900965c7a922e1d3b797b81b8505093998c53e92afa88e89d9345ed3b165266551f60c953051f1a67e07e112780d5d45fee9a6d9821b6f0a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-shields-doc"

RDEPENDS:${PN} += ""

inherit rpm
