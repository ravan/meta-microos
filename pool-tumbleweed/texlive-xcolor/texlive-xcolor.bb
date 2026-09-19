SUMMARY = "Driver-independent color extensions for LaTeX and pdfLaTeX"
DESCRIPTION = "The package starts from the basic facilities of the color \
package, and provides easy driver-independent access to several \
kinds of color tints, shades, tones, and mixes of arbitrary \
colors. It allows a user to select a document-wide target color \
model and offers complete tools for conversion between eight \
color models. Additionally, there is a command for alternating \
row colors plus repeated non-aligned material (like horizontal \
lines) in tables. Colors can be mixed like \
\\color{red!30!green!40!blue}."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.02svn77682"

RPM_NAME = "texlive-xcolor-2026.226.3.02svn77682-59.4.noarch.rpm"
RPM_HASH = "a31a24309de2071bdc855f25cbe3f1b21aeefc6197a662556b52edf95da71b83b2bd0576761565aa19f43cf99d7848f12d861ae884e3a6a9929f2d9633ef1033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svgnam.def \
tex-x11nam.def \
tex-xcolor-2022-06-12.sty \
tex-xcolor.sty \
texlive-xcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-colortbl.sty \
tex-pdfcolmk.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
