SUMMARY = "A Greek font with a long history"
DESCRIPTION = "GFS Complutum derives, via a long development, from a \
minuscule-only font cut in the 16th century. An unsatisfactory \
set of majuscules were added in the early 20th century, but its \
author died before he could complete the revival of the font. \
The Greek Font Society has released this version, which has a \
new set of majuscules."
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-gfscomplutum-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "b6fdf297cd236c8ff2d11eefbf2fe1637352d1fc35c04c1da55e73eafa0185afbc9c0f2856dc08590a277d4c7c39428ad6484426b86257e3f5ef798f3b8fa2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gcomplutum8a.tfm \
tex-gcomplutum8a.vf \
tex-gcomplutum8r.tfm \
tex-gcomplutumo8a.tfm \
tex-gcomplutumo8a.vf \
tex-gcomplutumo8r.tfm \
tex-gfscomplutum.map \
tex-gfscomplutum.sty \
tex-gpcomplutum.enc \
tex-lgrcomplutum.fd \
texlive-gfscomplutum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfscomplutum-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
