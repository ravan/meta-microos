SUMMARY = "Include Arduino or Processing code in LaTeX documents"
DESCRIPTION = "The first version of the package allows to include Arduino or \
Processing code using three different forms: writing the code \
directly in the LaTeX document writing Arduino or Processing \
commands in line with the text calling to Arduino or Processing \
files All these options support the syntax highlighting of the \
official IDE."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76924"

RPM_NAME = "texlive-maker-2026.226.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "cf69056b66be5e2d811f0d062974efdd9af181c4be82d0514c2a0399d968b56daf05ff440eac94bb21da9101fcb4df26fa85ca9f821a41770cd0fb42639aba60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maker.sty \
texlive-maker"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
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
