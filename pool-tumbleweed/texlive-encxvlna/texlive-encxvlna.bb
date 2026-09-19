SUMMARY = "Insert nonbreakable spaces, using encTeX"
DESCRIPTION = "The package provides tools for inserting nonbreakable spaces \
after nonsyllabic prepositions and single letter conjunctions \
as required by Czech and Slovak typographical rules. It is \
implemented using encTeX and provides files both for plain TeX \
and LaTeX. The LaTeX solution tries to avoid conflicts with \
other packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn34087"

RPM_NAME = "texlive-encxvlna-2026.226.1.1svn34087-61.4.noarch.rpm"
RPM_HASH = "57e8a1574486afcbd0c2921c69fa4a3af8350e217a6bf7653fba179edeae13d675800fb99525e4ebfc967beea8ff6f41447803faf7592a548156ff43e951be8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-encxvlna.sty \
tex-encxvlna.tex \
texlive-encxvlna"

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
