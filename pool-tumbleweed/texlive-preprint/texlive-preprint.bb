SUMMARY = "A bundle of packages provided 'as is'"
DESCRIPTION = "The bundle comprises: authblk, which permits footnote style \
author/affiliation input in the \\author command, balance, to \
balance the end of \\twocolumn pages, figcaps, to send figure \
captions, etc., to end document, fullpage, to set narrow page \
margins and set a fixed page style, and sublabel, which permits \
counters to be subnumbered."
LICENSE = "LPPL-1.0"

PV = "2026.226.2011svn30447"

RPM_NAME = "texlive-preprint-2026.226.2011svn30447-59.2.noarch.rpm"
RPM_HASH = "e8518ba875f72dc32f4a9e062ff6d7247e0e1336f49f2db53dfd2ce662b6633c6d79f0352f4497b2450daed7e5555ef31ce9862ec248f81bfc352c1eecd07c26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authblk.sty \
tex-balance.sty \
tex-figcaps.sty \
tex-fullpage.sty \
tex-sublabel.sty \
texlive-preprint"

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
