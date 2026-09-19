SUMMARY = "Coloured boxes, for LaTeX examples and theorems, etcetera"
DESCRIPTION = "This package provides an environment for coloured and framed \
text boxes with a heading line. Optionally, such a box may be \
split in an upper and a lower part; thus the package may be \
used for the setting of LaTeX examples where one part of the \
box displays the source code and the other part shows the \
output. Another common use case is the setting of theorems. The \
package supports saving and reuse of source code and text \
parts. The package depends on the pgf, verbatim, environ, and \
etoolbox packages."
LICENSE = "LPPL-1.0"

PV = "2026.227.6.9.0svn77682"

RPM_NAME = "texlive-tcolorbox-2026.227.6.9.0svn77682-62.2.noarch.rpm"
RPM_HASH = "d901ae2b73979fedca006a727fead0b910ef2886e99dfd3af6106924b40d54ef7191a37069304d4eaabed4d5d38840f170eda32ce0c79b21143a35f458141b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tcbbreakable.code.tex \
tex-tcbdocumentation.code.tex \
tex-tcbexternal.code.tex \
tex-tcbfitting.code.tex \
tex-tcbhooks.code.tex \
tex-tcblistings.code.tex \
tex-tcblistingscore.code.tex \
tex-tcblistingsutf8.code.tex \
tex-tcbmagazine.code.tex \
tex-tcbminted.code.tex \
tex-tcbposter.code.tex \
tex-tcbprocessing.code.tex \
tex-tcbraster.code.tex \
tex-tcbskins.code.tex \
tex-tcbskinsjigsaw.code.tex \
tex-tcbtheorems.code.tex \
tex-tcbvignette.code.tex \
tex-tcbxparse.code.tex \
tex-tcolorbox.sty \
texlive-tcolorbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-etoolbox.sty \
tex-tikz.sty \
tex-verbatim.sty \
texlive \
texlive-environ \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm
