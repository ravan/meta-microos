SUMMARY = "Documentation for texlive-tetragonos"
DESCRIPTION = "This package includes the documentation for texlive-tetragonos"
LICENSE = "LPPL-1.0"

PV = "2026.227.1svn49732"

RPM_NAME = "texlive-tetragonos-doc-2026.227.1svn49732-62.2.noarch.rpm"
RPM_HASH = "4aca0fd145e7003b0c3f4419c6bd08a10ddcb0071db74f8fa14ec32a5f1e4feaa863444138cb567fd68f34036d8078bab66fac6a21a766260485a7dc909b3f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tetragonos-doc-zh \
texlive-tetragonos-doc"

RDEPENDS:${PN} += ""

inherit rpm
