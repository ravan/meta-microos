SUMMARY = "Commands for inserting annotations"
DESCRIPTION = "This package defines a few LaTeX commands that may be useful \
when you proofread a LaTeX document. They allow you to easily \
highlight text and add comments in the margin. Vim escape \
sequences are provided for inserting or removing these LaTeX \
commands in the source. Options are provided for displaying the \
document with extra line spacing, and for displaying it in \
either corrected or uncorrected state, both without margin \
notes. The package is based on code for a text highlighting \
command that was published by Antal Spector-Zabusky on \
https://tex.stackexchange.com/questions/5959. The main file, \
proofread.dtx, is self-extracting, so you can generate the \
style file by compiling proofread.dtx with pdfLaTeX. This \
package is based on the soul package; so if you plan to \
highlight non-ASCII characters, you must compile your source \
with either XeTeX- or LuaTeX-based compilers."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn61719"

RPM_NAME = "texlive-proofread-2026.226.1.04svn61719-59.2.noarch.rpm"
RPM_HASH = "a47596fe657a0330235f86e5df5ceeed7d29c83c697e6365d83e050d945f5794873f31a23388c91e8202d3f074f0c4795e18f747d05a84840f4e431bd1cc9604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proofread.sty \
texlive-proofread"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-marginnote.sty \
tex-setspace.sty \
tex-soul.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
