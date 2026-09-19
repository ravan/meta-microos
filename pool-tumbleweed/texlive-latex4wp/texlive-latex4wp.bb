SUMMARY = "A LaTeX guide specifically designed for word processor users"
DESCRIPTION = "'LaTeX for Word Processor Users' is a guide that helps \
converting knowledge and techniques of word processing into the \
LaTeX typesetting environment. It aims at helping WP users use \
LaTeX instead."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.1.2svn68096"

RPM_NAME = "texlive-latex4wp-2026.226.1.2svn68096-61.2.noarch.rpm"
RPM_HASH = "0864c7914c9868ca2192fe8632fe86e5d8e0e7983214dd10218d9f61bbac4bbf203ac12cd0b4190345d1267b05109432eaf7e99667d76bf64d52dc78f1f10ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex4wp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
