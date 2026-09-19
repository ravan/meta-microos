SUMMARY = "Documentation for texlive-gotoh"
DESCRIPTION = "This package includes the documentation for texlive-gotoh"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn44764"

RPM_NAME = "texlive-gotoh-doc-2026.226.1.1svn44764-60.4.noarch.rpm"
RPM_HASH = "07cf0e644bad38e4d06e0bf00a32707c20c8e47dd278f5b1eb9f2d3475be13565fe7735fae262853a3b1cb69690dee866b947342ba8b8d45f132e58a0f83ac71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gotoh-doc"

RDEPENDS:${PN} += ""

inherit rpm
