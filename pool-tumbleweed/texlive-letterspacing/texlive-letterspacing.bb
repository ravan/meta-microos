SUMMARY = "Letter spacing"
DESCRIPTION = "Space out the letters of text; the command is \
\\letterspace<\\hbox modifier>{<text>}: the text is placed in an \
\\hbox of the specified size, and space is inserted between each \
glyph to make the text fit the box. Note that letterspacing is \
not ordinarily considered acceptable in modern typesetting of \
English."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn54266"

RPM_NAME = "texlive-letterspacing-2026.226.svn54266-61.2.noarch.rpm"
RPM_HASH = "f85e5e6d2438ffababc47dc619b7e0f1d6481aebcb29cda725c13fcc8766eed437b3b9977668baf798923fe2c9f1cc9f5826bfc83482143fc03fac4ca3d70780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letterspacing.tex \
texlive-letterspacing"

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
