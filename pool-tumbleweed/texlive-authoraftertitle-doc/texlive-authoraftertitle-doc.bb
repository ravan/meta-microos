SUMMARY = "Documentation for texlive-authoraftertitle"
DESCRIPTION = "This package includes the documentation for texlive-authoraftertitle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55889"

RPM_NAME = "texlive-authoraftertitle-doc-2026.226.1.0svn55889-60.2.noarch.rpm"
RPM_HASH = "711aedf4fa67cb4d85f0fa355ce61fad9a86b4fb4d035c74ce7c66d9701c7e7b1843ffa8e4f415c1f42b82a826c0bcd29e84a0331ccf1a24b14292db4bb0cc15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authoraftertitle-doc"

RDEPENDS:${PN} += ""

inherit rpm
