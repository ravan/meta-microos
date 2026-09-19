SUMMARY = "Print two virtual pages on each physical page"
DESCRIPTION = "MiKTeX and many other TeX implementations include tools for \
massaging PostScript into booklet and two-up printing -- that \
is, printing two logical pages side by side on one side of one \
sheet of paper. However, some LaTeX preliminaries are necessary \
to use those tools. The twoup package provides such \
preliminaries and gives advice on how to use the PostScript \
tools."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn15878"

RPM_NAME = "texlive-twoup-2026.226.1.3svn15878-59.2.noarch.rpm"
RPM_HASH = "bad086235e3c7b18e339107f3e75c7d6e1882f2b7725f60f69ac519e76a7ed0712b8825a467c371a71ddcb0dc12e9514ea13cce960a96010508d46b2db594ab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-twoup.sty \
texlive-twoup"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
