SUMMARY = "Support for writing about xiangqi"
DESCRIPTION = "The package is for writing about xiangqi or chinese chess. You \
can write games or parts of games and show diagrams with \
special positions."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn78101"

RPM_NAME = "texlive-xq-2026.226.0.0.4svn78101-59.4.noarch.rpm"
RPM_HASH = "0004c0bd8a691fd1ab581a642a8a3c0dcd3ddaec18e200504f4d8a904c7057fa5713979f6eae2b7219f577ffd67391a96823649f9106811ce797077a979799fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xq.sty \
tex-xqlarge.tfm \
tex-xqnormal.tfm \
texlive-xq"

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
