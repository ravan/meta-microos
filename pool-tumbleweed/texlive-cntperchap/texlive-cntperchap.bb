SUMMARY = "Store counter values per chapter"
DESCRIPTION = "This package stores values of counters (which have been \
registered beforehand) on a per chapter base and provides the \
values on demand in the 2nd LaTeX compilation run. In this way \
it is possible to know how many sections etc. there are lying \
ahead and to react to these counter values, if needed. This is \
a preliminary version that has been tested with book.cls, \
memoir.cls, and scrbook.cls. The packages assoccnt (by the same \
author) and xparse are needed as well."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn37572"

RPM_NAME = "texlive-cntperchap-2026.226.0.0.3svn37572-60.2.noarch.rpm"
RPM_HASH = "2b977a2ae3a8f18b14a0994b371e3cf06164a515d600b8b3e6e9726fc7e0cb1fca97d394a56245880d39cb41eb97726fbf3c661da8cdf5b5480717fded564272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cntperchap.sty \
texlive-cntperchap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-assoccnt.sty \
tex-ifthen.sty \
tex-morewrites.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
