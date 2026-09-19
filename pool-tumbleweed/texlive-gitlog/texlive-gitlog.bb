SUMMARY = "Typesetting git changelogs"
DESCRIPTION = "This package allows git change log history to be incorporated \
into LaTeX documents; the log data is obtained from the git \
distributed version control system. The current release \
(0.0.beta) is a proof-of-concept release to allow users an \
early evaluation and to attract ideas and support. Requests and \
suggestions, as well as code contributions are welcome."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.betasvn38932"

RPM_NAME = "texlive-gitlog-2026.226.0.0.0.betasvn38932-60.4.noarch.rpm"
RPM_HASH = "10ccfa2aaeea82adb05a277011dbe5b5318dc9d895bfad98c032a218b24c6721b8dfa945a3880668c5600a414e8dc57691594bcf08e2d816311065bab8954586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitlog.bbx \
tex-gitlog.sty \
texlive-gitlog"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
