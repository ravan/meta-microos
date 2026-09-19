SUMMARY = "Documentation for texlive-pdfcprot"
DESCRIPTION = "This package includes the documentation for texlive-pdfcprot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7asvn18735"

RPM_NAME = "texlive-pdfcprot-doc-2026.226.1.7asvn18735-58.2.noarch.rpm"
RPM_HASH = "61f3f21c2aaf44b1d3a8f03ca99de3fb53e5ccc5e9a2b21497582a6639510f6f8054b2e4265a7cfecd14e3101b8b4056370b19fab6cf754074c2bd96b22a381a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcprot-doc"

RDEPENDS:${PN} += ""

inherit rpm
