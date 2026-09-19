SUMMARY = "Typeset Karnaugh maps using TikZ"
DESCRIPTION = "The tikz-karnaugh package is a LaTeX package used to draw \
Karnaugh maps. It uses TikZ to produce high quality graph from \
1 to 12 variables, but this upper limit depends on the TeX \
memory usage and can be different for you. It is very good for \
presentation since TikZ allows for a better control over the \
final appearance of the map. You can control colour, styles and \
distances. It can be considered as an upgrade and extension of \
Andreas W. Wieland's karnaugh package towards TikZ supporting. \
Upgrade because uses TikZ for more option on typesetting and \
overall higher quality. Extension because it also supports \
American style and inputting the values as they would appear in \
the map or in the truth table. Complex maps with solution \
(implicants) pointed out can be generated with external java \
software (see documentation for details). It supports both \
American and traditional (simplified labels) styles and from \
version 1.3 on American style is natively supported, therefore, \
no more addition work is required to typeset Gray coded labels, \
variable names etc. From version 1.4, two new macros allow \
typesetting a map much more similarly as it should appear. \
Original order, as the values appear in the truth table, still \
being supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn62040"

RPM_NAME = "texlive-tikz-karnaugh-2026.226.1.5svn62040-59.2.noarch.rpm"
RPM_HASH = "658755635a0ebc3ff8df9196eaa86018d5a4fa9aa0d56295eb0224218d44a8fa37c38ca46de47c5c5a487c868ac167e8b7980574e99939f0d592bad95bd858bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarykarnaugh.code.tex \
texlive-tikz-karnaugh"

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
