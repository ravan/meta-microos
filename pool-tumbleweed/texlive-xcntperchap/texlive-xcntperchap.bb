SUMMARY = "Track the number of subsections etc. that occur in a specified tracklevel"
DESCRIPTION = "This package is the successor of cntperchap and allows to \
provide more tracklevels than just only one."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn54080"

RPM_NAME = "texlive-xcntperchap-2026.226.0.0.5svn54080-59.4.noarch.rpm"
RPM_HASH = "8b94093ee82dcd2c0ae8e043deef0fe324518a064ea03b1cd3f3d7f4f7593bc3989f3f0c6553f2337ac3f2f420c99d4413d903d645d4a0a50168f163132d2d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcntperchap.sty \
texlive-xcntperchap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xassoccnt.sty \
tex-xparse.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
