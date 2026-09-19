SUMMARY = "A CJK font family with a comprehensive character set"
DESCRIPTION = "The LXGW Font Family provides an open-source CJK font family \
with a comprehensive character set for Chinese \
(Simplified/Traditional), Cantonese, and Japanese. A 'fontset' \
configuration of this font family for the 'ctex-kit' is also \
provided in this package."
LICENSE = "OFL-1.1"

PV = "2026.226.1.521nsvn77682"

RPM_NAME = "texlive-lxgw-fonts-2026.226.1.521nsvn77682-59.2.noarch.rpm"
RPM_HASH = "0150d67f79b6afd4e3f33c5ff2c92d167dc75bae73b1735f52dd6ffe40fbed4bde2e8d6b49f637eeba7ed40b646fb20e3b53e3fb29de91404e06c2c0519ae3de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctex-fontset-lxgw.def \
tex-ctex-makespa-lxgw.tex \
tex-ctex-zhmap-lxgw.tex \
texlive-lxgw-fonts"

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
texlive-lxgw-fonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
