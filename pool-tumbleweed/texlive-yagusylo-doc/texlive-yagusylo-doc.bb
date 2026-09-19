SUMMARY = "Documentation for texlive-yagusylo"
DESCRIPTION = "This package includes the documentation for texlive-yagusylo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn29803"

RPM_NAME = "texlive-yagusylo-doc-2026.226.1.2svn29803-59.4.noarch.rpm"
RPM_HASH = "07e4cf8aaed7fb67047e143a9a81416887d95f63d9b147c4fb9a2dd2bac07887b9767603f9b4b016affac1c371887294a99567d84c677b026d2a625de36142b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yagusylo-doc-fr;en \
texlive-yagusylo-doc"

RDEPENDS:${PN} += ""

inherit rpm
