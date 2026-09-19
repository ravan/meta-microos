SUMMARY = "Provides a figure-like environment that break over pages"
DESCRIPTION = "The longfigure package uses and relabels components of the \
well-known longtable package, written by David Carlisle, to \
provide a table-like environment that can display a stream of \
figures as a single figure that can break across pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn34302"

RPM_NAME = "texlive-longfigure-2026.226.1.0svn34302-61.2.noarch.rpm"
RPM_HASH = "aea7c17a37afe82b8f6b80b299b2ef16dcde7d9fa21f97107a281c68d35148546c8ddb96c4772e528ceb9af3413c94709120769b92152bdb3a2b038e7e76269d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-longfigure.sty \
texlive-longfigure"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tocloft.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
