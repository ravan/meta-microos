SUMMARY = "Typeset IMS conference proceedings"
DESCRIPTION = "The class typesets papers for IMS (Iranian Mathematical \
Society) conference proceedings. The class uses the XePersian \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29803"

RPM_NAME = "texlive-imsproc-2026.226.0.0.1svn29803-60.2.noarch.rpm"
RPM_HASH = "cbf42edbce0e8b9155acdbc241eb25e62d0013703e9f8b43101884319e4cea5fd1f21cf3cc2945fc16ffcdecf038218fa36fec5e019c020843942836cdbc8b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imsproc.cls \
texlive-imsproc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
