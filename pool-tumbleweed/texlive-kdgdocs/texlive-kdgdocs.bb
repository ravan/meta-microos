SUMMARY = "Document classes for Karel de Grote University College"
DESCRIPTION = "The bundle provides two classes for usage by KdG professors and \
master students: kdgcoursetext: for writing course texts, and \
kdgmasterthesis: for writing master's theses. The bundle \
replaces the original kdgcoursetext package (now removed from \
the archive)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24498"

RPM_NAME = "texlive-kdgdocs-2026.226.1.0svn24498-63.2.noarch.rpm"
RPM_HASH = "a322a14b83668e55e0f294c764caec6a846c5219f9ceb2742f5beeb3f270eb8dec679169dc42f735f6a08886f7677d82563b235c28c59686af31c67e0fcaa6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kdgcoursetext.cls \
tex-kdgmasterthesis.cls \
texlive-kdgdocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbright.sty \
tex-color.sty \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
