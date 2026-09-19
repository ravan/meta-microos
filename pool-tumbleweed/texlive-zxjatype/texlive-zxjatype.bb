SUMMARY = "Standard conforming typesetting of Japanese, for XeLaTeX"
DESCRIPTION = "The zxjatype package"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-zxjatype-2026.226.0.0.7svn77682-59.4.noarch.rpm"
RPM_HASH = "f7f2dc5f885b4bc4651357caa6f772c6af55d435d756fafefca00dc208f4fa2645e960da63c5910be3bf5a61d20b69ff99befaa7ae9173e79d3fb795d302eb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zxjatype.sty \
texlive-zxjatype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifxetex.sty \
tex-xeCJK.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
