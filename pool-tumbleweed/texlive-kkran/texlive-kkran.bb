SUMMARY = "Generate answer fields in tests and exams"
DESCRIPTION = "A Lua- and TikZ-based package created for the Japanese \
education sector. It enables the arrangement of box-shaped \
answer fields in any desired combination using simple commands. \
It also facilitates the easy creation of multiple-choice answer \
sheets (mark sheets). Furthermore, it covers the functionality \
of toggling the display of model answers (solutions) via an \
option, and even the creation of grid-style answer fields \
(graph paper-like cells). The package name originates from 'Lan \
(:ran)', which means 'a small piece of area', or 'a small \
space'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.6svn78190"

RPM_NAME = "texlive-kkran-2026.226.1.1.6svn78190-63.2.noarch.rpm"
RPM_HASH = "58acf29d50cc2b38554062aa1b8eecbda4a869101774ddbcbdb789d7c063b8fa1514d6dde09372ed011cf67fa36e5bc08df129f7e0d3bac8da427d1bd146a600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-KKran.sty \
texlive-kkran"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-KKsymbols.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luatexja-fontspec.sty \
tex-luatexja-preset.sty \
tex-pgfkeys.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
