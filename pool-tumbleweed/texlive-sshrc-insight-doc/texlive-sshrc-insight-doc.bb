SUMMARY = "Documentation for texlive-sshrc-insight"
DESCRIPTION = "This package includes the documentation for texlive-sshrc-insight"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025.0.0svn76065"

RPM_NAME = "texlive-sshrc-insight-doc-2026.226.2025.0.0svn76065-64.2.noarch.rpm"
RPM_HASH = "c51205850b1e7e6d49d910d959bc26cd2c83f251a9abee2dde2779dc7f9453a59cd9c66fe8f51ef3018d7a39c56b7efb3900ba5c95379e7112837c5d23a6122d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sshrc-insight-doc"

RDEPENDS:${PN} += ""

inherit rpm
