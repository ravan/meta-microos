SUMMARY = "TikZ-based Japanese-style notebook ruled lines for LaTeX"
DESCRIPTION = "Typeset Japanese-style ruled notebook lines in LaTeX. It \
supports full-page (\\notefill) and short (\\note) blocks. \
Spacing, dot size, and color are adjustable. The package is \
compatible with multicols."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn77255"

RPM_NAME = "texlive-keisennote-2026.226.1.2.0svn77255-63.2.noarch.rpm"
RPM_HASH = "64ebde7ba6db2d44f38edc1544933995ffc54e5d86c9c7fcc2e7b4de0f1ad56640137f463aedab43d47a3c369a7473adf4d370177163d0f5dcef0d09c89ae19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keisennote.sty \
texlive-keisennote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-zref-savepos.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
