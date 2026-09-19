SUMMARY = "Typeset articles using KorigamiK's document class"
DESCRIPTION = "The KorigamiK class is used for typesetting documents for \
university or school projects and lab reports. It is based on \
the article class with modifications to allow for more flexible \
front-matter among other small changes."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn71991"

RPM_NAME = "texlive-korigamik-2026.226.1.0svn71991-63.2.noarch.rpm"
RPM_HASH = "0f7437cead65980c2b5d14bee8fe92beedc3e92ef3f16b331ab2fa2333e670a3d15988c5f505b553dbc7c76ea3318c575f556a515061017a3d01eccf348ba124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-korigamik.cls \
texlive-korigamik"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lmodern.sty \
tex-mathpazo.sty \
tex-microtype.sty \
tex-textcomp.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
