SUMMARY = "Typeset papers for the department of music, Osnabruck"
DESCRIPTION = "The package provides a LaTeX class for typesetting term papers \
at the institute of music and musicology of the University of \
Osnabruck, Germany, according to the specifications of Prof. \
Stefan Hahnheide. A BibLaTeX style is provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1dsvn24857"

RPM_NAME = "texlive-musuos-2026.226.1.1dsvn24857-61.2.noarch.rpm"
RPM_HASH = "badf3e4331171f625ccc1a557cf7b81d25838366926d5ab40dffc0dbb527f3c4092b3e6fed559c07ce0fb22cbb8e9c2ca686eb73ec6a1c5dc6ed69ee11e5365d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musuos.cls \
texlive-musuos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csquotes.sty \
tex-dblfnote.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-kpfonts.sty \
tex-kvoptions.sty \
tex-scrartcl.cls \
tex-setspace.sty \
tex-tgheros.sty \
tex-titletoc.sty \
tex-txfonts.sty \
tex-verse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
