SUMMARY = "LaTeX3 programming conventions"
DESCRIPTION = "The l3kernel bundle provides an implementation of the LaTeX3 \
programmers' interface, as a set of packages that run under \
LaTeX2e. The interface provides the foundation on which the \
LaTeX3 kernel and other future code are built: it is an API for \
TeX programmers. The packages are set up so that the LaTeX3 \
conventions can be used with regular LaTeX2e packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77438"

RPM_NAME = "texlive-l3kernel-2026.226.svn77438-63.2.noarch.rpm"
RPM_HASH = "24595dc09867317f983e3558985c38875abad15db2b478dff76453078cc7a6cf92b746c907d7e8516cae51c90c170dfa3b4ab2b48cd528e4e75ed16a749e2ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expl3-code.tex \
tex-expl3-generic.tex \
tex-expl3.sty \
tex-l3debug.def \
tex-l3doc.cls \
tex-l3docstrip.tex \
tex-l3str-enc-iso88591.def \
tex-l3str-enc-iso885910.def \
tex-l3str-enc-iso885911.def \
tex-l3str-enc-iso885913.def \
tex-l3str-enc-iso885914.def \
tex-l3str-enc-iso885915.def \
tex-l3str-enc-iso885916.def \
tex-l3str-enc-iso88592.def \
tex-l3str-enc-iso88593.def \
tex-l3str-enc-iso88594.def \
tex-l3str-enc-iso88595.def \
tex-l3str-enc-iso88596.def \
tex-l3str-enc-iso88597.def \
tex-l3str-enc-iso88598.def \
tex-l3str-enc-iso88599.def \
texlive-l3kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-doc.sty \
tex-fontenc.sty \
tex-hypdoc.sty \
tex-lmodern.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-lua-uni-algos \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
