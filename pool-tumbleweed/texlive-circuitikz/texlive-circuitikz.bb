SUMMARY = "Draw electrical networks with TikZ"
DESCRIPTION = "The package provides a set of macros for naturally typesetting \
electrical and (somewhat less naturally, perhaps) electronic \
networks. It is designed as a tool that is easy to use, with a \
lean syntax, native to LaTeX, and directly supporting PDF \
output format. It has therefore been based on the very \
impressive PGF/TikZ package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8.5svn77600"

RPM_NAME = "texlive-circuitikz-2026.226.1.8.5svn77600-60.2.noarch.rpm"
RPM_HASH = "20c75ad07b7f353c40054b17b1ef4d8f04863580a60a8ef46f7930a4b5572d2b6592237e193a5d73a4e611e028abaad1a3a6b83d6db7a4aac06b8fb526737bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-circuitikz-0.4-body.tex \
tex-circuitikz-0.4.sty \
tex-circuitikz-0.6-body.tex \
tex-circuitikz-0.6.sty \
tex-circuitikz-0.7-body.tex \
tex-circuitikz-0.7.sty \
tex-circuitikz-0.8.3-body.tex \
tex-circuitikz-0.8.3.sty \
tex-circuitikz-0.9.3-body.tex \
tex-circuitikz-0.9.3.sty \
tex-circuitikz-0.9.6-body.tex \
tex-circuitikz-0.9.6.sty \
tex-circuitikz-1.0-body.tex \
tex-circuitikz-1.0.sty \
tex-circuitikz-1.1.2-body.tex \
tex-circuitikz-1.1.2.sty \
tex-circuitikz-1.2.7-body.tex \
tex-circuitikz-1.2.7.sty \
tex-circuitikz-1.4.6-body.tex \
tex-circuitikz-1.4.6.sty \
tex-circuitikz-1.7.2-body.tex \
tex-circuitikz-1.7.2.sty \
tex-circuitikz.sty \
tex-ctikzstyle-example.tex \
tex-ctikzstyle-legacy.tex \
tex-ctikzstyle-romano.tex \
tex-pgfcirc.defines.tex \
tex-pgfcircbipoles.tex \
tex-pgfcirccurrent.tex \
tex-pgfcircflow.tex \
tex-pgfcirclabel.tex \
tex-pgfcircmonopoles.tex \
tex-pgfcircmultipoles.tex \
tex-pgfcircpath.tex \
tex-pgfcircquadpoles.tex \
tex-pgfcircshapes.tex \
tex-pgfcirctripoles.tex \
tex-pgfcircutils.tex \
tex-pgfcircvoltage.tex \
tex-t-circuitikz-0.8.3.tex \
tex-t-circuitikz-0.9.3.tex \
tex-t-circuitikz-0.9.6.tex \
tex-t-circuitikz-1.0.tex \
tex-t-circuitikz-1.1.2.tex \
tex-t-circuitikz-1.2.7.tex \
tex-t-circuitikz-1.4.6.tex \
tex-t-circuitikz-1.7.2.tex \
tex-t-circuitikz.tex \
texlive-circuitikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-siunitx.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
