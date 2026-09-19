SUMMARY = "Documentation for texlive-dox"
DESCRIPTION = "This package includes the documentation for texlive-dox"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn46011"

RPM_NAME = "texlive-dox-doc-2026.226.2.4svn46011-59.2.noarch.rpm"
RPM_HASH = "835080c6fc0f174381fc1ec0d575121aba1ae0b384ee130625c977c6f4e3188dabf5f9ca6051be7dc208cc790a64b4a0bad27960f5676690d74a4d8c27fa22be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dox-doc"

RDEPENDS:${PN} += ""

inherit rpm
