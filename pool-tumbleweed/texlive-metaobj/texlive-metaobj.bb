SUMMARY = "MetaPost package providing high-level objects"
DESCRIPTION = "METAOBJ is a large MetaPost package providing high-level \
objects. It implements many of PSTricks' features for node \
connections, but also trees, matrices, and many other things. \
It more or less contains boxes.mp and rboxes.mp. There is a \
large (albeit not complete) documentation distributed with the \
package. It is easily extensible with new objects."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.93svn15878"

RPM_NAME = "texlive-metaobj-2026.226.0.0.93svn15878-61.2.noarch.rpm"
RPM_HASH = "0841ad1588907743db195d4628a199f64eb8fe44e2e6b170657939219c998a9a92ea067b47c053b158778d678277d050d16acbdc20970283c21f7cd833ebaffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metaobj"

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
