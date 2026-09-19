SUMMARY = "Terminal-style code display with ANSI colors, UTF-8 box-drawing, and dark/light themes"
DESCRIPTION = "The terminalcode package provides authentic terminal-style code \
display environments for LaTeX documents. It features UTF-8 \
box-drawing characters, comprehensive ANSI 16-color support \
with dynamic dark and light themes, and seamless integration \
with external code files. Requires LuaLaTeX or XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.9.0svn76729"

RPM_NAME = "texlive-terminalcode-2026.227.0.0.9.0svn76729-62.2.noarch.rpm"
RPM_HASH = "0f4e5978bd7069584e18f418e24df6b93465221b9563f82674df44168a3ddd27a17f1b11b9e24ec1096db88a8c5ad02dc048aa05898751c1e46d33f6e17697ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-terminalcode.sty \
texlive-terminalcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ctex.sty \
tex-fontspec.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
