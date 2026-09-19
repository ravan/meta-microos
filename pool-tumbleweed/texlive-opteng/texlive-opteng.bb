SUMMARY = "SPIE Optical Engineering and OE Letters manuscript template"
DESCRIPTION = "With this template, and associated style and LaTeX packages, it \
is possible to estimate the page length of manuscripts for \
submission to the SPIE journals 'Optical Engineering' and \
'Optical Engineering Letters'. With a strict three-page limit, \
this is particularly important for the latter. The template \
gives simple instructions on how to prepare the manuscript."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn27331"

RPM_NAME = "texlive-opteng-2026.226.1.0svn27331-61.2.noarch.rpm"
RPM_HASH = "2556d4150957d5532bbd3573807fa2902471593c20e4db39962510c02f13fb1c7cdd613c782bae30e366aa23b3ccbd58c22cd4d4f34923f01bd81cf1bcb6d1b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-opteng.sty \
texlive-opteng"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fancybox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-overcite.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
