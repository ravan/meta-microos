SUMMARY = "Documentation for texlive-biblatex-multiple-dm"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-multiple-dm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn37081"

RPM_NAME = "texlive-biblatex-multiple-dm-doc-2026.226.1.0.1svn37081-61.2.noarch.rpm"
RPM_HASH = "f2d2e148919011a47f68445fec51e4752284e6b6b9c56f239afdda1bd2de08a15586a81e7879565148a92c29ad37bff424164c38f072e8efc572dcc7964584f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-multiple-dm-doc"

RDEPENDS:${PN} += ""

inherit rpm
