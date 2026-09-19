SUMMARY = "BibLaTeX bibliography support for publication lists"
DESCRIPTION = "The package provides a BibLaTeX bibliography style file (*.bbx) \
for publication lists. The style file draws on BibLaTeX's \
authoryear style, but provides some extra features often \
desired for publication lists, such as the omission of the \
author's own name from author or editor data. At least version \
3.4 of biblatex is required."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn77682"

RPM_NAME = "texlive-biblatex-publist-2026.226.2.16svn77682-61.2.noarch.rpm"
RPM_HASH = "a0c7d92eb83af5927d3ba92a65401c15767e66860d8378b0bce1181252ddd75ff42b20c038d607348db8933e3b79b1e927ee922c13c355a7ee93cd3eddaa7d38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UKenglish-publist.lbx \
tex-USenglish-publist.lbx \
tex-american-publist.lbx \
tex-australian-publist.lbx \
tex-austrian-publist.lbx \
tex-british-publist.lbx \
tex-canadian-publist.lbx \
tex-english-publist.lbx \
tex-french-publist.lbx \
tex-german-publist.lbx \
tex-greek-publist.lbx \
tex-naustrian-publist.lbx \
tex-newzealand-publist.lbx \
tex-ngerman-publist.lbx \
tex-nswissgerman-publist.lbx \
tex-publist.bbx \
tex-publist.cbx \
tex-swissgerman-publist.lbx \
texlive-biblatex-publist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-austrian.lbx \
tex-british.lbx \
tex-english.lbx \
tex-german.lbx \
tex-numeric.cbx \
tex-pict2e.sty \
tex-swissgerman.lbx \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
