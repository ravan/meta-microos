SUMMARY = "Make Classic Cyrillic CM fonts accessible in LaTeX"
DESCRIPTION = "The package makes the classic CM Cyrillic fonts accessible for \
use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-lcyw-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "b0138804c6520ade8126e5bda65adffc7055d5e90f402c81a6865b8dbc376026c2f8bf1c916ba36432239865f147d5ed5f3884a1fbbd6de125a3d994e2fa9031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmap-cyr-vf.sty \
tex-lcywcmr.fd \
tex-lcywcmss.fd \
tex-lcywcmssq.fd \
tex-lcywcmtt.fd \
tex-lcywenc.def \
texlive-lcyw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
