SUMMARY = "XMU thesis style"
DESCRIPTION = "This class is designed for XMU thesis's writing."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-2026.226.0.0.4.1svn56614-59.4.noarch.rpm"
RPM_HASH = "a9ef519555d7934506f083223d1ab33e87f7f3eb613b2de015ff2dfb97f463401fa2bca0ee9a23dcd81becbadf4e6f022998baf3acba57f0e06135386234bdc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xmulogo.sty \
tex-xmuthesis.cls \
texlive-xmuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-microtype.sty \
tex-nag.sty \
tex-scrlfile.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
