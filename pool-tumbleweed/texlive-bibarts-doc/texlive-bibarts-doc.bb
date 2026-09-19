SUMMARY = "Documentation for texlive-bibarts"
DESCRIPTION = "This package includes the documentation for texlive-bibarts"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.6svn74384"

RPM_NAME = "texlive-bibarts-doc-2026.226.2.6svn74384-61.2.noarch.rpm"
RPM_HASH = "27787405bbd13e7b251cf8c9462c7061c0e015c833b54dd4ea654e92344975c1183ffaa0d35b65c164c94a2600938f470be572373fe4d86ede7dcbd00345577d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bibarts-doc-de \
texlive-bibarts-doc"

RDEPENDS:${PN} += ""

inherit rpm
