SUMMARY = "Universal inputenc, fontenc, and babel for pdfLaTeX and LuaLaTeX"
DESCRIPTION = "This package provides a LaTeX style file which makes it easy to \
use input encoding (UTF-8 by default, can be changed), \
fontspec.sty (optional), font encoding (T1 if fontspec.sty is \
not used), babel (English language by default), hyphenation, \
underline (with soul.sty), default text and math fonts \
(Computer Modern or Times), and paper sizes correctly with both \
pdfLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn49729"

RPM_NAME = "texlive-latex-uni8-2026.226.0.0.03svn49729-63.2.noarch.rpm"
RPM_HASH = "7d0f40acec3a59ce2d12d54e4eac8891194366a5160e9504b44ba3030a2ba54d7f06fb09cc55a61ad93f8d93769bc788ea69106527b9d319e909236d3fbf6163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uni8.sty \
texlive-latex-uni8"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontspec.sty \
tex-lmodern.sty \
tex-mathptmx.sty \
tex-soul.sty \
tex-soulutf8.sty \
tex-tgcursor.sty \
tex-tgheros.sty \
tex-tgtermes.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
