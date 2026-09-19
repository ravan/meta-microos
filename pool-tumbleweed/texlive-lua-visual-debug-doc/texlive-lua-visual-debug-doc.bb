SUMMARY = "Documentation for texlive-lua-visual-debug"
DESCRIPTION = "This package includes the documentation for texlive-lua-visual-debug"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77803"

RPM_NAME = "texlive-lua-visual-debug-doc-2026.226.1.0svn77803-59.2.noarch.rpm"
RPM_HASH = "ad60948266503fc12119075d3799dfd992ed55ebeeb7e799397bf2a0b4d42e8b4e76ab59f2c1c50d7e4a1382913af83fd2e3b8a5219a017dc6a3ec07fc7dacdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-visual-debug-doc"

RDEPENDS:${PN} += ""

inherit rpm
