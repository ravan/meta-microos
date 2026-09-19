SUMMARY = "Simpler Wick contractions"
DESCRIPTION = "In every quantum field theory course, there will be a chapter \
about Wick's theorem and how it can be used to convert a very \
large product of many creation and annihilation operators into \
something more tractable and normal ordered. The contractions \
are denoted with a square bracket over the operators which are \
being contracted, which used to be rather annoying to typeset \
in LaTeX as the only other package available was simplewick, \
which is rather unwieldy. This package provides a simpler \
syntax for Wick contractions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn71991"

RPM_NAME = "texlive-simpler-wick-2026.226.1.0.0svn71991-60.2.noarch.rpm"
RPM_HASH = "e7c7cdde833e48982976dccd1c044c95f651ad7c42d21141a4e639a3778012b799e63955a29c9f315906f2dce637547932228fe89c0979e28cda04a0bbce90b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simpler-wick.sty \
texlive-simpler-wick"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
