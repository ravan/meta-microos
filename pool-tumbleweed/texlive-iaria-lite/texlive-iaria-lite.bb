SUMMARY = "Write documents for the IARIA publications"
DESCRIPTION = "This package provides a convenient environment for writing \
IARIA (International Academy, Research, and Industry \
Association) scholary publications. It does not implement the \
specifications for the IARIA citation style, for which you have \
to use the iaria class."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78138"

RPM_NAME = "texlive-iaria-lite-2026.226.0.0.9.1svn78138-60.2.noarch.rpm"
RPM_HASH = "fd6420f37563266756ee1ecac67e4b353b71fd2ccaf6ffdcb08db5b29b8dced9de10999d9c3b15c651a9d7b2ea5ad99a06ae984e8237ece5c07f30e96688fcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iaria-lite.cls \
texlive-iaria-lite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-IEEEtran.cls \
tex-caption.sty \
tex-etoolbox.sty \
tex-extdash.sty \
tex-floatrow.sty \
tex-flushend.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-orcidlink.sty \
tex-pbalance.sty \
tex-subcaption.sty \
tex-subfig.sty \
tex-times.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
