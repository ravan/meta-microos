SUMMARY = "Easily annotate math equations using TikZ"
DESCRIPTION = "This package provides commands that make it easy to highlight \
terms in equations and add annotation labels using TikZ. It \
should work with pdfLaTeX as well as LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn67044"

RPM_NAME = "texlive-annotate-equations-2026.226.0.0.2.2svn67044-61.2.noarch.rpm"
RPM_HASH = "b6af8964ea97cefce6b0eef85ad37103dc966c89669f0d0bc9f268b53f19c10ac1481100f512fa02f385efc2ccd49edbe4af1769d4408a57fef47640de865151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-annotate-equations.sty \
texlive-annotate-equations"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifluatex.sty \
tex-luatex85.sty \
tex-pdftexcmds.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
