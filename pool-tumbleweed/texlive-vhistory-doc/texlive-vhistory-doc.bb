SUMMARY = "Documentation for texlive-vhistory"
DESCRIPTION = "This package includes the documentation for texlive-vhistory"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8.0svn61719"

RPM_NAME = "texlive-vhistory-doc-2026.226.1.8.0svn61719-60.2.noarch.rpm"
RPM_HASH = "8c3758a869d682ed6af0b308faf71215da22970c7c9934d9792116c7b7a3b286cf8c18b731ce9a7e004f52129cd9f46f8dfbd12a5efda1cfed7504309339c556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-vhistory-doc-de \
texlive-vhistory-doc"

RDEPENDS:${PN} += ""

inherit rpm
