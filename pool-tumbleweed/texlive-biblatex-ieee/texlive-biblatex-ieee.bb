SUMMARY = "IEEE style files for BibLaTeX"
DESCRIPTION = "This is a BibLaTeX style that implements the bibliography style \
of the IEEE for BibLaTeX. The implementation follows standard \
BibLaTeX conventions, and can be used simply by loading \
BibLaTeX with the appropriate option: \
\\usepackage[style=ieee]{biblatex} A demonstration database is \
provided to show how to format input for the style. \
biblatex-ieee requires BibLaTeX 2.7 or later, and works with \
both BibTeX and Biber as the database back-end."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4fsvn75952"

RPM_NAME = "texlive-biblatex-ieee-2026.226.1.4fsvn75952-61.2.noarch.rpm"
RPM_HASH = "2506623736f25dd6ff0f64cb339bac172b06293628d0befa8cdda747293fc42310613f3ec55c398747739c31d37d622d5a4ba6b70ba37e95fabfe3f5f9966858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ieee-alphabetic.bbx \
tex-ieee-alphabetic.cbx \
tex-ieee-comp.cbx \
tex-ieee.bbx \
tex-ieee.cbx \
tex-magyar-ieee.lbx \
texlive-biblatex-ieee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
tex-numeric-verb.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
