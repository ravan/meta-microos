SUMMARY = "Documentation for texlive-protex"
DESCRIPTION = "This package includes the documentation for texlive-protex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn41633"

RPM_NAME = "texlive-protex-doc-2026.226.svn41633-59.2.noarch.rpm"
RPM_HASH = "520f5e58ffcffffb4b11829b60f8bca960fbd6737d4815f348cc7d751d6f77836710d5be2141a507860445a00ee06d6412444fa81c46c5f645af9069d99eb445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-protex-doc"

RDEPENDS:${PN} += ""

inherit rpm
