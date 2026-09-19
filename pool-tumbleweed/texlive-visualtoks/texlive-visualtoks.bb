SUMMARY = "Typeset TeXbook-style visualisations of token lists"
DESCRIPTION = "This package provides the \\visualtoks command to display \
arbitrary list of tokens, for pedagogical or debugging \
purposes, in a style inspired by Knuth's TeXbook. The package \
may be used in plain TeX or LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn76207"

RPM_NAME = "texlive-visualtoks-2026.226.1.1bsvn76207-60.2.noarch.rpm"
RPM_HASH = "5072d72f534e319f560407c8b225307940a5e988044c232c5160b68a90176eb69c282069b711f5e2de9a6c884f13b4114dab6824fe5d4faeea3e9198d93c2203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-visualtoks.sty \
tex-visualtoks.tex \
texlive-visualtoks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tokmap.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
