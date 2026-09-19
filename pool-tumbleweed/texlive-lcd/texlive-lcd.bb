SUMMARY = "Alphanumerical LCD-style displays"
DESCRIPTION = "A LaTeX package that will display text as on an (early) LCD \
display (the output is very visibly pixellated). Assumes 8-bit \
input in its internal verbatim-style environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn16549"

RPM_NAME = "texlive-lcd-2026.226.0.0.3svn16549-61.2.noarch.rpm"
RPM_HASH = "86db45ca7ce81871975f8a6a7fc384c1cd07c1f7bd5ef695756763000311d9bae7c7ce78e44df9585af8afcaa7711de6787d2fd398ad28130106193af21bfc30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lcd.sty \
texlive-lcd"

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
