SUMMARY = "Good-looking slide decks a la PowerPoint (PPT)"
DESCRIPTION = "This LaTeX package helps you create slide decks as good-looking \
as with PowerPointtm, but more precise, uniform, and visually \
strict. Check this series of lectures fully designed with the \
use of this package."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.0svn76559"

RPM_NAME = "texlive-ppt-slides-2026.226.0.0.6.0svn76559-59.2.noarch.rpm"
RPM_HASH = "4295e51af4aedc196b052ffa0029372223777ea98e001a530e0f10b0d6ff67fabc6b71e8bc89ec9a1eb067244622b9afd7e9da9d5ef58766959f54ff6e903489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ppt-9x6.tex \
tex-ppt-dark-mono.tex \
tex-ppt-dark.tex \
tex-ppt-light-mono.tex \
tex-ppt-light.tex \
tex-ppt-slides.sty \
texlive-ppt-slides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-crumbs.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-href-ul.sty \
tex-ifthen.sty \
tex-pagecolor.sty \
tex-pgfopts.sty \
tex-qrcode.sty \
tex-seqsplit.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-varwidth.sty \
tex-xcolor.sty \
texlive \
texlive-anyfontsize \
texlive-changepage \
texlive-crumbs \
texlive-enumitem \
texlive-filesystem \
texlive-fontsize \
texlive-hardwrap \
texlive-href-ul \
texlive-ifoddpage \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lastpage \
texlive-listings \
texlive-pagecolor \
texlive-pgf \
texlive-pgfopts \
texlive-qrcode \
texlive-scripts \
texlive-scripts-bin \
texlive-seqsplit \
texlive-soul \
texlive-textpos \
texlive-tikzpagenodes \
texlive-titling \
texlive-varwidth \
texlive-xcolor"

inherit rpm
