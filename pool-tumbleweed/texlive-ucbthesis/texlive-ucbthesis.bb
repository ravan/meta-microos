SUMMARY = "Thesis and dissertation class supporting UCB requirements"
DESCRIPTION = "The class provides the necessary framework for electronic \
submission of Masters theses and Ph.D. dissertations at the \
University of California, Berkeley. It is based on the memoir \
class."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn51690"

RPM_NAME = "texlive-ucbthesis-2026.226.3.6svn51690-59.2.noarch.rpm"
RPM_HASH = "e1c1e50745d483fb19553c76677cb89f72c00e051ef0826db0ee62dc1ace714d6ba2ba7ad611fa90649aedc6420f879585b0f0404f8496ab40b3d8346a204dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ucbthesis.cls \
texlive-ucbthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-memoir.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
