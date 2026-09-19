SUMMARY = "Documentation for texlive-protocol"
DESCRIPTION = "This package includes the documentation for texlive-protocol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn25562"

RPM_NAME = "texlive-protocol-doc-2026.226.1.13svn25562-59.2.noarch.rpm"
RPM_HASH = "04300a13722a8dbe9b135df6a161ad88cc1928342a30fe60263e00d3ac735c23fdf2a9826ef523928026bede685044d8b890422bc2ee7df2a634f4117d761895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-protocol-doc-en;de \
texlive-protocol-doc"

RDEPENDS:${PN} += ""

inherit rpm
