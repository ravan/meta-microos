SUMMARY = "Some symbols which are not easily available"
DESCRIPTION = "This package is named oPlotSymbl and it includes symbols, which \
are not easily available. Especially, these symbols are used in \
scientific plots, but the potential user is allowed to use them \
in other ways. This package uses TikZ and xcolor."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn44951"

RPM_NAME = "texlive-oplotsymbl-2026.226.1.4svn44951-61.2.noarch.rpm"
RPM_HASH = "fce1683d413adb800ede578d874c8129ee879e3e5130d29275cd203701883903ccb0c400353bb705f28f2e2632f1b0eab891e1e0d662c82371a7b24fc447f8f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oplotsymbl.sty \
texlive-oplotsymbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
