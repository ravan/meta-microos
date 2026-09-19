SUMMARY = "Documentation for texlive-fifo-stack"
DESCRIPTION = "This package includes the documentation for texlive-fifo-stack"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn33288"

RPM_NAME = "texlive-fifo-stack-doc-2026.226.1.0svn33288-59.2.noarch.rpm"
RPM_HASH = "69850ed121ce1fc882bf21a56d72fbdc951f8bb83104a76037405983506027ded3f22d0e4057c775ae6e2df6d0ee21fd88b5dd888ff40d224ac9feed2967d344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fifo-stack-doc"

RDEPENDS:${PN} += ""

inherit rpm
