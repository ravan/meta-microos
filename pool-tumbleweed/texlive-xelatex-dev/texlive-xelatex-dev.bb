SUMMARY = "Package xelatex-dev"
DESCRIPTION = "The xelatex-dev package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71363"

RPM_NAME = "texlive-xelatex-dev-2026.226.svn71363-59.4.noarch.rpm"
RPM_HASH = "c7e56762f7a95e540473377c75b33295cf56959810b06e410000aeab54c8b76243011d9ece2a7fe1610de5385c1e1226900d997e4f4f8b8ea0577ed54f095f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xelatex-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-babel \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend-dev \
texlive-l3kernel-dev \
texlive-latex-base-dev \
texlive-latex-firstaid-dev \
texlive-latex-fonts \
texlive-lm \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-xelatex-dev-bin \
texlive-xetex"

inherit rpm
