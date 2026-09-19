SUMMARY = "Draw family trees"
DESCRIPTION = "Boxes describe individuals; lines connecting boxes represent \
sibling or parent-child relationships, or marriages. Excluding \
the marriage box, you can get a maleline/patrilineal tree, or a \
femaleline/matrilineal tree. For Japanese, the jlreq.cls \
vertical option (tate) is supported."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1svn63739"

RPM_NAME = "texlive-familytree-2026.226.3.1svn63739-59.2.noarch.rpm"
RPM_HASH = "6298499026f1c828d951de22b40840ebc5a9b1d900d026dbf8f6a74bf9374e29884280d275fa333017a27c479862d70455c1476a4d041a938283f15e867d4616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-familytree.sty \
texlive-familytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
