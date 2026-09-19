SUMMARY = "Draw chip pinouts with TikZ"
DESCRIPTION = "The package provides a set of macros for typesetting electronic \
chip pinouts. It is designed as a tool that is easy to use, \
with a lean syntax, native to LaTeX, and directly supporting \
PDF output format. It has therefore been based on the very \
impressive TikZ package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn55966"

RPM_NAME = "texlive-pinoutikz-2026.226.1.1.2svn55966-58.2.noarch.rpm"
RPM_HASH = "83bf9519477ceae8abb50f1dc20965939d6940f3b709c72f34a75e1a0de2e6943938a6c3f3be51fc6f1609de8dd3d2c4238b367217d747190f5627477f745a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pinoutikz.sty \
texlive-pinoutikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-arrayjob.sty \
tex-forarray.sty \
tex-ifthen.sty \
tex-lmodern.sty \
tex-pgf.sty \
tex-tikz.sty \
tex-upquote.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
