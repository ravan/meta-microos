SUMMARY = "Daily planner type calendar"
DESCRIPTION = "Prints two six-monthly vertical-type daily planner (i.e., \
months along the top, days downwards), with each 6-month period \
fitting onto a single A4 (or US letter) sheet. The package \
offers support for English, French, German, Spanish and \
Portuguese. The previous scheme of annual updates has now been \
abandoned, in favour of a Perl script yplan that generates a \
year's planner automatically. (The last manually-generated \
LaTeX file remains on the archive.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn34398"

RPM_NAME = "texlive-yplan-2026.226.svn34398-59.4.noarch.rpm"
RPM_HASH = "c6447ec624808075c371848a1b4ac4aa13b1c709802186b66c7706e2d1806e8504b8d048049151176ac4e2b073703023280a67ef6cc705323fed1e3969c5ff03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yplan.sty \
texlive-yplan"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yplan-bin"

inherit rpm
