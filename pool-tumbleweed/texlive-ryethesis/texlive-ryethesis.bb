SUMMARY = "Class for Ryerson University Graduate School requirements"
DESCRIPTION = "The class offers support for formatting a thesis, dissertation \
or project according to Ryerson University's School of Graduate \
Studies thesis formatting regulations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.36svn76924"

RPM_NAME = "texlive-ryethesis-2026.226.1.36svn76924-60.2.noarch.rpm"
RPM_HASH = "3d16025eeb7ab61c045069173c97aca64fb4c456d85086c9d64fc15d90e3561af9850e4e0aeba4c696a6d49cdf5ac7c1bf498190eb599ff49b38e11f374224bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ryethesis.cls \
texlive-ryethesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-glossaries.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-nomencl.sty \
tex-setspace.sty \
tex-vmargin.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
