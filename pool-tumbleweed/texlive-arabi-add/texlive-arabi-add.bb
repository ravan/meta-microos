SUMMARY = "Using hyperref and bookmark packages with arabic and farsi languages"
DESCRIPTION = "This package takes advantage of some of the possibilities that \
hyperref and bookmark packages offer when you create a table of \
contents for Arabic texts created by the arabi package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67573"

RPM_NAME = "texlive-arabi-add-2026.226.1.0svn67573-61.2.noarch.rpm"
RPM_HASH = "acd68ca94cec31cf4fc7adede043388ac7733708fd19d352b037c274872219b30a8e6d748a2213bf799cae47ee908b513bb6e370a10e36d47ff49610a51d95b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arabi-add.sty \
texlive-arabi-add"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-atveryend.sty \
tex-bookmark.sty \
tex-datatool.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
