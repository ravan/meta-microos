SUMMARY = "Spreadsheet features for LaTeX tabular environments"
DESCRIPTION = "The package allows the user to construct tables in a manner \
similar to a spreadsheet. The cells of a table have row and \
column indices and these can be used in formulas to generate \
values in other cells."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.61svn77682"

RPM_NAME = "texlive-spreadtab-2026.226.0.0.61svn77682-64.2.noarch.rpm"
RPM_HASH = "01622304f980396b6126685e1f0fb3ea611e4d14af05824c876fb93f89d4216ec89bf995ca43f1bcf3bdc0644459c98fb969f0feb126560e31aa998960096016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spreadtab.sty \
texlive-spreadtab"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
