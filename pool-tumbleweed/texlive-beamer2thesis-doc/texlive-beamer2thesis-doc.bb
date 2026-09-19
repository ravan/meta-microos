SUMMARY = "Documentation for texlive-beamer2thesis"
DESCRIPTION = "This package includes the documentation for texlive-beamer2thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn72949"

RPM_NAME = "texlive-beamer2thesis-doc-2026.226.2.2svn72949-61.2.noarch.rpm"
RPM_HASH = "8914d5b7b363a063b34ef1a96d4aa7ffcc45084e2a70b237aafcacec1cfc0b8fdf13715a9e355d41325bcc810698c40685a94a1a3c32ed4e2faf52919d476327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamer2thesis-doc-en;it \
texlive-beamer2thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
