SUMMARY = "Hyperref support for pLaTeX"
DESCRIPTION = "This package adjusts the behavior of hyperref on (u)pLaTeX so \
that authors can properly create PDF documents that contain \
document information in Japanese."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn77682"

RPM_NAME = "texlive-pxjahyper-2026.226.1.5svn77682-60.4.noarch.rpm"
RPM_HASH = "35074724e4a8f6c9b241f16839e0f594eff3e68b37005dcdca405d4b5a555fbb9467a54fb82366e9a64f43d5d0aa56665382ef45e5758ac0c466485a4326d4b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxjahyper-ajm.def \
tex-pxjahyper-enc.sty \
tex-pxjahyper-uni.def \
tex-pxjahyper.sty \
texlive-pxjahyper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-bxjatoucs.sty \
tex-etoolbox.sty \
tex-keyval.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
