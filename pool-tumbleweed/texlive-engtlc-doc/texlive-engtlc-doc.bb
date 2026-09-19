SUMMARY = "Documentation for texlive-engtlc"
DESCRIPTION = "This package includes the documentation for texlive-engtlc"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn28571"

RPM_NAME = "texlive-engtlc-doc-2026.226.3.2svn28571-61.4.noarch.rpm"
RPM_HASH = "d2bb858a129da6def610c540dfbe6a4bdf9c0f5b2c97c8eb3b79b7a4541c46e73e8ebfdccdfd9a32e97197a8a121355f26f192837f7e1554e3a2f5e8f01c65be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-engtlc-doc-en;it \
texlive-engtlc-doc"

RDEPENDS:${PN} += ""

inherit rpm
